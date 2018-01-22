package com.angularspring.getfire.domain.customer;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emails")
public class Email extends AbstractEntity {

    private String address;
    @ManyToOne(fetch = FetchType.EAGER)
    private Customer customer;

    public Email() {
    }

    public Email(String address, Customer customer) {
        this.address = address;
        this.customer = customer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Email{" +
                "address='" + address + '\'' +
                ", customer=" + customer +
                '}';
    }
}
