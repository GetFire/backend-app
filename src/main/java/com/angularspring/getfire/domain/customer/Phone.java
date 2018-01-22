package com.angularspring.getfire.domain.customer;

import javax.persistence.*;

@Entity
@Table(name = "phones")
public class Phone extends AbstractEntity {

    private String number;

    @ManyToOne(fetch = FetchType.EAGER)
    private Customer customer;

    @Embedded
    private PhoneType phoneType;


    public Phone(String number, Customer customer, PhoneType phoneType) {
        this.number = number;
        this.customer = customer;
        this.phoneType = phoneType;
    }

    public Phone() {

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", customer=" + customer +
                ", phoneType=" + phoneType +
                '}';
    }
}
