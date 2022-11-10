package com.example.springbootapplication.service;

import com.example.springbootapplication.domain.Mathematic;
import com.example.springbootapplication.repository.MathematicRepository;
import org.springframework.stereotype.Service;

@Service
public class MathematicService {
    private static MathematicRepository mathematicRepository = null;


    public MathematicService(MathematicRepository methamaticRepository){
        this.mathematicRepository = methamaticRepository;
    }

    public static int addition(int x, int y){
       Mathematic mathematic = new Mathematic(x, y);
       MathematicRepository.add(mathematic);
       return "added";
    }


    public static int multiply(int x, int y) {

    }
}


