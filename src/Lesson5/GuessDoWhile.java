package Lesson5;

import java.util.Scanner;

public class GuessDoWhile {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        char ch;
        int endofRange = 90;
        int startofRange = 65;
        char answer = (char) (Math.random() * (endofRange - startofRange) + startofRange);


       do {
        System.out.println("The letter that you should guess is from the range of A to Z\npress [!] to quit! ");
        System.out.println("Try to guess it");
        ch = name.next().charAt(0);

       if (ch < answer & ch != '!')
           System.out.println("Sorry but ");
       else if (ch > answer & ch != '!')
           System.out.println("Sorry but ");
       else if (ch == answer )
           System.out.println("Right ! ");
       }
       while (ch != answer && ch != '!');
        System.out.println("The right letter was " + answer + "\nGood bye! ");
    }
}
