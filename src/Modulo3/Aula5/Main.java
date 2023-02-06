package Modulo3.Aula5;

/*
    Criar uma classe Sorteador genérica que recebe uma lista de Elementos.
    Tem um método sortear que seleciona um elemento randômico da lista,
    remove e retorna esse elemento da Lista.

    Adicionar no Sorteador um método chamado agrupar que recebe um inteiro
    o qual indica o numero de grupos a ser criado. Esse sorteará os elementos
    da Lista e adicionará nos grupos até que não tenham mais elementos na lista.
    Deve retornar a lista dos grupos.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(List.of(
                "Bruno",
                "Lucas",
                "Gustavo",
                "Ana",
                "George",
                "João",
                "Henrique",
                "Francine",
                "Diego",
                "Laura",
                "Larissa",
                "Amanda",
                "Danffer",
                "Muié do Diego"));

        Sorteador<String> sorteador = new Sorteador<>(lista);

        List<Grupo<String>> grupos = sorteador.agrupar(5);

        grupos.stream()
                .forEach(System.out::println);

    }
}
