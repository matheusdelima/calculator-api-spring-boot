package com.example.calculatorapispringboot.controllers;

import com.example.calculatorapispringboot.converters.NumberConverter;
import com.example.calculatorapispringboot.exceptions.UnsupportedMathOperationException;
import com.example.calculatorapispringboot.services.OperatorsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("math-operator")
public class MathOperatorsController {

    @RequestMapping(
            value= "/type/{type}",
            method=RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public static ResponseEntity<Double> calc(
            @PathVariable String type,
            @RequestParam(value = "numberOne", defaultValue = "") String numberOne,
            @RequestParam(value = "numberTwo", required = false, defaultValue = "") String numberTwo
    ) {

        Double x = !numberOne.isEmpty() ? NumberConverter.toDouble(numberOne) : 0D;
        Double y = !numberTwo.isEmpty() ? NumberConverter.toDouble(numberTwo) : 0D;

        return new ResponseEntity<>(
                switch (type) {
                    case "sum" -> OperatorsService.sum(x, y);
                    case "subtraction" -> OperatorsService.subtraction(x, y);
                    case "multiply" -> OperatorsService.multiply(x, y);
                    case "division" -> OperatorsService.division(x, y);
                    case "mean" -> OperatorsService.mean(x, y);
                    case "square" -> OperatorsService.square(x);
                    default -> throw new UnsupportedMathOperationException("The operator is not available");
                },
                HttpStatus.OK
        );
    }
}
