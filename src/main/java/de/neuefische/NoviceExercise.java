package de.neuefische;

import java.util.Scanner;

public class NoviceExercise {

    public static void main(String[] args) {
        printName();
        printNameLoop();

        System.out.println("3 ist größer als 0? " + isBiggerThanZero(3));

        System.out.println("Das Quadrat von 6 ist: " + calculateSquare(6));

        greetUser();
    }

    public static String getName() {
        return "Max Power";
    }

    public static void printName() {
        System.out.println(getName());
    }

    public static void printNameLoop() {
        for (int i = 0; i < 5; i++) {
            printName();
        }
    }

    public static boolean isBiggerThanZero(int value) {
        return value > 0;
    }

    public static int calculateSquare(int value) {
        return value * value;
    }

    public static void greetUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte Namen eingeben: ");
        String username = scanner.nextLine();

        System.out.println("Hi " + username + "!");
        scanner.close();
    }

}
