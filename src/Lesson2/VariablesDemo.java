package Lesson2;

public class VariablesDemo {
    public static void main(String[] args){
        boolean varBool = true;
        byte varByte = 120;
        char varChar = 'Z';
        double varDouble = 120.9;
        float varFloat = 120.9f ;
        int varInt = 120;
        long varLong = 120;
        short varShort = 120;

        System.out.println("Logical type:");

        System.out.println( "This is the value currently stored in the varBool variable" +
                varBool + "The values stored in such variable type might be true or false");

        System.out.println("Integer type:");

        System.out.println( "This is the value currently stored in the varBool variable" +
                varByte + "The values stored in such variable type might be range from -128 to 127");
        System.out.println( "This is the value currently stored in the varBool variable" +
                varInt + "The values stored in such variable type might be range from -2147483648 to 2147483647");
        System.out.println( "This is the value currently stored in the varBool variable" +
                varLong + "The values stored in such variable type might be –9 223 372 036 854 775 808 to 9 223 372 036 854 775 807");
        System.out.println( "This is the value currently stored in the varBool variable" +
                varShort + "The values stored in such variable type might be range from -32768 to 32767");

        System.out.println("Character type:");

        System.out.println( "This is the value currently stored in the varBool variable" +
                varChar + " The values stored in such variable type might be range from 0 to 65535");

        System.out.println("Floating-poin type:");

        System.out.println( "This is the value currently stored in the varBool variable" +
                varDouble + "The values stored in such variable type might be decimals");
        System.out.println( "This is the value currently stored in the varBool variable" +
                varFloat + "The values stored in such variable type might be decimals");


    }
}
