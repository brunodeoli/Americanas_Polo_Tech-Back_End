package Modulo3.Aula1;


//Ordenar uma lista de palavras

import java.util.*;

import static java.util.Arrays.sort;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Pessoa> listaNomes = new ArrayList<>();
        String nome;

        Sair: while(true){
            System.out.println("Digite uma palavra para adicionar na lista ou 'sair' para finalizar:");
            nome = scanner.nextLine();
            if(nome.equals("sair")){
                break Sair;
            }
            listaNomes.add(new Pessoa(nome));
        }

        imprimirListaOrdenada(listaNomes);

        scanner.close();
    }

    public static void imprimirListaOrdenada(List<Pessoa> lista){
        System.out.println("Segue a lista atual:");
        System.out.println(lista.toString());
        Collections.sort(lista);
        System.out.println("Segue a lista ordenada:");
        System.out.println(lista.toString());
    }
}
