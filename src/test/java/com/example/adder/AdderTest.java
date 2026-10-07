package com.example.adder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdderTest {

    @Test
    void shouldAddTwoNumbers() {
        assertEquals(5, Adder.add(2, 3));
    }

    @Test
    void shouldAddNegativeNumbers() {
        assertEquals(-5, Adder.add(-2, -3));
    }

    @Test
    void shouldAddZero() {
        assertEquals(7, Adder.add(7, 0));
    }

    @Test
    void securityShouldTreatInputsAsIntegers() {
        assertEquals(3, Adder.add(1, 2));
    }
}
