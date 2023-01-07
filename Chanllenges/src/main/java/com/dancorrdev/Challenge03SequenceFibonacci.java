package com.dancorrdev;

public class Challenge03SequenceFibonacci {
    public static void main(String[] args) {
        long firstNumber = 0;
        long secondNumber = 1;
        long sumFibbonacci = 0;
        for (int i = 0; i < 50; i++) {
            System.out.println(sumFibbonacci);
            sumFibbonacci = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sumFibbonacci;
        }
    }
}
