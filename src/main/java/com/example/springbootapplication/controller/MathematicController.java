package com.example.springbootapplication.controller;

import com.example.springbootapplication.service.MathematicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathematicController {
    @Autowired
    private final MathematicService mathematicService;

    public MathematicController(MathematicService mathematicService) {
        this.mathematicService = mathematicService;
    }

    @GetMapping("/addition")
    public int addition(@RequestParam int x, @RequestParam int y) {
        return mathematicService.addition(x, y);
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam int x,@RequestParam int y) {
        return mathematicService.multiplyMathematic(x, y);
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam int x,@RequestParam int y) {
        return mathematicService.subtract(x, y);
    }

    @GetMapping("/smaller")
    public int smaller(@RequestParam int x,@RequestParam int y) {
        return mathematicService.smaller(x, y);
    }

    @GetMapping("/additions")
    public int addition(@RequestParam int x,@RequestParam int y,@RequestParam int z) {

        return mathematicService.multipleAddition(x, y, z);
    }
}
