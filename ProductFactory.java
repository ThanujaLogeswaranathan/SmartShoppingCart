/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author MAC
 */

public class ProductFactory {
    public static Product createProduct(String type) {
        if(type.equalsIgnoreCase("book")) {
            return new Book();
        } else if(type.equalsIgnoreCase("electronics")) {
            return new Electronics();
        }
        return null;
    }
}
