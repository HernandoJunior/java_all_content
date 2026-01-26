package org.java.arrays.exercises.peopleExercise;

import java.util.Locale;
import java.util.Scanner;

public class PeopleSum {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many peoples your want write: ");
        int n = sc.nextInt();
        People[] peopleVector = new People[n];

        double averageHeight = 0.0;
        int countPeoplesAge = 0;

        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.print("Name at " + (i+1) + " peolpe: ");
            String name = sc.nextLine();

            System.out.print("Age at " + (i+1) + " peolpe: ");
            int age = sc.nextInt();

            System.out.print("Height at " + (i+1) + " peolpe: ");
            double height = sc.nextDouble();

            peopleVector[i] = new People(name, age, height);
            averageHeight += peopleVector[i].getHeight();

            if (peopleVector[i].getAge() < 16){
                countPeoplesAge+=1;
            }
        }

        averageHeight = averageHeight / peopleVector.length;
        System.out.printf("Average height: %.2f", averageHeight);

        double peoplePercentageAge = (countPeoplesAge * 100) / peopleVector.length;
        System.out.println("\nPeople quantity with  < 16 years old : " + peoplePercentageAge + "%");

        for (int i = 0; i < n; i++){
            if (peopleVector[i].getAge() < 16){
                System.out.println(peopleVector[i].getName());
            }
        }
    }
}
