package Modulo1.Tarefa2;

import java.util.Scanner;

class Exercicio3 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int[] numeros = new int[5];

        for(int i=0; i<numeros.length; i++){
            System.out.printf("Escreva %do numero: ",i+1);
            numeros[i] = sn.nextInt();
        }

        for (int numero : numeros) {
            if (numero % 2 != 0) {
                System.out.print(numero + " ");
            }
        }

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }
    }
}