package com.example;

public class Calculator {
    public int multiply(int multiplicand, int multiplier){
        if(multiplicand==0|| multiplier==0){
            return 0;
        }
        else {
        return (multiplicand+ multiply( multiplicand, multiplier-1));
    }
    }
}