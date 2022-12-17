package Modulo1.Aula3;/*
 * Em Java, funções é chamada de método:
 * é utilizado camelCase na declaração do nome
 * [modificador] tipo_retorno nome ([argumentos])
 *
 * public: Pode ser acessado por qualquer outra classe do projeto
 * protected: Podem ser acessados pelos métodos da própria classe, pelas classes do mesmo pacote e pelas classes derivadas.
 * private: Só podem ser acessados pelos métodos da própria classe.
 *
 *
 */

import java.util.Scanner;

public class Aula3 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Informe o numero 1: ");
        int num1 = sn.nextInt();
        System.out.print("Informe o numero 2: ");
        int num2 = sn.nextInt();

        System.out.println("A soma é: " + somarNumeros(num1,num2));
        System.out.println("A subtração é: " + subtrairNumeros(num1,num2));
        System.out.println("A multiplicação é: " + multiplicarNumeros(num1,num2));
        System.out.println("A divisão é: " + dividirsNumeros(num1,num2));
    }

    public static int somarNumeros(int num1, int num2){
        return num1+num2;
    }
    public static int subtrairNumeros(int num1, int num2){
        return num1-num2;
    }
    public static int multiplicarNumeros(int num1, int num2){
        return num1*num2;
    }
    public static int dividirsNumeros(int num1, int num2){
        return num1/num2;
    }

}