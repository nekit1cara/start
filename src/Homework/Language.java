package Homework;

import java.util.Scanner;

public class Language {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your language preference:");
        System.out.println("1. English");
        System.out.println("2. French");
        System.out.println("3. Russian");
        System.out.println("4. Moldavian");
        System.out.println("Выберите цифру: ");
        int language = scanner.nextInt();
        switch (language){
            case 1:
                System.out.println("Hello.");
                break;
            case 2:
                System.out.println("Bonjour.");
                break;
            case 3:
                System.out.println("Привет");
                break;
            case 4:
                System.out.println("Noroc");
                break;
            default:
                System.out.println("You chouse a wrong language, sorry! ");
        }
        scanner.close();
    }
}
