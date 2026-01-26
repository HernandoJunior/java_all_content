package org.java.lists;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ExamplesList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //List instance
        List<String> listString = new ArrayList<>();

        //Add values in list
        listString.add("Hernando");
        listString.add("Maria");
        listString.add("Eduarda");

        //Print values in list
        for (String name : listString){
            System.out.println(name);
        }

        //Use predicate to remove values in list
        listString.removeIf(x -> x.charAt(0) == 'M');

        //Print values in list
        for (String name : listString){
            System.out.println(name);
        }
    }
}
