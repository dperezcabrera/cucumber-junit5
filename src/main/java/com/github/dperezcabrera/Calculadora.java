package com.github.dperezcabrera;

public class Calculadora {

    public int suma(int i, int j){
        return i + j;
    }
    
    public double div(double i, double j) {
        if (j == 0) {
            throw new ArithmeticException("/ by zero");
        }
        return i / j;
    }
}
