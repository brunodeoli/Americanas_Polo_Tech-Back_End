package Modulo3.Aula1;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa implements Comparable{
    private final String nome;
    private final LocalDate dataDeNascimento;
    private String sobrenome;
    private String cpf;

    public Pessoa(String nome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    //Ordenar por nome da pessoa
//    @Override
//    public int compareTo(Object o) {
//        if(!(o instanceof Pessoa)){
//            throw new IllegalArgumentException("Somente é possivel comparar pessoas com outras pessoas");
//        }
//        Pessoa pessoa = (Pessoa) o;
//        return this.nome.compareTo(pessoa.nome);
//    }

    //Ordenar por data de nascimento
    @Override
    public int compareTo(Object o) {
        if(!(o instanceof Pessoa)){
            throw new IllegalArgumentException("Somente é possivel comparar pessoas com outras pessoas");
        }
        Pessoa pessoa = (Pessoa) o;
        if(this.dataDeNascimento.equals(pessoa.dataDeNascimento)){
            return this.nome.compareTo(pessoa.nome);
        }
        return pessoa.dataDeNascimento.compareTo(this.dataDeNascimento);
    }

    @Override
    public String toString() {
        final LocalDate dataAtual = LocalDate.now();
        final Period periodo = Period.between(dataDeNascimento, dataAtual);
        return nome + " " + periodo.getYears() + " anos, "
                + periodo.getMonths() + " mes(es) e "
                + periodo.getDays() + " dias" ;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }


}
