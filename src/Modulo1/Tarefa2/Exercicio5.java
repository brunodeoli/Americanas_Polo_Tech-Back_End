package Modulo1.Tarefa2;

import java.util.Scanner;

class Exercicio5 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        String[] lista_de_nomes = new String[5];
        String maior_nome = "";

        for(int i=0; i<lista_de_nomes.length; i++){
            System.out.printf("Escreva o %do nome: ", i+1);
            lista_de_nomes[i] = sn.nextLine();
        }

        for (String nome : lista_de_nomes) {
            if (nome.length() > maior_nome.length()) {
                maior_nome = nome;
            }
        }

        System.out.println("O maior nome é " + maior_nome);
    }
}