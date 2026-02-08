/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author MAC
 */

import factory.*;
import strategy.*;
import decorator.*;

public class MainApp {
    public static void main(String[] args) {

        // Factory Pattern
        Product product = ProductFactory.createProduct("book");
        System.out.println("Product Selected: " + product.getName());

        // Strategy Pattern
        Order order = new Order();
        order.setStrategy(new CashPayment());
        order.processPayment(1500);
        
        // Decorator Pattern
        OrderComponent basicOrder = new BasicOrder();
        System.out.println("Base Price: " + basicOrder.getCost());

        OrderComponent decoratedOrder = new GiftWrapDecorator(basicOrder);
        decoratedOrder = new DeliveryDecorator(decoratedOrder);
        System.out.println("Final Price: " + decoratedOrder.getCost());
    }
}
