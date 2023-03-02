package Lesson5;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        char ch;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter a symbol and press [Enter] ");
            ch = input.next().charAt(0);
        } while (ch != 'q' );
    }
}
