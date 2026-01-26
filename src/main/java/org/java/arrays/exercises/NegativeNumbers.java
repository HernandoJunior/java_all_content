package org.java.arrays.exercises;

import java.util.Locale;
import java.util.Scanner;

public class NegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers your want? ");
        int n = sc.nextInt();
        int[] vector = new int[n];

        if (n >= 10){
            throw new RuntimeException("Max value at numbers: 10");
        }

        for (int i = 0; i < n; i++){
            System.out.print("Write number " + (i+1) + ": ");
            vector[i] = sc.nextInt();
        }

        System.out.println("Negative numbers in vector: ");
        for (int i = 0; i < n; i++) {
            if (vector[i] < 0){
                System.out.println(vector[i]);
            }
        }

    sc.close();
    }
}
