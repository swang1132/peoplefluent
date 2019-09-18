package com.peoplefluent.interview;

public class Product {
    private double _price;
    private String  _name;
    private int _units = 0;

    public Product () {
        this._name = "";
        this._price = 0.00;
    }

    public Product (String name, double price) {
        this._name = name;
        this._price = price;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double _price) {
        this._price = _price;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public int getUnits() {
        return _units;
    }

    public String getValues() {
        return "Price : " + this._price + " " + "Units : " + this._units;
    }

    public void setUnits(int _units) {
        this._units = _units;
    }
}
