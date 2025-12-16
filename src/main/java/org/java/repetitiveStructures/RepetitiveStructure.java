package org.java.repetitiveStructures;

import java.util.Scanner;

public class RepetitiveStructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Test 1 -> While
        int x = sc.nextInt();
        int sum = 0;
        while(x != 0){
            x = sc.nextInt();
            sum += x;
        }
        System.out.println("Valor total da soma: " + sum);

        //Test 2 -> For


    }
}
