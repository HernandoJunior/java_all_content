package org.java.arrays.exercises.studentRooms;

import java.util.Scanner;

public class RoomsStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[10];

        System.out.print("How many students: ");
        int n = sc.nextInt();

        if (n < 1 || n > 10){
            throw new RuntimeException("Max value: 10 | Min value: 1");
        }

        sc.nextLine();
        for (int i = 0; i < n; i++){
            System.out.print("Name at student " + (i+1) + " : ");
            String name = sc.nextLine();


            System.out.print("Email at student " + (i+1) + " : ");
            String email = sc.nextLine();

            System.out.print("Room " + (i+1) + " : ");
            int room = sc.nextInt();

            sc.nextLine();
            students[room] = new Student(name, email);
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < students.length; i++){
            if (students[i] != null){
                System.out.println( (1) + ": " + students[i].getName() + ", " + students[i].getEmail());
            }
        }

        sc.close();
    }
}
