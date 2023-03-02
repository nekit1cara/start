package Lesson3;

public class ModDemo {
    public static void main(String[]args){
        int iresault,irem;
        double dresault, drem;

        iresault = 10/3;
        irem = 10%3;

        dresault = 10.0 / 3.0;
        drem = 10 % 3;
        System.out.println("Результвт и остаток деления 10/3: " + iresault + " " + irem);
        System.out.println("Результвт и остаток деления 10.0 / 3.0 : " + dresault + " " + drem);
    }
}
