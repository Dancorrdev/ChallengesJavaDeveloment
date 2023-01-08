package com.dancorrdev;

public class Challenge04PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        int number = 7;
        for (int i = 0; i <= number; i++) {
            if (number % i == 0){
                count++;
            }
            System.out.println(count);
        }
    }

    public static void isPrime(int number) {
    }
}
