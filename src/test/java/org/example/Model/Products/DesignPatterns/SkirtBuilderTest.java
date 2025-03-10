package org.example.Model.Products.DesignPatterns;

import org.example.Model.Products.Skirt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SkirtBuilderTest {

    @Test
    void testAddSize() {
        SkirtBuilder skirtBuilder = new SkirtBuilder();
        Skirt skirt = skirtBuilder.addSize("S").build();
        assertEquals("S", skirt.getSize(),
                "Size should be S");
    }

    @Test
    void testAddMaterial() {
        SkirtBuilder skirtBuilder = new SkirtBuilder();
        Skirt skirt = skirtBuilder.addMaterial("Linen").build();
        assertEquals("Linen", skirt.getMaterial(),
                "Material should be Linen");
    }

    @Test
    void testAddColor() {
        SkirtBuilder skirtBuilder = new SkirtBuilder();
        Skirt skirt = skirtBuilder.addColor("Blue").build();
        assertEquals("Blue", skirt.getColor(),
                "Color should be Blue");
    }

    @Test
    void testAddWaistline() {
        SkirtBuilder skirtBuilder = new SkirtBuilder();
        Skirt skirt = skirtBuilder.addWaistline(100).build();
        assertEquals(100, skirt.getWaistline(),
                "Waistline should be 100");
    }

    @Test
    void testAddPattern() {
        SkirtBuilder skirtBuilder = new SkirtBuilder();
        Skirt skirt = skirtBuilder.addPattern("Solid").build();
        assertEquals("Solid", skirt.getPattern(),
                "Pattern should be Solid");
    }

    @Test
    void testWholeBuilder() {
        SkirtBuilder skirtBuilder = new SkirtBuilder();
        Skirt skirt = skirtBuilder
                .addSize("S")
                .addMaterial("Linen")
                .addColor("Blue")
                .addWaistline(100)
                .addPattern("Solid")
                .build();
        assertEquals("S", skirt.getSize());
        assertEquals("Linen", skirt.getMaterial());
        assertEquals("Blue", skirt.getColor());
        assertEquals(100, skirt.getWaistline());
        assertEquals("Solid", skirt.getPattern());
    }
}