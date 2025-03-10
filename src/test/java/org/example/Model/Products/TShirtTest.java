package org.example.Model.Products;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TShirtTest {

    @Test
    void testGetAndSetId() {
        TShirt tShirt = new TShirt();
        tShirt.setId(24);
        assertEquals(24, tShirt.getId(),
                "Id should be 24");
    }

    @Test
    void testGetAndSetName() {
        TShirt tShirt = new TShirt();
        tShirt.setName("T-Shirt");
        assertEquals("T-Shirt", tShirt.getName(),
                "Name should be T-Shirt");
    }

    @Test
    void testGetAndSetPrice() {
        TShirt tShirt = new TShirt();
        tShirt.setPrice(100);
        assertEquals(100, tShirt.getPrice(),
                "Price should be 100");
    }

    @Test
    void testGetAndSetSize() {
        TShirt tShirt = new TShirt();
        tShirt.setSize("S");
        assertEquals("S", tShirt.getSize(),
                "Size should be S");
    }

    @Test
    void testGetAndSetMaterial() {
        TShirt tShirt = new TShirt();
        tShirt.setMaterial("Cotton");
        assertEquals("Cotton", tShirt.getMaterial(),
                "Material should be Cotton");
    }

    @Test
    void testGetAndSetColor() {
        TShirt tShirt = new TShirt();
        tShirt.setColor("Blue");
        assertEquals("Blue", tShirt.getColor(),
                "Color should be Blue");
    }

    @Test
    void testGetAndSetSleeves() {
        TShirt tShirt = new TShirt();
        tShirt.setSleeves("Short");
        assertEquals("Short", tShirt.getSleeves(),
                "Sleeves should be Short");
    }

    @Test
    void testGetAndSetNeck() {
        TShirt tShirt = new TShirt();
        tShirt.setNeck("Short");
        assertEquals("Short", tShirt.getNeck(),
                "Neck should be Short");
    }
}