package org.example.app.service;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SubtractionTest {

    @BeforeEach
    void setUp() {
        System.out.println("Setting up before test...");
    }

    @AfterEach
    void tearDown() {
        // Виконується після кожного тесту
        System.out.println("Cleaning up after test...");
    }

    @Test
    @DisplayName("Test subtracting two positive numbers")
    public void testSubtractPositiveNumbers() {
        int result = Subtraction.subtract(10, 5);
        assertEquals(5, result, "10 - 5 має дорівнювати 5");
    }

    @Test
    @DisplayName("Test subtracting a smaller number from a larger one")
    public void testSubtractSmallerFromLarger() {
        int result = Subtraction.subtract(15, 20);
        assertEquals(-5, result, "15 - 20 має дорівнювати -5");
    }

    @Test
    @DisplayName("Test subtracting zero")
    public void testSubtractZero() {
        int result = Subtraction.subtract(7, 0);
        assertEquals(7, result, "7 - 0 має дорівнювати 7");
    }

    @Test
    @DisplayName("Test subtracting a number from itself")
    public void testSubtractSameNumber() {
        int result = Subtraction.subtract(8, 8);
        assertEquals(0, result, "8 - 8 має дорівнювати 0");
    }

    @Test
    @DisplayName("Test subtracting negative numbers")
    public void testSubtractNegativeNumbers() {
        int result = Subtraction.subtract(-10, -5);
        assertEquals(-5, result, "-10 - (-5) має дорівнювати -5");
    }
}
