package Modulo1.Aula2;/*
 * Entradas e Saidas
 *
 * println -> usado para pular uma linha
 * print ->
 * printf -> usado para formatar
 * método formatted
 *
 * método Scanner
 * Scanner sn = new Scanner(System.in);
 * String texto = sn.nextLine();
 *
 * Estudar git
 *
 */

import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.print("Informe a hora: ");
        int hora = sn.nextInt();
        System.out.print("Informe os minutos: ");
        int min = sn.nextInt();
        System.out.print("Informe hora para adicionar: ");
        int add = sn.nextInt();

        String horarioBrasil = "Horário Brasil (GMT-3): %dh%dmin".formatted((hora + add) % 24, min);
        String horarioMexico = "Horário Mexico (GMT-6): %dh%dmin".formatted(((hora + add - 3) + 24) % 24, min);
        String horarioLondres = "Horário Londres (GMT): %dh%dmin".formatted((hora + add + 3) % 24, min);

        System.out.printf("%s\n%s\n%s\n",
                horarioBrasil,
                horarioMexico,
                horarioLondres);
    }
}
