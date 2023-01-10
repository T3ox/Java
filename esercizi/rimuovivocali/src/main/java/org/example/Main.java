package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci la parola da modificare");
        String parola = input.nextLine();

        System.out.println(parola.toLowerCase().replaceAll("[bcdfghjklmnpqrstvwxyz]", ""));


    }
}