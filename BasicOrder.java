/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author MAC
 */

public class BasicOrder implements OrderComponent {
    public double getCost() {
        return 1000;
    }
}
