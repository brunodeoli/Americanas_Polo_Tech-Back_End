package Modulo1.Aula5;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Informe uma palavra/frase: ");
        String palavra = sn.nextLine();

        String palavra_reversa = "";

        for (int i = palavra.length()-1; i >= 0 ; i--) {
            palavra_reversa += palavra.charAt(i);
        }

        if(palavra_reversa.replace(" ", "").equals(palavra.replace(" ", ""))){
            System.out.println("É PALINDROMO");
        } else{
            System.out.println("NÃO É PALINDROMO");
        }
    }
}