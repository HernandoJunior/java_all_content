package org.java.arrays.exercises;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class VectorSum {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers your want write: ");
        int n = sc.nextInt();
        double[] vector = new double[n];

        if (n > 10) {
            throw new RuntimeException("Max value: 10");
        }

        for (int i = 0; i < n; i++){
            System.out.print("Write number "+ (i+1) + ": ");
            vector[i] = sc.nextDouble();
        }

        double sum = Arrays.stream(vector).sum();
        double average = sum / vector.length;

        System.out.print("Values: ");
        for (int i = 0; i < n; i++){
            System.out.print(vector[i] + " ");
        }

        System.out.printf("\nSum: %.2f", sum);
        System.out.printf("\nAverage: %.2f", average);



    }
}
