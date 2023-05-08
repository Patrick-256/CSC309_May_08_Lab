package org.example;

import org.junit.jupiter.api.Assertions;

class MainTest {

    @org.junit.jupiter.api.Test
    void calculateHypotenuse() {
        Assertions.assertEquals(Main.calculateHypotenuse(10,20),22.360679774997898);
    }
}