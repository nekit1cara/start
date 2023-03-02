package Lesson6;

public class NeastedLoops {
    public static void main(String[] args) {
                for (int i =2; i <= 50; i ++){
                    System.out.print("\n число " + i + " Делиться на : ");
                    for (int j = 2; j < i; j++){
                        if ((i%j) == 0) System.out.print(j + " ");
                    }
                }
            }
        }


