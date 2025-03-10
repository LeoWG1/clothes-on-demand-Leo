package org.example.Model.Products.DesignPatterns;

import org.example.Model.Products.TShirt;

public class TShirtCommand implements ProductDecorationCommand {
    private final TShirt tShirt;
    private final String sleeves;
    private final String neck;

    public TShirtCommand(TShirt tShirt, String sleeves, String neck) {
        this.tShirt = tShirt;
        this.sleeves = sleeves;
        this.neck = neck;
    }


    @Override
    public void execute() {
        tShirt.setSleeves(sleeves);
        tShirt.setNeck(neck);
        System.out.println("Anpassar ärm-stil till: " + tShirt.getSleeves() + "...\nSyr nacken till: "
        + tShirt.getNeck() +"...");

    }
}
