package com.example.springbootapplication.controller;

import com.example.springbootapplication.domain.Mathematic;
import org.springframework.web.bind.annotation.GetMapping;

public class CalculationController {

    @GetMapping("/addition")
    public static int ADDITION(int x, int y) {
        return Mathematic.addition(x, y);
    }

    @GetMapping("/multiply")
    public static int MULTIPLY(int x, int y) {
        return Mathematic.multiply(x, y);
    }

    @GetMapping("/subtract")
    public static int SUBTRACT(int x, int y) {
        return Mathematic.subtract(x, y);
    }
    @SuppressWarnings("/smaller")
    public static int SMALLER(int x, int y){
        return Mathematic.smaller(x, y);
    }

}
