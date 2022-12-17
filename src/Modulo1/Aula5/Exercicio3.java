package Modulo1.Aula5;

public class Exercicio3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do "+i);
            for (int j = 1; j <= 10 ; j++) {
                System.out.printf("%d x %d = %d\n", j, i, (i*j));
            }
            System.out.println("----------------------------");
        }

    }
}
