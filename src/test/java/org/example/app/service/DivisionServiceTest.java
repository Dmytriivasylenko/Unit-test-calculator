package org.example.app.service;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionServiceTest {

    @BeforeEach
    public void setUp() {
        System.out.println("Setting up before test...");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Cleaning up after test...");
    }

    @Test
    public void testDividePositiveNumbers() {
        double result = DivisionService.divide(10, 2);
        assertEquals(5.0, result, "10 / 2 має дорівнювати 5");
    }

    @Test
    public void testDivideNegativeNumbers() {
        double result = DivisionService.divide(-10, -2);
        assertEquals(5.0, result, "-10 / -2 має дорівнювати 5");
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> DivisionService.divide(10, 0),
                "Ділення на нуль має викликати IllegalArgumentException");
    }

    @Test
    public void testDivideWithZeroNumerator() {
        double result = DivisionService.divide(0, 5);
        assertEquals(0.0, result, "0 / 5 має дорівнювати 0");
    }
}
