package Homework;

import java.util.Scanner;

public class TrueFalse {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите число :");
        int p1 = Scanner.nextInt();
        if ( p1 % 2 == 0){
            System.out.println(" Чётное");
        }
        else {
            System.out.println("Не чётное");
        }
    }
}
