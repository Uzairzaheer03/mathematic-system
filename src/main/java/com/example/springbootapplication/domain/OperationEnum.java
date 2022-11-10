package com.example.springbootapplication.domain;

public enum OperationEnum {
    ADDITION,
    MULTIPLY,
    SUBTRACT,
    SMALLER;

    public static class Mathematic {
        private int x;
        private int y;

        public static int ADDITION(int x, int y){
            return x + y;
        }
        public static int MULTIPLY(int x, int y){
            return x * y;
        }
        public static int SUBTRACT(int x, int y){
            return x - y;
        }
        public static int SMALLER(int x, int y){
            if(x<y){
                return x;
            }else{
                return y;
            }
        }


    }
}
