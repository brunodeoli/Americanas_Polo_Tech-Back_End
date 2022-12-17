package Modulo1.Tarefa2;

class Exercicio9 {
    public static void main(String[] args) {

        float populacaoA = 80000F;
        float TAXA_A = 0.03F;
        float populacaoB = 200000F;
        float TAXA_B = 0.015F;

        int anos = 0;

        while(populacaoA<populacaoB){
            populacaoA *= (1+TAXA_A);
            populacaoB *= (1+TAXA_B);
            anos++;
        }

        System.out.println("O numero para populacao A ser maior ou igual a populacao B é de " + anos + " anos");
    }
}