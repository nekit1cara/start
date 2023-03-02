package Lesson5;

public class Power {
    public static void main(String[] args) {
        int e;
        int resault;
        for (int i = 0; i <= 10; i++){
            resault = 1;
            e = i;
            while (e > 0 ){
                resault  *=2;
                e --;
            }
            System.out.println("2 в степени " + i + " равно " + resault);
        }
    }
}
