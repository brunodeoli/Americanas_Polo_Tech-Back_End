package Modulo3.Aula3e4.Repository;

import Modulo3.Aula1.Pessoa;

import java.util.List;

public class PessoaEmArquivoRepository implements Repository{

    private PessoaEmMemoriaRepository pessoaEmMemoriaRepository = new PessoaEmMemoriaRepository();

    @Override
    public Pessoa salvar(Pessoa pessoa) {
        return pessoaEmMemoriaRepository.salvar(pessoa);
    }

    @Override
    public void atualizar(Pessoa pessoa) {
        pessoaEmMemoriaRepository.atualizar(pessoa);
    }

    @Override
    public boolean deletar(Pessoa pessoa) {
        return pessoaEmMemoriaRepository.deletar(pessoa);
    }

    @Override
    public Pessoa consultar(String cpf) {
        return pessoaEmMemoriaRepository.consultar(cpf);
    }

    @Override
    public List<Pessoa> listarTodos() {
        return pessoaEmMemoriaRepository.listarTodos();
    }
}
