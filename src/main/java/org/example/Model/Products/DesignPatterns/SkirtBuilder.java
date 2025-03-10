package org.example.Model.Products.DesignPatterns;

import org.example.Model.Products.Skirt;

public class SkirtBuilder {
    private final Skirt skirt = new Skirt();

    public SkirtBuilder addSize(String size){
    skirt.setSize(size);
    return this;
    }

    public SkirtBuilder addMaterial(String material){
        skirt.setMaterial(material);
        return this;
    }

    public SkirtBuilder addColor(String color){
        skirt.setColor(color);
        return this;
    }

    public SkirtBuilder addWaistline(double waistline){
        skirt.setWaistline(waistline);
        return this;
    }

    public SkirtBuilder addPattern(String pattern){
        skirt.setPattern(pattern);
        return this;
    }

    public Skirt build(){
        return skirt;
    }
}
