package Lesson5;

import java.util.Scanner;

public class BreakDemo2 {
    public static void main(String[] args) {
        char ch;
        var input = new Scanner(System.in);
        for (; ; ) {
            ch = input.next().charAt(0);
          if (ch == 'q') break;
        }

        while (true) break;
        System.out.println(" You have is stopped! ");
    }
}