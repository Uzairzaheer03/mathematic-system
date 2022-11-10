package com.example.springbootapplication.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Getter
@Setter
@ToString
public class Mathematic {


    private int x;

    private int y;

    public Mathematic(int addition, int multiply, int subtract, int smaller) {

    }


    public  int addition(int x, int y){
        return x + y;
    }
    public int subtract(int x, int y){

        return x - y;
    }
    public int multiply(int x, int y){

        return x * y ;
    }

    public int smaller(int x, int y) {
        if(x<y){
            return x;
        }else{
            return y;
        }
    }

    public Mathematic(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
