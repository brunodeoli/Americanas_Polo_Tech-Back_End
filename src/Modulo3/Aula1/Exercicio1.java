package Modulo3.Aula1;

//Ordenar uma lista de pessoas por nome / idade

import java.time.LocalDate;
import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Pessoa> listaNomes = new ArrayList<>();
        String nome;
        LocalDate dataDeNascimento;


        listaNomes.add(new Pessoa("Paula", LocalDate.parse("2012-12-12")));
        listaNomes.add(new Pessoa("Pedro", LocalDate.parse("1965-05-02")));
        listaNomes.add(new Pessoa("Maria", LocalDate.parse("1999-02-23")));
        listaNomes.add(new Pessoa("Joao", LocalDate.parse("1999-02-23")));
        listaNomes.add(new Pessoa("Ana", LocalDate.parse("1999-02-23")));
        listaNomes.add(new Pessoa("Rodrigo", LocalDate.parse("1992-11-03")));


        Sair: while(true){
            System.out.println("Digite um nome para adicionar na lista ou 'sair' para finalizar:");
            nome = scanner.nextLine();
            if(nome.equals("sair")){
                break Sair;
            }
            System.out.println("Digite a data de nascimento de " + nome + " (yyyy-MM-dd):");
            dataDeNascimento = LocalDate.parse(scanner.nextLine());
            listaNomes.add(new Pessoa(nome, dataDeNascimento));
        }

        //imprimirListaOrdenadaPorNome(listaNomes);

        imprimirListaOrdenadaPorIdade(listaNomes);

        scanner.close();
    }

//    public static void imprimirListaOrdenadaPorNome(List<Pessoa> lista){
//        System.out.println("Segue a lista atual:");
//        System.out.println(lista.toString());
//        Collections.sort(lista);
//        Collections.reverse(lista);
//        System.out.println("Segue a lista ordenada por nome:");
//        System.out.println(lista.toString());
//    }

    public static void imprimirListaOrdenadaPorIdade(List<Pessoa> lista){
        System.out.println("Segue a lista atual:");
        System.out.println(lista.toString());
        Collections.sort(lista);
        System.out.println("Segue a lista ordenada por idade:");
        System.out.println(lista.toString());
    }
}
