package de.neuefische;

import java.util.Arrays;
import java.util.Scanner;

public class IntermediateExercise {

    public static String[] numbersInText = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};

    public static void main(String[] args) {

        checkHundredNumbers();
        printHundredNumbers();
        nameGame();
    }

    public static String numberToText(int number) {
        if (number >= 10) {
            System.out.println("Bitte gebe eine Zahl zwischen 1 und 9 an");
            return "Int zu lang";
        }
        switch (number) {
            case 1:
                return "Eins";
            case 2:
                return "Zwei";
            case 3:
                return "Drei";
            case 4:
                return "Vier";
            case 5:
                return "Fünf";
            case 6:
                return "Sechs";
            case 7:
                return "Sieben";
            case 8:
                return "Acht";
            case 9:
                return "Neun";
            default:
                return "Hier könnte Ihre Werbung stehen";
        }

    }


    public static String checkNumber(int value) {
        String result = "";

        if (value % 3 == 0) {
            result += "#";
        }
        if (value % 5 == 0) {
            result += "$";
        }
        return result + value;
    }

    public static String checkHundredNumbers() {
        String numbersText = "";

        for (int i = 1; i <= 100; i++) {
            numbersText += (checkNumber(i) + " ");
        }

        return numbersText;
    }

    public static void printHundredNumbers(){
        System.out.println(checkHundredNumbers());
    }

    public static void nameGame(){
        Scanner currywurst = new Scanner(System.in);
        String[] names = {}; //0

        while (true) {
            System.out.println(Arrays.toString(names));
            System.out.println("Bitte geben Sie einen weiteren Namen ein, oder tippen Sie q zum abbrechen");
            String newName = currywurst.nextLine();
            if (newName.equals("q")){
                return;
            }

            names = Arrays.copyOf(names, names.length+1);
            names[names.length-1] = newName;
            currywurst.close();
        }
    }
}
