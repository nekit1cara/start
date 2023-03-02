package Lesson3;

public class AutoCasDemo {
    public static void main(String[] args) {
        int i;
        float f ;
        i = 10;
        f = i;
        System.out.println(f);
        long l = 100;
        double d = l;

        i = (int) l;
        l = i;
    }
}
