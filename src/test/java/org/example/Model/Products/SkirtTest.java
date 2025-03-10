package org.example.Model.Products;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SkirtTest {

    @Test
    void testGetAndSetId() {
        Skirt skirt = new Skirt();
        skirt.setId(24);
        assertEquals(24, skirt.getId(),
                "Id should be 24");
    }

    @Test
    void testGetAndSetName() {
        Skirt skirt = new Skirt();
        skirt.setName("Skirt");
        assertEquals("Skirt", skirt.getName(),
                "Name should be Skirt");
    }

    @Test
    void testGetAndSetPrice() {
        Skirt skirt = new Skirt();
        skirt.setPrice(100);
        assertEquals(100, skirt.getPrice(),
                "Price should be 100");
    }

    @Test
    void testGetAndSetSize() {
        Skirt skirt = new Skirt();
        skirt.setSize("S");
        assertEquals("S", skirt.getSize(),
                "Size should be S");
    }

    @Test
    void testGetAndSetMaterial() {
        Skirt skirt = new Skirt();
        skirt.setMaterial("Linen");
        assertEquals("Linen", skirt.getMaterial(),
                "Material should be Linen");

    }

    @Test
    void testGetAndSetColor() {
        Skirt skirt = new Skirt();
        skirt.setColor("Blue");
        assertEquals("Blue", skirt.getColor(),
                "Color should be Blue");
    }

    @Test
    void testGetAndSetWaistline() {
        Skirt skirt = new Skirt();
        skirt.setWaistline(100);
        assertEquals(100, skirt.getWaistline(),
                "Waistline should be 100");
    }

    @Test
    void testGetAndSetPattern() {
        Skirt skirt = new Skirt();
        skirt.setPattern("Solid");
        assertEquals("Solid", skirt.getPattern(),
                "Pattern should be Solid");
    }
}