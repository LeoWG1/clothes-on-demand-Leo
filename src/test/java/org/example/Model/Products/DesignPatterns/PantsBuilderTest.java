package org.example.Model.Products.DesignPatterns;

import org.example.Model.Products.Pants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PantsBuilderTest {

    @Test
    void testAddSize() {
        PantsBuilder pantsBuilder = new PantsBuilder();
        Pants pants = pantsBuilder.addSize("S").build();
        assertEquals("S", pants.getSize(),
                "Size should be S");

    }

    @Test
    void testAddMaterial() {
        PantsBuilder pantsBuilder = new PantsBuilder();
        Pants pants = pantsBuilder.addMaterial("Denim").build();
        assertEquals("Denim", pants.getMaterial(),
                "Material should be Denim");
    }

    @Test
    void testAddColor() {
        PantsBuilder pantsBuilder = new PantsBuilder();
        Pants pants = pantsBuilder.addColor("Blue").build();
        assertEquals("Blue", pants.getColor(),
                "Color should be Blue");
    }

    @Test
    void testAddFit() {
        PantsBuilder pantsBuilder = new PantsBuilder();
        Pants pants = pantsBuilder.addFit("Slim Fit").build();
        assertEquals("Slim Fit", pants.getFit(),
                "Fit should be Slim Fit");
    }

    @Test
    void testAddLength() {
        PantsBuilder pantsBuilder = new PantsBuilder();
        Pants pants = pantsBuilder.addLength(100).build();
        assertEquals(100, pants.getLength(),
                "Length should be 100");
    }

    @Test
    void testWholeBuilder() {
        PantsBuilder pantsBuilder = new PantsBuilder();
        Pants pants = pantsBuilder
                .addSize("S")
                .addMaterial("Denim")
                .addColor("Blue")
                .addFit("Slim Fit")
                .addLength(100)
                .build();

        assertEquals("S", pants.getSize());
        assertEquals("Denim", pants.getMaterial());
        assertEquals("Blue", pants.getColor());
        assertEquals("Slim Fit", pants.getFit());
        assertEquals(100, pants.getLength());
    }
}