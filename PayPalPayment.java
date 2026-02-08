/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author MAC
 */

public class PayPalPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid via PayPal: Rs." + amount);
    }
}
