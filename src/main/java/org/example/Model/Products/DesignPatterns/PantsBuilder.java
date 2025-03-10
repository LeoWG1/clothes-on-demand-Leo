package org.example.Model.Products.DesignPatterns;

import org.example.Model.Products.Pants;

public class PantsBuilder {
    private final Pants pants = new Pants();

    public PantsBuilder addSize(String size){
        pants.setSize(size);
        return this;
    }

    public PantsBuilder addMaterial(String material){
        pants.setMaterial(material);
        return this;
    }

    public PantsBuilder addColor(String color){
        pants.setColor(color);
        return this;
    }

    public PantsBuilder addFit(String fit){
        pants.setFit(fit);
        return this;
    }

    public PantsBuilder addLength(double length){
        pants.setLength(length);
        return this;
    }

    public Pants build(){
        return pants;
    }
}
