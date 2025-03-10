package org.example.Controller;

import org.example.Model.OrderManagement.Order;
import org.example.Model.People.CEO;
import org.example.Model.Products.DesignPatterns.*;
import org.example.Model.Products.Pants;
import org.example.Model.Products.Skirt;
import org.example.Model.Products.TShirt;

public class OrderManager {
    private Order order;
    private final CEO ceo = new CEO();

    // Places order, also starts building pants-object, and decorates last with Command-pattern
    public void placePantsOrder(String size, String material, String color,
                                String fit, double length, double price){

        order = new Order();
        order.addPropertyChangeListener(ceo);
        order.setStatus("plagg tillverkas"); // Notifies CEO of start of production
        PantsBuilder pantsBuilder = new PantsBuilder();
        // Builder adds attributes
        pantsBuilder.addSize(size)
                .addMaterial(material)
                .addColor(color);

        Pants pants = pantsBuilder.build(); // Creates/builds pants object with the attributes
        System.out.println("Syr till storlek: " + pants.getSize() +"...");
        System.out.println("Skapar med material: " + pants.getMaterial() +"...");
        System.out.println("Färgen blir: " + pants.getColor() +"...");

        // Command-pattern that adds the last two attributes, fit & length.
        ProductDecorationExecutor productDecorationExecutor = new ProductDecorationExecutor();
        productDecorationExecutor.addCommand(new PantsCommand(pants, fit, length));
        productDecorationExecutor.executeCommands();

        order.setStatus("plagg klar");

        ReceiptPrinter receiptPrinter = new ReceiptPrinter();
        receiptPrinter.printPantsReceipt(pants.getSize(), pants.getMaterial(),
                                        pants.getColor(), pants.getFit(),
                                        pants.getLength(), price);
    }

    public void placeSkirtOrder(String size, String material, String color,
                                double waistline, String pattern, double price){

        order = new Order();
        order.addPropertyChangeListener(ceo);
        order.setStatus("plagg tillverkas");

        SkirtBuilder skirtBuilder = new SkirtBuilder();

        skirtBuilder.addSize(size)
                .addMaterial(material)
                .addColor(color);

        Skirt skirt = skirtBuilder.build();
        System.out.println("Syr till storlek: " + skirt.getSize() +"...");
        System.out.println("Skapar med material: " + skirt.getMaterial() +"...");
        System.out.println("Färgen blir: " + skirt.getColor() +"...");

        ProductDecorationExecutor productDecorationExecutor = new ProductDecorationExecutor();
        productDecorationExecutor.addCommand(new SkirtCommand(skirt, waistline, pattern));
        productDecorationExecutor.executeCommands();

        order.setStatus("plagg klar");

        ReceiptPrinter receiptPrinter = new ReceiptPrinter();
        receiptPrinter.printSkirtReceipt(skirt.getSize(), skirt.getMaterial(),
                skirt.getColor(), skirt.getWaistline(),
                skirt.getPattern(), price);

    }

    public void placeTShirtOrder(String size, String material, String color,
                                 String sleeves, String neck, double price){
        order = new Order();
        order.addPropertyChangeListener(ceo);
        order.setStatus("plagg tillverkas");

        TShirtBuilder tShirtBuilder = new TShirtBuilder();

        tShirtBuilder.addSize(size)
                .addMaterial(material)
                .addColor(color);

        TShirt tShirt = tShirtBuilder.build();
        System.out.println("Syr till storlek: " + tShirt.getSize() +"...");
        System.out.println("Skapar med material: " + tShirt.getMaterial() +"...");
        System.out.println("Färgen blir: " + tShirt.getColor() +"...");

        ProductDecorationExecutor productDecorationExecutor = new ProductDecorationExecutor();
        productDecorationExecutor.addCommand(new TShirtCommand(tShirt, sleeves, neck));
        productDecorationExecutor.executeCommands();

        order.setStatus("plagg klar");

        ReceiptPrinter receiptPrinter = new ReceiptPrinter();
        receiptPrinter.printTShirtReceipt(tShirt.getSize(), tShirt.getMaterial(),
                tShirt.getColor(), tShirt.getSleeves(),
                tShirt.getNeck(), price);
    }
}
