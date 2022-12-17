package Modulo1.Tarefa2;

import java.util.Scanner;

class Exercicio6 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Escreva uma palavra: ");
        String palavra = sn.nextLine();
        StringBuilder nova_palavra = new StringBuilder();

        for(int i=0; i<palavra.length(); i++){
            if(i%2 == 0){
                nova_palavra.append(Character.toUpperCase(palavra.charAt(i)));
            }else{
                nova_palavra.append(palavra.charAt(i));
            }
        }

        System.out.println("A nova escrita fica: " + nova_palavra);

    }
}