package org.example;
public class Main {
    public static void main(String[] args) {
        int [] a = {1, 1, 1, 1, 1, 1, 2, 1};
        int pari = 0, dispari = 0;
        for (int i = 0; i<a.length; i++){
            if (i % 2 == 0)
                pari = pari + a[i];
            else if (i % 2 == 1)
                dispari = dispari + a[i];
            }
        if (pari == dispari)
            System.out.println("Pari e dispari uguali");
        else
            System.out.println("Pari e dispari diversi");
        }
    }