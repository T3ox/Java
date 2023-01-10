package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci 10 numeri interi");
        int [] a = new int[10];
        int [] secondoArray = new int[10];

        for (int i = 0; i<a.length; i++){
            a[i] = input.nextInt();
            if (a[i] > 0)
                secondoArray[i] = a[i];
        }
        for (int i = secondoArray.length; i>0; i--){
            System.out.print(secondoArray[i-1]);
        }
    }
}