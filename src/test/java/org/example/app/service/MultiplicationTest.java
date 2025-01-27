package org.example.app.service;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {

    @BeforeEach
    void setUp() {
        // Виконується перед кожним тестом
        System.out.println("Setting up before test...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up after test...");
    }

    @Test
    @DisplayName("Test multiplying two positive numbers")
    public void testMultiplyPositiveNumbers() {
        int result = Multiplication.multiply(4, 5);
        assertEquals(20, result, "4 * 5 має дорівнювати 20");
    }

    @Test
    @DisplayName("Test multiplying a positive and a negative number")
    public void testMultiplyPositiveAndNegativeNumbers() {
        int result = Multiplication.multiply(4, -3);
        assertEquals(-12, result, "4 * -3 має дорівнювати -12");
    }

    @Test
    @DisplayName("Test multiplying two negative numbers")
    public void testMultiplyNegativeNumbers() {
        int result = Multiplication.multiply(-6, -2);
        assertEquals(12, result, "-6 * -2 має дорівнювати 12");
    }

    @Test
    @DisplayName("Test multiplying by zero")
    public void testMultiplyByZero() {
        int result = Multiplication.multiply(7, 0);
        assertEquals(0, result, "7 * 0 має дорівнювати 0");
    }

    @Test
    @DisplayName("Test multiplying zero by zero")
    public void testMultiplyZeroByZero() {
        int result = Multiplication.multiply(0, 0);
        assertEquals(0, result, "0 * 0 має дорівнювати 0");
    }
}
