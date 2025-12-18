package org.java.repetitiveStructures.exercises;

import com.sun.source.tree.NewArrayTree;

import java.awt.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ForExercises {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        //Exercise 1
        int x = sc.nextInt();
        if (1 > x && x > 1000) {
            System.out.println("Número invalido");
            return;
        }
        for (int i = 0; i < x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        //Exercise 2
        int numberTotal, numbers;
        int numbersIn = 0;
        int numbersOut = 0;

        numberTotal = sc.nextInt();

        for (int i = 0; i < numberTotal; i++) {
            numbers = sc.nextInt();
            if (numbers >= 10 && numbers <= 20) {
                numbersIn += 1;
            } else {
                numbersOut += 1;
            }
        }
        System.out.println(numbersIn + " in");
        System.out.println(numbersOut + " out");

        //Exercise 3
        x = sc.nextInt();
        double x1, x2, x3, media;

        for (int i = 0; i < x; i++) {
            x1 = sc.nextDouble();
            x2 = sc.nextDouble();
            x3 = sc.nextDouble();

            media = ((x1 * 2.0 + x2 * 3 + x3 * 5.0) / 10.0);
            System.out.printf("%.2f", media);
        }

        //Exercise 4
        x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            x1 = sc.nextDouble();
            x2 = sc.nextDouble();
            if (x2 == 0) {
                System.out.println("Divisao impossivel");
            } else {
                System.out.printf("%.2f \n", x1 / x2);
            }
        }

    }
}
