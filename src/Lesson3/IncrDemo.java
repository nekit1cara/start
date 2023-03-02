package Lesson3;

public class IncrDemo {
    public static void main(String[] args) {
        int x = 0;
        x = x + 1;
        x++;
        System.out.println("x = " + x);
        x = x - 1;
        x--;
        System.out.println("x = " + x);

        x = 10;
        int y = ++x;
        System.out.println("y = " + y);

        y = x++;
        System.out.println("y = " + y);
        System.out.println("x = " + x);
    }
}
