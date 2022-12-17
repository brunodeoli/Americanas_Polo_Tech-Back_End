package Modulo1.Tarefa2;

class Exercicio9 {
    public static void main(String[] args) {

        float populacaoA = 80000F;
        float taxaA = 0.03F;
        float populacaoB = 200000F;
        float taxaB = 0.015F;

        int anos = 0;

        while(populacaoA<populacaoB){
            populacaoA *= (1+taxaA);
            populacaoB *= (1+taxaB);
            anos++;
        }

        System.out.println("O numero para populacao A ser maior ou igual a populacao B é de " + anos + " anos");
    }
}