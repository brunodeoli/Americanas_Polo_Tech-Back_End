package Modulo3.Aula4;

import java.math.BigDecimal;

public class ExemploGenerics {
    public static void main(String[] args) {
        Integer dez = 10;
        Integer vinte = 20;
        String nome1 = "Bruno";
        String nome2 = "Anastacia";
        BigDecimal bd1 = new BigDecimal(100);
        BigDecimal bd2 = new BigDecimal(90);

        Integer maiorInteiro = maior(dez, vinte);
        Integer menorInteiro = menor(dez, vinte);
        String maiorNome = maior(nome1,nome2);
        String menorNome = menor(nome1, nome2);
        BigDecimal maiorBD = maior(bd1, bd2);
        BigDecimal menorBD = menor(bd1, bd2);

    }

    public static <T extends Comparable> T maior(T n1, T n2){
        if(n1.compareTo(n2)>0){
            System.out.println("O maior é: " + n1);
            return n1;
        }
        System.out.println("O maior é: " + n2);
        return n2;
    }

    public static <T extends Comparable> T menor(T n1, T n2){
        if(n1.compareTo(n2)<0){
            System.out.println("O menor é: " + n1);
            return n1;
        }
        System.out.println("O menor é: " + n2);
        return n2;
    }
}
