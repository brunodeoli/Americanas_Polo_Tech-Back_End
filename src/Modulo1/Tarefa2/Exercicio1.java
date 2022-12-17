package Modulo1.Tarefa2;

import java.util.Scanner;
import java.util.Arrays;

class Exercicio1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        String[] carrinho_de_compras = new String[5];

        for(int i=0; i<carrinho_de_compras.length; i++){
            System.out.print("Escreva o nome de uma fruta: ");
            carrinho_de_compras[i] = sn.nextLine();
        }

        System.out.println("No carrinho de compras tem: " + Arrays.toString(carrinho_de_compras));
    }
}