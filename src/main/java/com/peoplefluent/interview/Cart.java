package com.peoplefluent.interview;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    protected Map<String, Product> items = new HashMap<>();

    public void AddProduct(Product newProc) {
        if (!items.containsKey(newProc.getName())) {
            items.put(newProc.getName(), newProc);
        }
        newProc.setUnits(newProc.getUnits() + 1);
    }

    public Map<String, Product> GetInventory() {
        return items;
    }
    public void ShowInventory() {
        for(Map.Entry<String, Product> entry: items.entrySet()) {
            Product prod = (Product)entry.getValue();
            System.out.println(entry.getKey() + " => " + prod.getValues());
        }
    }



}
