package org.example.Model.Products;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PantsTest {

    @Test
    void testGetAndSetId() {
        Pants pants = new Pants();
        pants.setId(24);
        assertEquals(24, pants.getId(),
                "Id should be 24");
    }

    @Test
    void testGetAndSetName() {
        Pants pants = new Pants();
        pants.setName("Pants");
        assertEquals("Pants", pants.getName(),
                "Name should be Pants");
    }

    @Test
    void testGetAndSetPrice() {
        Pants pants = new Pants();
        pants.setPrice(100);
        assertEquals(100, pants.getPrice(),
                "Price should be 100");
    }

    @Test
    void testGetAndSetSize() {
        Pants pants = new Pants();
        pants.setSize("S");
        assertEquals("S", pants.getSize(),
                "Size should be S");
    }

    @Test
    void testGetAndSetMaterial() {
        Pants pants = new Pants();
        pants.setMaterial("Denim");
        assertEquals("Denim", pants.getMaterial(),
                "Material should be Denim");
    }

    @Test
    void testGetAndSetColor() {
        Pants pants = new Pants();
        pants.setColor("Blue");
        assertEquals("Blue", pants.getColor(),
                "Color should be Blue");
    }

    @Test
    void testGetAndSetFit() {
        Pants pants = new Pants();
        pants.setFit("Slim Fit");
        assertEquals("Slim Fit", pants.getFit(),
                "Fit should be Slim Fit");
    }

    @Test
    void testGetAndSetLength() {
        Pants pants = new Pants();
        pants.setLength(100);
        assertEquals(100, pants.getLength(),
                "Length should be 100");
    }
}