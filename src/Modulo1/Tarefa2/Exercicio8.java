package Modulo1.Tarefa2;

import java.util.Scanner;

class Exercicio8 {
    public static void main(String[] args) {
        final float IMC_MIN = 18.5F;
        final float IMC_MAX = 25F;

        Scanner sn = new Scanner(System.in);

        Pessoa[] pessoa = new Pessoa[5];

        for(int i=0; i<pessoa.length; i++){
            System.out.printf("%d Escreva nome, altura (m) e peso (kg) (separados por espaço): \n",i+1);
            pessoa[i] = new Pessoa(sn.next(), sn.nextFloat(), sn.nextFloat());
        }

        for (Pessoa p : pessoa) {
            if(p.imc < IMC_MIN || p.imc > IMC_MAX){
                System.out.printf("%s está fora do peso, pois tem imc de %.2f\n",p.nome, p.imc);
            }
        }
    }
}

class Pessoa{
    public String nome = "";
    public float altura = 0;
    public float peso = 0;
    public float imc = 0;

    public Pessoa(String nome, float altura, float peso){
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.imc = peso/(altura*altura);
    }
}