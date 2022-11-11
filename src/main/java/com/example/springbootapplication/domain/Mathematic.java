package com.example.springbootapplication.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Mathematic {


    private int x;

    private int y;
    private int z;

    public Mathematic(int addition, int multiply, int subtract, int smaller) {

    }


    public static int addition(int x, int y){

        return x + y  ;
    }
    public static int subtract(int x, int y){

        return x - y;
    }
    public static int multiply(int x, int y){

        return x * y ;
    }

    public static int smaller(int x, int y) {
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

    public int multipleAddition(int x, int y, int z){

        return x+y+z;

    }
    public Mathematic(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public static int  factorial(int x){
        return x;
    }





}
