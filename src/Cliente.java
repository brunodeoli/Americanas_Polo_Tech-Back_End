
public class Cliente {
    private String nome;
    private String CPF;
    private String senha;
    private Conta conta;

    public Cliente(String nome, String CPF, String senha, Conta conta) {
        this.nome = nome;
        this.CPF = CPF;
        this.senha = senha;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }
    public String getCPF() {
        return CPF;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Conta getConta() {
        return conta;
    }
}