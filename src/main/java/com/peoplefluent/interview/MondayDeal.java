package com.peoplefluent.interview;

import java.util.Map;

public class MondayDeal implements CheckoutDeal {

    @Override
    public double ApplyDeal(Map<String, Product> items) {
        double totals = 0.00;
        if (items != null) for (Map.Entry<String, Product> entry : items.entrySet()) {
            double discount = 1.00;
            Product prod = entry.getValue();
            System.out.println("Price : " + prod.getPrice() + " " + "Units : " + prod.getUnits());
            switch(prod.getName()) {
                case "Apple" : discount = 0.50; break;
                case "Orange" : discount = 0.33; break;
                default: break;
            }
            totals += prod.getPrice() * prod.getUnits() * discount;
        }
        else {
            System.out.println("Empty shopping cart !!");
        }
        return totals;
    }
}