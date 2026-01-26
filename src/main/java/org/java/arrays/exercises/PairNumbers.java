package org.java.arrays.exercises;

import java.util.Scanner;

public class PairNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many number your want write: ");
        int n = sc.nextInt();

        int[] vector = new int[n];
        int[] vectorPairNumbers = new int[n];

        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.print("Write the " + (i+1) + " number: ");
            vector[i] = sc.nextInt();

            if (vector[i] % 2 == 0){
                vectorPairNumbers[i] = vector[i];
            }
        }

        int pairNumbers = 0;
        for (int i = 0; i < n; i++){
            if (vectorPairNumbers[i] != 0) {
                System.out.print(vectorPairNumbers[i] + " ");
                pairNumbers += 1;
            };
        }

        System.out.println("\nPair numbers quantity: " + pairNumbers );
    }
}
