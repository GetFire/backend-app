package com.angularspring.getfire.domain.customer;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer extends AbstractEntity {
    private boolean juridical;
    private boolean supplier;
    private boolean conflicted;
    private String name;
    @OneToMany(mappedBy = "customer")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Phone> phones;
    @OneToMany(mappedBy = "customer")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Email> emails;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "customers_addresses", joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "address_id"))
    private Address address;
    @Embedded
    private Discount discount;

    public Customer(String name, List<Phone> phones) {
        this.name = name;
        this.phones = phones;
    }

    public Customer() {
        this.name = "Test";
        this.phones = new ArrayList<>();
    }


    @Override
    public String toString() {
        return "Customer{" +
                "juridical=" + juridical +
                ", supplier=" + supplier +
                ", conflicted=" + conflicted +
                ", name='" + name + '\'' +
                ", phones=" + phones +
                ", emails=" + emails +
                ", address=" + address +
                ", discount=" + discount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (juridical != customer.juridical) return false;
        if (supplier != customer.supplier) return false;
        if (conflicted != customer.conflicted) return false;
        if (name != null ? !name.equals(customer.name) : customer.name != null) return false;
        if (phones != null ? !phones.equals(customer.phones) : customer.phones != null) return false;
        if (emails != null ? !emails.equals(customer.emails) : customer.emails != null) return false;
        if (address != null ? !address.equals(customer.address) : customer.address != null) return false;
        return discount != null ? discount.equals(customer.discount) : customer.discount == null;
    }

    @Override
    public int hashCode() {
        int result = (juridical ? 1 : 0);
        result = 31 * result + (supplier ? 1 : 0);
        result = 31 * result + (conflicted ? 1 : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (phones != null ? phones.hashCode() : 0);
        result = 31 * result + (emails != null ? emails.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        return result;
    }

    public boolean isJuridical() {
        return juridical;
    }

    public void setJuridical(boolean juridical) {
        this.juridical = juridical;
    }

    public boolean isSupplier() {
        return supplier;
    }

    public void setSupplier(boolean supplier) {
        this.supplier = supplier;
    }

    public boolean isConflicted() {
        return conflicted;
    }

    public void setConflicted(boolean conflicted) {
        this.conflicted = conflicted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
