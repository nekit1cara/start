package Lesson4;

import java.util.Scanner;

public class InputWithScanner {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        String myString;

        int number1;
        int number2;
        int sum;
        char l;



        System.out.println("Enter the String: ");
        myString = name.nextLine();
        System.out.println("My line is : \" " + myString + "\"");


        System.out.println("Enter first integer: ");
        number1 = name.nextInt();
        System.out.println("Enter second integer: ");

        number2 = name.nextInt();
        sum = number1 + number2;
        System.out.println("Sum is : " + sum);
        System.out.println("Enter a symbol ");
        l = name.next().charAt(0);
        System.out.println("l is " + l);
    }
}
