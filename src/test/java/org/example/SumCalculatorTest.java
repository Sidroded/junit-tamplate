package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    private SumCalculator calc;

    @BeforeEach
    void beforeEach() {
        calc = new SumCalculator();
    }

    @Test
    @DisplayName("Check arithmetic progression calculations")
    void sumTest() {
        assertEquals(1, calc.sum(1), "Regular arithmetic progression should work");
        assertEquals(6, calc.sum(3), "Regular arithmetic progression should work");
        assertEquals(10, calc.sum(4), "Regular arithmetic progression should work");
    }

    @Test
    @DisplayName("Check for illegal input data")
    void sumExceptionTest() {
        assertThrows(IllegalArgumentException.class,
                () -> calc.sum(0), "If input num less or equals 0, should throw exception");
        assertThrows(IllegalArgumentException.class,
                () -> calc.sum(-5), "If input num less or equals 0, should throw exception");
    }
}