package com.peoplefluent.interview;

import java.util.Map;

public class RegularDeal implements CheckoutDeal {

    @Override
    public double ApplyDeal(Map<String, Product> items) {
        double totals = 0.00;
        if (items != null) for (Map.Entry<String, Product> entry : items.entrySet()) {
            Product prod = entry.getValue();
            System.out.println("Price : " + prod.getPrice() + " " + "Units : " + prod.getUnits());
            totals += prod.getPrice() * prod.getUnits();
        }
        else {
            System.out.println("Empty shopping cart !!");
        }
        return totals;
    }
}
