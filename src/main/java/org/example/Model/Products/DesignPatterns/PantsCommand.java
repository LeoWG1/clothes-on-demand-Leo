package org.example.Model.Products.DesignPatterns;

import org.example.Model.Products.Pants;

public class PantsCommand implements ProductDecorationCommand {
    private final Pants pants;
    private final String fit;
    private final double length;

    public PantsCommand(Pants pants, String fit, double length) {
        this.pants = pants;
        this.fit = fit;
        this.length = length;
    }

    @Override
    public void execute() {
        pants.setFit(fit);
        pants.setLength(length);
        System.out.println("Syr till: " + pants.getFit() +"-stil..." +
                "\nSyr till längd: " + pants.getLength() + "cm...");

    }
}
