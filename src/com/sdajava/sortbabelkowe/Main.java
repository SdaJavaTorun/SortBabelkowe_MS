package com.sdajava.sortbabelkowe;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ilość elementów tablicy: ");
        int n = input.nextInt();
        int[] tablica = new int[n];
        Random r = new Random();

// tablica pierwotna
         for(int i = 0 ; i < tablica.length; i++){
         tablica[i] = r.nextInt(20);
         System.out.print(tablica[i] + " ");
            }
        System.out.println();

//sortowanie
        for(int i = 0; i < tablica.length-1; i++ ) {
            for (int j = 0; j < tablica.length - 1; j++) {
                if (tablica[j] > tablica[j + 1]) {
                    int a = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = a;
                }
            }
        }
// wyświetlenie posortowanej tablicy
            for(int i=0; i < tablica.length; i++){
                System.out.print(tablica[i] + " ");
            }
        }
    }
