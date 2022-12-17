package Modulo1.Aula5;
/*
 * Estrutura de repetição ou controle de repetição
 * O que torna nosso sistema dinamico são os loops
 *
 * Vetores
 *
 *
 */
public class Aula5 {

    public static void main(String[] args) {
        //PARA
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        //ENQUANTO
        int i = 0;
        while(i<10){
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        //REPETE
        do{
            i--;
            System.out.print(i + " ");
        } while (i>0);

        System.out.println();

        //VETOR
        int[] array = new int[10];

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
        //for-each
        for(int num : array){
            System.out.print(num + " ");
        }
    }
}
