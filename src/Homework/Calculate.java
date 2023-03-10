package Homework;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println(" Выбери первое число: ");
        int n1 = Scanner.nextInt();
        System.out.println(" Выбери второе число: ");
        int n2 = Scanner.nextInt();
        System.out.println("Твой ответ: ");
//        System.out.println(n1 + n2 );
        int sum = n1 + n2;
        System.out.println("Ответ " + sum);
        int avg = sum / 2;
        System.out.println("Среднее значение ответа: " + avg);


    }
}
