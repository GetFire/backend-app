package com.angularspring.getfire.domain.customer;

public enum PhoneType {

    MOBILE, HOME, WORK;

    public static void main(String[] args) {
        PhoneType phone = PhoneType.HOME;
        System.out.println(phone);
    }
}
