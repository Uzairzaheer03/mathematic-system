package com.example.springbootapplication.service;

import com.example.springbootapplication.domain.Mathematic;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MathematicService {


    public int createMathematic (int x, int y){
        Mathematic mathematic = new Mathematic(x,y);
        return "mathematic";
    }
   public int updateMathematic(int x, int y){
        Optional<Mathematic> optionalMathematic ;
        return
    }

    public int addition(int x, int y){
       Mathematic mathematic = new Mathematic(x, y);
        return .add(mathematic);
     }




    public int multiplyMathematic(int x, int y) {
           Mathematic mathematic = new Mathematic(x, y);
           return
    }

    public int subtract(int x, int y) {

    }


    public int smaller(int x, int y) {

    }

    public int deleteMathematic(int x, int y) {

    }
}


