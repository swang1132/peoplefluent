package com.peoplefluent.interview;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckOut {

    private Cart _aCart;
    private Set<CheckoutDeal> _sales = new HashSet<>();

    public CheckOut(Cart aCart, CheckoutDeal deal) {
        this._aCart = aCart;
        this._sales.add(deal);
    }

    public double caculateTotals() {
        double totals = 0.00;
        if (this._aCart != null) {
            Map<String, Product> items = this._aCart.GetInventory();
            for (CheckoutDeal sale : this._sales) {
                totals += sale.ApplyDeal(items);
            }
        }
        return totals;
    }
}
