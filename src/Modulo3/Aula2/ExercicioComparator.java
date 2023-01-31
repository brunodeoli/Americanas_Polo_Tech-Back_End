package Modulo3.Aula2;

import Modulo3.Aula1.Pessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExercicioComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Modulo3.Aula1.Pessoa> listaNomes = new ArrayList<>();
        String nome;
        LocalDate dataDeNascimento;

        listaNomes.add(new Modulo3.Aula1.Pessoa("Paula", LocalDate.parse("2012-12-12")));
        listaNomes.add(new Modulo3.Aula1.Pessoa("Pedro", LocalDate.parse("1965-05-02")));
        listaNomes.add(new Modulo3.Aula1.Pessoa("Maria", LocalDate.parse("1999-02-23")));
        listaNomes.add(new Modulo3.Aula1.Pessoa("Joao", LocalDate.parse("1999-02-23")));
        listaNomes.add(new Modulo3.Aula1.Pessoa("Ana", LocalDate.parse("1999-02-23")));
        listaNomes.add(new Modulo3.Aula1.Pessoa("Rodrigo", LocalDate.parse("1992-11-03")));

        Sair: while(true){
            System.out.println("Digite um nome para adicionar na lista ou 'sair' para finalizar:");
            nome = scanner.nextLine();
            if(nome.equals("sair")){
                break Sair;
            }
            System.out.println("Digite a data de nascimento de " + nome + " (yyyy-MM-dd):");
            dataDeNascimento = LocalDate.parse(scanner.nextLine());
            listaNomes.add(new Modulo3.Aula1.Pessoa(nome, dataDeNascimento));
        }

        imprimirListaOrdenada(listaNomes);

        scanner.close();
    }

    public static void imprimirListaOrdenada(List<Pessoa> lista){
        System.out.println("Segue a lista atual:");
        System.out.println(lista.toString());
        Collections.sort(lista);
        System.out.println("Segue a lista ordenada por idade:");
        System.out.println(lista.toString());
    }
}
