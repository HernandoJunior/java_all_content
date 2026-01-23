package org.java.arrays.example2;

import java.util.Locale;
import java.util.Scanner;

public class VectorExample2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] products = new Product[n];
        double average = 0;

        for (int i = 0; i < n; i++){
            sc.nextLine();

            System.out.print("Name product " + (i+1) + ": ");
            String name = sc.nextLine();

            System.out.print("Price product " + (i+1) + ": ");
            double price = sc.nextDouble();
            
            products[i] = new Product(name, price);
            average += products[i].getPrice();
        }

        average = average / products.length;
        System.out.printf("Average Price = %.2f", average);
    }
}

