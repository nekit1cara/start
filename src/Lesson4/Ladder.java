package Lesson4;

public class Ladder {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 6; x++) {
            if (x==1)
                System.out.println("x is equal to 1");
            else if (x==2) System.out.println("x is equal to 2");
            else if (x==3) System.out.println("x is equal to 3");
            else if (x==4) System.out.println("x is equal to 4");
            else  System.out.println("x is " + x + " and out of range 1 - 4");
        }
        char ch1 = 'A';
        char ch2 = 'I';
        switch (ch1){
            case 'A':
                System.out.println("This is \"A\" section of our OUTER switch");
                switch (ch2) {
            case 'I':
                System.out.println("This is \"I\" section of our OUTER switch");
                }
                break;
            case 'B':
                System.out.println("This is \"A\" section of our OUTER switch");
        }
    }
}
