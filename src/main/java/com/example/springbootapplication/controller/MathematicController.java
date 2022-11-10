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
    @PostMapping("/create")
    public int create(@RequestParam int x,@RequestParam int y){

        return mathematicService.createMathematic(x,y);
    }
   @PutMapping("/update")
    public int update(@RequestParam int x,@RequestParam int y){
        return mathematicService.updateMathematic(x,y);
    }



    @GetMapping("/addition")
    public int addition(@RequestParam int x, @RequestParam int y){
        return mathematicService.addition(x, y);
    }
    @GetMapping("/multiply")
    public int multiply(@RequestParam int x, int y){
        return mathematicService.multiplyMathematic(x, y);
    }
    @GetMapping("/subtract")
    public int subtract(@RequestParam int x, int y){
        return mathematicService.subtract(x, y);
    }
    @GetMapping("/smaller")
    public int smaller(@RequestParam int x, int y){
        return mathematicService.smaller(x, y);
    }
    @DeleteMapping("/delete")
    public int delete(@RequestParam int x, int y){
        return mathematicService.deleteMathematic(x, y);
    }

}
