package com.example.calculatorapispringboot.converters;

import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class NumberConverterTest {
    @Test
    void testToDouble() {
        assertEquals(22.0, NumberConverter.toDouble("22"));
        assertEquals(5.05, NumberConverter.toDouble("5.05"));
        assertEquals(-200D,NumberConverter.toDouble("-200"));
        assertEquals(10.0d, NumberConverter.toDouble("10.0d"));
        assertEquals(22d, NumberConverter.toDouble("   22   "));
        assertEquals(0D, NumberConverter.toDouble(null));
        assertThrowsExactly(InvalidParameterException.class, () -> NumberConverter.toDouble("abc"));
        assertThrowsExactly(InvalidParameterException.class, () -> NumberConverter.toDouble(""));
    }
}