package Lesson4;

import java.io.IOException;

public class InputWithSystemIntDemo {
    public static void main(String[] args) throws IOException {
        char ch;
        System.out.println("Enter a symbol and press [Enter] : ");
        ch = (char) System.in.read();
        System.out.println("You entered symbols " + ch);
    }
}
