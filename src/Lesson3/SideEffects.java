package Lesson3;

public class SideEffects {
    public static void main(String[] args) {
        int i = 0;

        if (true | (++i < 100))
            System.out.println("Эта линия не должна отображаться");
        System.out.println("Если оператор if выполняется " + i);

        if (true || (++i < 100))
            System.out.println("Эта линия не должна отображаться");
        System.out.println("Если оператор if выполняется " + i);

    }
}
