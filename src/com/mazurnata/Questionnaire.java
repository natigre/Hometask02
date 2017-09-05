package com.mazurnata;

import java.util.Scanner;

public class Questionnaire {
    Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Hello, what is your name?");
        String name = scanner.nextLine();
        System.out.println("Where do you live?");
        String city = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("What is your hobby?");
        scanner.nextLine();
        String hobby = scanner.nextLine();

        System.out.println();
//        System.out.println("Thank you");

        printTabularInput(name, city, age, hobby);
        System.out.print("--------------------------\n");
        printTextInput(name, city, age, hobby);
        System.out.print("--------------------------\n");
    }

    private void printTabularInput(String name, String city, int age,String hobby) {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
        System.out.println("Hobby: " + hobby);
    }

    private void printTextInput(String name, String city, int age,String hobby) {
        System.out.println("A man named" + name + " lives in the city " + city);
        System.out.println("This person " + age + " years and he loves to engage in " + hobby);
    }
}
