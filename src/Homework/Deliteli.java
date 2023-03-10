package Homework;

import java.util.Scanner;

public class Deliteli {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Выберите число: ");
        int num = Scanner.nextInt();
        System.out.println(" Ваше число " + num);
        for (int i = 1; i <= num; i++){
            if (i % 2 == 0){
                System.out.println("Делиться на : " + i);
            }
        }
    }
}