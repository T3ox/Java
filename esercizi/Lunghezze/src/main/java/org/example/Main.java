package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci le parole:");
        String parole1 = input.nextLine();
        int lunghezza = 0;

        while (parole1.length() > 0){
            if (Character.isUpperCase(parole1.charAt(0))){
                lunghezza = lunghezza + parole1.length();
            }
            parole1 = input.nextLine();
        }
        System.out.println(lunghezza);
    }
}