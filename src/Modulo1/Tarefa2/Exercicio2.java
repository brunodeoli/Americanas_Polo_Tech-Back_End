package Modulo1.Tarefa2;

import java.util.Scanner;

class Exercicio2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Escreva uma palavra para ser invertida: ");
        String palavra = sn.nextLine();
        StringBuilder palavra_inversa = new StringBuilder();

        for(int i=palavra.length()-1; i>=0; i--){
            palavra_inversa.append(palavra.charAt(i));
        }

        System.out.println("A palavra invertida é: " + palavra_inversa);
    }
}