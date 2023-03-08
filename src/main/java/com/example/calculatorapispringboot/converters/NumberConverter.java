package com.example.calculatorapispringboot.converters;

import org.springframework.util.NumberUtils;

import java.security.InvalidParameterException;

public class NumberConverter {
    public static double toDouble(String strNumber) throws InvalidParameterException {
        if(strNumber == null) return 0D;
        String number = strNumber.replaceAll(",", ".");
        try {
            return NumberUtils.parseNumber(number, Double.class);
        } catch (NumberFormatException e) {
            throw new InvalidParameterException("The informed parameter is not valid for the operation.");
        }
    }
}

