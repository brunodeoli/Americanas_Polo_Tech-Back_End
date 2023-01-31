package Modulo3.Aula2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;

public class Pessoa implements Comparator<Pessoa>{
    private final String nome;
    private final LocalDate dataDeNascimento;

    public Pessoa(String nome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    //Ordenar por data de nascimento
//    @Override
//    public int compareTo(Object o) {
//        if(!(o instanceof Pessoa)){
//            throw new IllegalArgumentException("Somente é possivel comparar pessoas com outras pessoas");
//        }
//        Pessoa pessoa = (Pessoa) o;
//        if(this.dataDeNascimento.equals(pessoa.dataDeNascimento)){
//            return this.nome.compareTo(pessoa.nome);
//        }
//        return pessoa.dataDeNascimento.compareTo(this.dataDeNascimento);
//    }

    @Override
    public String toString() {
        final LocalDate dataAtual = LocalDate.now();
        final Period periodo = Period.between(dataDeNascimento, dataAtual);
        return nome + " " + periodo.getYears() + " anos, "
                + periodo.getMonths() + " mes(es) e "
                + periodo.getDays() + " dias" ;
    }

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return 0;
    }
}
