package com.peoplefluent.interview;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Set;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void CreateCart() {

        // Build a shopping cart
        Cart myCart = new Cart();
        Product apple = new Product("Apple", 0.65);
        Product orange = new Product("Orange", 0.20);

        myCart.AddProduct(apple);
        myCart.AddProduct(orange);
        myCart.AddProduct(orange);
        myCart.AddProduct(apple);
        myCart.AddProduct(orange);
        myCart.AddProduct(apple);
        myCart.AddProduct(orange);

        // Dump the content of the shopping cart
        myCart.ShowInventory();
    }

    @Test
    public void TestRegularCheckout() {

        // Build a shopping cart
        Cart myCart = new Cart();
        Product apple = new Product("Apple", 0.65);
        Product orange = new Product("Orange", 0.20);

        myCart.AddProduct(apple);
        myCart.AddProduct(orange);
        myCart.AddProduct(orange);
        myCart.AddProduct(apple);
        myCart.AddProduct(orange);
        myCart.AddProduct(apple);
        myCart.AddProduct(orange);
        myCart.AddProduct(apple);
        myCart.AddProduct(orange);

        // Create a regular checkout
        RegularDeal regularDeal = new RegularDeal();
        CheckOut checkout = new CheckOut(myCart, regularDeal);
        double costs = checkout.caculateTotals();
        System.out.println("Total costs of the shopping cart (Regular) is : " + costs);
    }

    @Test
    public void TestMondaySaleCheckout() {

        // Build a shopping cart
        Cart myCart = new Cart();
        Product apple = new Product("Apple", 0.65);
        Product orange = new Product("Orange", 0.20);

        myCart.AddProduct(apple);
        myCart.AddProduct(orange);
        myCart.AddProduct(orange);
        myCart.AddProduct(apple);
        myCart.AddProduct(orange);
        myCart.AddProduct(apple);
        myCart.AddProduct(orange);
        myCart.AddProduct(apple);
        myCart.AddProduct(orange);

        // Create a regular checkout
        MondayDeal mondayDeal = new MondayDeal();
        CheckOut mondayCheckout = new CheckOut(myCart, mondayDeal);
        double costs = mondayCheckout.caculateTotals();
        System.out.println("Total costs of the shopping cart (Monday Sale) is : " + costs);
    }
}
