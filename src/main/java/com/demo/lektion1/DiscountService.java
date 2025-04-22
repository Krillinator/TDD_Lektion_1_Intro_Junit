package com.demo.lektion1;

public class DiscountService {

    public double sum;
    public double discount;

    public double applyDiscount() {

        if (sum >= 500) {
            return sum * (1 - discount / 100);
        } else {
            return sum;
        }
    }

}
