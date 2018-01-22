package com.angularspring.getfire.domain.customer;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Discount {
    @Column(name = "discount_size")
    private double size;

    public Discount(double size) {
        this.size = size;
    }

    public Discount() {
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "size=" + size +
                '}';
    }
}


