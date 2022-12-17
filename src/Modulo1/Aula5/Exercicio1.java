package Modulo1.Aula5;

import java.util.Scanner;

/*
 * Exercicio 1.
 * Faça um programa que leia 5 números e informe o maior número.
 */

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int maior_numero = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe um numero: ");
            int numero = sn.nextInt();

            maior_numero = Integer.max(maior_numero, numero);
        }

        System.out.println("O maior numero informado foi " + maior_numero);
    }
}
