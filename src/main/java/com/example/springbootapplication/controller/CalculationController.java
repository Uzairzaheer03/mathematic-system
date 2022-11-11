package com.example.springbootapplication.controller;

import com.example.springbootapplication.domain.OperationEnum;
import org.springframework.web.bind.annotation.GetMapping;

public class CalculationController {


    @GetMapping("/performOperation")
    public String performOperation(int x, int y, OperationEnum operationEnum) {

        switch (operationEnum) {
            case ADDITION:
                return "addition";
            break;
            case MULTIPLY:
                return "multiply";
            break;
            case SUBTRACT:
                return "subtract";
            break;
            case SMALLER:
                return "smaller";
            break;
        }

    return operationEnum;
    }

}
