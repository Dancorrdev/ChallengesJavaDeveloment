package com.dancorrdev;

/*
 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *  se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/)
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 */

import java.util.Scanner;

public class Challenge01Retohacker {
    public static void main(String[] args) {
         String message;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu mensaje aqui");
        message = scanner.nextLine();

        changeLetters(message);


    }
    public static void changeLetters(String message) {
        for (int i = 0; i < message.length(); i++) {
            char letter = message.charAt(i);
            hackerLenguageTranslator(letter);
        }
    }

    public static void hackerLenguageTranslator(char letter){
        switch (letter){
            case 'a':
                System.out.print("4");
                break;
            case 'b' :
                System.out.print("I3");
                break;
            case 'c':
                System.out.print("[");
                break;
            case 'd':
                System.out.print(")");
                break;
            case 'e':
                System.out.print("3");
                break;
            case 'f':
                System.out.print("|=");
                break;
            case 'g':
                System.out.print("&");
                break;
            case 'h':
                System.out.print("#");
                break;
            case 'i':
                System.out.print("1");
                break;
            case 'j':
                System.out.print("._|");
                break;
            case 'k':
                System.out.print(">|");
                break;
            case 'l':
                System.out.print("£");
                break;
            case 'm':
                System.out.print("/\\/\\");
                break;
            case 'n':
                System.out.print("^/");
                break;
            case 'o':
                System.out.print("0");
                break;
            case 'p':
                System.out.print("|*");
                break;
            case 'q':
                System.out.print("(_,)");
                break;
            case 'r':
                System.out.print("I2");
                break;
            case 's':
                System.out.print("5");
                break;
            case 't':
                System.out.print("7");
                break;
            case 'u':
                System.out.print("(_)");
                break;
            case 'v':
                System.out.print("\\/");
                break;
            case 'w':
                System.out.print("\\/\\/");
                break;
            case 'x':
                System.out.print("><");
                break;
            case 'y':
                System.out.print("`/");
                break;
            case 'z':
                System.out.print("2");
                break;
            case ' ':
                System.out.print(" ");
                break;
        }
    }

}
