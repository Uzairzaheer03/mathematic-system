package com.example.springbootapplication.repository;

import com.example.springbootapplication.domain.Mathematic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MathematicRepository extends JpaRepository<Mathematic, Integer>{

    static void add(Mathematic mathematic) {
    }

    static void add(int i, int y) {
    }
}
