package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci numero di valori dell'array");
        int n = input.nextInt();
        int [] a = new int [n];
        float somma = 0, media = 0;

        System.out.println("Inserisci i valori dell'array");
        for (int i = 0; i<a.length; i++){
            a[i] = input.nextInt();
            somma = somma + a[i];

        }
        System.out.println("La somma è : " + somma + "\n La media è: " + (somma/n));
    }
}