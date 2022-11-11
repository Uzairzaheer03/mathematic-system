package com.example.springbootapplication.controller;

import com.example.springbootapplication.domain.OperationEnum;
import org.springframework.web.bind.annotation.GetMapping;

public class CalculationController {


    @GetMapping("/performOperation")
    public int performOperation(int x, int y, OperationEnum operationEnum) {

        switch (operationEnum) {
            case ADDITION:
               return x + y;
                break;
            case MULTIPLY:
                return x * y;
            break;
            case SUBTRACT:
                return x - y;
            break;
            case SMALLER:
                if(x<y){
                    return x;
                }else{
                    return y;
                }
            break;
        }

        }
        return operationEnum;
    }