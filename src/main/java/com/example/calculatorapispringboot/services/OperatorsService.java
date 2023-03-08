package com.example.calculatorapispringboot.services;

public class OperatorsService {
    public static Double subtraction(Double x, Double y){
        return (x - y);
    }

    public static Double multiply(Double x, Double y){
        return (x * y);
    }

    public static Double sum(Double x, Double y){
        return (x + y);
    }

    public static Double division(Double x, Double y){
        double result = (x / y);
        return Double.isNaN(result) ? 0D : result;
    }

    public static Double mean(Double x, Double y){
        return sum(x, y) / 2;
    }

    public static Double square(Double x){
        return Math.sqrt(x);
    }
}
