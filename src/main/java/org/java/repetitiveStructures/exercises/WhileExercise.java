package org.java.repetitiveStructures.exercises;

import java.util.Scanner;

public class WhileExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Exercise 1
        int password = sc.nextInt();
        while (password != 2802) {
            System.out.println("Senha invalida. \nTente novamente: ");
            password = sc.nextInt();
        }
        System.out.println("Acesso permitido!");

        //Exercise 2
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int option = sc.nextInt();
        while (option != 4) {
            switch (option) {
                case 1:
                    alcool += 1;
                    break;
                case 2:
                     gasolina += 1;
                     break;
                case 3:
                    diesel += 1;
                    break;
                default:
                    System.out.println("Opcao invalida, digite novamente!");
            }
            option = sc.nextInt();
        }

        System.out.println("Muito obrigado!");
        System.out.println("Alcool: " + alcool + "\nGasolina: " + gasolina + "\nDiesel: " + diesel);
    }
}
