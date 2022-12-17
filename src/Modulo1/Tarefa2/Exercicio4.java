package Modulo1.Tarefa2;

import java.util.Scanner;

class Exercicio4 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int[] numeros = new int[5];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int media = 0;

        for(int i=0; i<numeros.length; i++){
            System.out.printf("Escreva %do numero: ",i+1);
            numeros[i] = sn.nextInt();
        }

        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            media += numero;
        }

        media /= numeros.length;

        System.out.printf("O maior numero é %d \nO menor numero é %d \nA media é %d", maior, menor, media);
    }
}