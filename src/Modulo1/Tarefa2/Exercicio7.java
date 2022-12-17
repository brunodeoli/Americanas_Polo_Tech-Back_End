package Modulo1.Tarefa2;

import java.util.Scanner;

class Exercicio7 {
    public static void main(String[] args) {
        final int TAM = 5;

        Scanner sn = new Scanner(System.in);

        String[] nomes = new String[TAM];
        int[] idades = new int[TAM];

        String velho = "";
        String novo = "";

        int maior_idade = Integer.MIN_VALUE;
        int menor_idade = Integer.MAX_VALUE;
        int media_idade = 0;

        for(int i=0; i<TAM; i++){
            System.out.printf("Escreva %do nome: ",i+1);
            nomes[i] = sn.next();
            System.out.printf("Escreva idade de %s: ",nomes[i]);
            idades[i] = sn.nextInt();
        }

        for(int i=0; i<TAM; i++){
            if(idades[i] > maior_idade){
                maior_idade = idades[i];
                velho = nomes[i];
            }
            if(idades[i] < menor_idade){
                menor_idade = idades[i];
                novo = nomes[i];
            }
            media_idade += idades[i];
        }

        media_idade /= idades.length;

        System.out.printf("O mais velho é %s\nO mais novo é %s \nA media de idades é %d", velho, novo, media_idade);
    }
}