package org.example.Model.Products.DesignPatterns;

import org.example.Model.Products.TShirt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TShirtBuilderTest {

    @Test
    void testAddSize() {
        TShirtBuilder tShirtBuilder = new TShirtBuilder();
        TShirt tShirt = tShirtBuilder.addSize("S").build();
        assertEquals("S", tShirt.getSize(),
                "Size should be S");
    }

    @Test
    void testAddMaterial() {
        TShirtBuilder tShirtBuilder = new TShirtBuilder();
        TShirt tShirt = tShirtBuilder.addMaterial("Cotton").build();
        assertEquals("Cotton", tShirt.getMaterial(),
                "Material should be Cotton");
    }

    @Test
    void testAddColor() {
        TShirtBuilder tShirtBuilder = new TShirtBuilder();
        TShirt tShirt = tShirtBuilder.addColor("Blue").build();
        assertEquals("Blue", tShirt.getColor(),
                "Color should be Blue");
    }

    @Test
    void testAddSleeves() {
        TShirtBuilder tShirtBuilder = new TShirtBuilder();
        TShirt tShirt = tShirtBuilder.addSleeves("Short").build();
        assertEquals("Short", tShirt.getSleeves(),
                "Sleeves should be Short");
    }

    @Test
    void testAddNeck() {
        TShirtBuilder tShirtBuilder = new TShirtBuilder();
        TShirt tShirt = tShirtBuilder.addNeck("Short").build();
        assertEquals("Short", tShirt.getNeck(),
                "Neck should be Short");
    }

    @Test
    void testWholeBuilder() {
        TShirtBuilder tShirtBuilder = new TShirtBuilder();
        TShirt tShirt = tShirtBuilder
                .addSize("S")
                .addMaterial("Cotton")
                .addColor("Blue")
                .addSleeves("Short")
                .addNeck("Short")
                .build();
        assertEquals("S", tShirt.getSize());
        assertEquals("Cotton", tShirt.getMaterial());
        assertEquals("Blue", tShirt.getColor());
        assertEquals("Short", tShirt.getSleeves());
        assertEquals("Short", tShirt.getNeck());
    }
}