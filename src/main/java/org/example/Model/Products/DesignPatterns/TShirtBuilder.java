package org.example.Model.Products.DesignPatterns;

import org.example.Model.Products.TShirt;

public class TShirtBuilder {
    private final TShirt tShirt = new TShirt();

    public TShirtBuilder addSize(String size){
        tShirt.setSize(size);
        return this;
    }

    public TShirtBuilder addMaterial(String material){
        tShirt.setMaterial(material);
        return this;
    }

    public TShirtBuilder addColor(String color){
        tShirt.setColor(color);
        return this;
    }

    public TShirtBuilder addSleeves(String sleeves){
        tShirt.setSleeves(sleeves);
        return this;
    }

    public TShirtBuilder addNeck(String neck){
        tShirt.setNeck(neck);
        return this;
    }

    public TShirt build(){
        return tShirt;
    }
}
