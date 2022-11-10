package com.example.springbootapplication.service;

import com.example.springbootapplication.domain.Mathematic;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MathematicService {

    public int addition(int x, int y){
       Mathematic mathematic = new Mathematic(x, y);
        return mathematic.addition(x,y);
     }

    public int multiplyMathematic(int x, int y) {
           Mathematic mathematic = new Mathematic(x, y);
           return mathematic.multiply(x,y);
    }

    public int subtract(int x, int y) {
        Mathematic mathematic = new Mathematic(x, y);
        return mathematic.subtract(x,y);
    }

    public int smaller(int x, int y) {
        Mathematic mathematic = new Mathematic(x, y);
        return mathematic.smaller(x,y);
    }

}


