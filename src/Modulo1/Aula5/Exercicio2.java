package Modulo1.Aula5;

/*
 * Exercicio 2.
 * Faça um programa que receba dois números inteiros e
 * gere os números inteiros que estão no
 * intervalo compreendido por eles.
 */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        int numero1 = sn.nextInt();
        System.out.print("Informe o segundo numero: ");
        int numero2 = sn.nextInt();

        //Verificação de maior numero
        if(numero2<numero1){
            int aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }

        //Impressão do intervalo entre numero1 e numero2
        for (int i = numero1; i <= numero2; i++) {
            System.out.print(i + " ");
        }
    }
}
