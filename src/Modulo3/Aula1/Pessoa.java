package Modulo3.Aula1;

public class Pessoa implements Comparable{
    private final String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Object o) {
        if(!(o instanceof Pessoa)){
            throw new IllegalArgumentException("Somente é possivel comparar pessoas com outras pessoas");
        }

        Pessoa pessoa = (Pessoa) o;
        return this.nome.compareTo(pessoa.nome);
    }

    @Override
    public String toString() {
        return nome;
    }
}
