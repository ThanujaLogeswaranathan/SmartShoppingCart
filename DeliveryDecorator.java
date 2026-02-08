/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author MAC
 */

public class DeliveryDecorator extends OrderDecorator {
    public DeliveryDecorator(OrderComponent order) {
        super(order);
    }

    public double getCost() {
        return order.getCost() + 300;
    }
}
