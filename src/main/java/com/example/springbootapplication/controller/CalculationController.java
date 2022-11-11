package com.example.springbootapplication.controller;

import com.example.springbootapplication.domain.Mathematic;
import com.example.springbootapplication.domain.OperationEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {


    @GetMapping("/performOperation")
    public int performOperation(int x, int y, OperationEnum operationEnum) {

        switch (operationEnum) {
            case ADDITION:
                return Mathematic.addition(x, y);

            case MULTIPLY:
                return Mathematic.multiply(x, y);

            case SUBTRACT:
                return Mathematic.subtract(x, y);

            case SMALLER:
                return Mathematic.smaller(x, y);

        }

        return 0;
    }

}
