package com.example.calculatorapispringboot.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OperatorsServiceTest {

    @Test
    void subtraction() {
        assertEquals(15, OperatorsService.subtraction(20.0, 5.0));
        assertEquals(-2, OperatorsService.subtraction(3.0, 5.0));
        assertEquals(0, OperatorsService.subtraction(1.0, 1.0));
    }

    @Test
    void multiply() {
        assertEquals(30, OperatorsService.multiply(6.0, 5.0));
        assertEquals(15, OperatorsService.multiply(3.0, 5.0));
        assertEquals(1, OperatorsService.multiply(1.0, 1.0));
    }

    @Test
    void sum() {
        assertEquals(3, OperatorsService.sum(1.0, 2.0));
        assertEquals(5, OperatorsService.sum(3.0, 2.0));
        assertEquals(0, OperatorsService.sum(0.0, 0.0));
    }

    @Test
    void division() {
        assertEquals(5, OperatorsService.division(20.0, 4.0));
        assertEquals(10, OperatorsService.division(50.0, 5.0));
        assertEquals(1, OperatorsService.division(1.0, 1.0));
        assertEquals(0, OperatorsService.division(0.0, 0.0));
        assertEquals(0, OperatorsService.division(0.0, 1.0));
    }

    @Test
    void mean() {
        assertEquals(15, OperatorsService.mean(10.0, 20.0));
        assertEquals(0, OperatorsService.mean(0.0, 0.0));
    }

    @Test
    void square() {
        assertEquals(1.7320508075688772, OperatorsService.square(3.0));
        assertEquals(2.23606797749979, OperatorsService.square(5.0));
    }
}