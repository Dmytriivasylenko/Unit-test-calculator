package org.example.app.service;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionalServiceTest {

    @Test
    public void testAdd() {
        int result = AdditionalService.add(5, 10);
        //  результат
        assertEquals(15, result, "5 + 10 має дорівнювати 15");
    }

    @Test
    public void testAddWithNegativeNumbers() {
        int result = AdditionalService.add(-3, -7);
        assertEquals(-10, result, "-3 + (-7) має дорівнювати -10");
    }

    @Test
    public void testAddWithZero() {
        int result = AdditionalService.add(0, 5);
        assertEquals(5, result, "0 + 5 має дорівнювати 5");
    }
}
