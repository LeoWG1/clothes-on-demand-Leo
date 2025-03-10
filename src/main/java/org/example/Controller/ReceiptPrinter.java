package org.example.Controller;

import org.example.Model.OrderManagement.Receipt;

public class ReceiptPrinter {
    private final Receipt receipt = new Receipt();

    public void printPantsReceipt(String size, String material, String color,
                                  String fit, double length, double price){

        receipt.setName("__Kvitto på Byxor__");
        System.out.println(receipt.getName());
        System.out.println("Storlek: " + size);
        System.out.println("Material: " + material);
        System.out.println("Färg: " + color);
        System.out.println("Fit: " + fit);
        System.out.println("Längd: " + length);
        System.out.println();
        System.out.println("Total Kostnad: " + price + " SEK");
    }

    public void printSkirtReceipt(String size, String material, String color,
                                  double waistline, String pattern, double price){
        receipt.setName("__Kvitto på Kjol__");
        System.out.println(receipt.getName());
        System.out.println("Storlek: " + size);
        System.out.println("Material: " + material);
        System.out.println("Färg: " + color);
        System.out.println("Midjelängd: " + waistline);
        System.out.println("Mönster: " + pattern);
        System.out.println();
        System.out.println("Total Kostnad: " + price + " SEK");
    }

    public void printTShirtReceipt(String size, String material, String color,
                                   String sleeves, String neck, double price){
        receipt.setName("__Kvitto på T-shirt__");
        System.out.println(receipt.getName());
        System.out.println("Storlek: " + size);
        System.out.println("Material: " + material);
        System.out.println("Färg: " + color);
        System.out.println("Ärm-stil: " + sleeves);
        System.out.println("Nack-stil: " + neck);
        System.out.println();
        System.out.println("Total Kostnad: " + price + " SEK");
    }
}
