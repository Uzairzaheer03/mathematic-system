package com.example.springbootapplication.controller;

import com.example.springbootapplication.service.MathematicService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathematicController {
    private final MathematicService mathematicService;

    public MathematicController(MathematicService mathematicService) {
        this.mathematicService = mathematicService;
    }

    @GetMapping("/addition")
    public int addition(@RequestParam int x, @RequestParam int y){
        return MathematicService.addition(x,y);
    }
    @GetMapping("/multiply")
    public int multiply(@RequestParam int x, int y){
        return MathematicService.multiply(x, y);
    }



}
