package Modulo3.Aula3e4.Repository;

import Modulo3.Aula1.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaEmMemoriaRepository implements Repository {
    private List<Pessoa> dados = new ArrayList<>();

    @Override
    public Pessoa salvar(Pessoa pessoa) {
        if(consultar(pessoa.getCpf()) != null){
            throw new IllegalArgumentException("Já existe uma pessoa cadastrada com esse CPF");
        }
        dados.add(pessoa);
        return pessoa;
    }

    @Override
    public void atualizar(Pessoa pessoa) {
        if(consultar(pessoa.getCpf()) == null){
            throw new IllegalArgumentException("Não existe uma pessoa cadastrada com esse CPF");
        }
        deletar(pessoa);
        salvar(pessoa);
    }

    @Override
    public boolean deletar(Pessoa pessoa) {
        if(consultar(pessoa.getCpf()) == null){
            throw new IllegalArgumentException("Não existe uma pessoa cadastrada com esse CPF");
        }
        dados.remove(pessoa);
        return true;
    }

    @Override
    public Pessoa consultar(String cpf) {
//        List<String> listaDeCpfs = dados.stream()
//                .map(Pessoa::getCpf)
//                .collect(Collectors.toList());
//        int indexCpf = (listaDeCpfs.indexOf(cpf));
//        if(indexCpf == -1){
//            throw new IllegalArgumentException("Não existe uma pessoa cadastrada com esse CPF");
//        }
//        return dados.get(indexCpf);

//        Optional<Pessoa> pessoa = dados.stream()
//                .filter(p -> p.getCpf().equals(cpf))
//                .findFirst();
//        return pessoa.orElse(null);

        for(Pessoa pessoa: dados){
            if(pessoa.getCpf().equals(cpf)){
                return pessoa;
            }
        }
        return null;
    }

    @Override
    public List<Pessoa> listarTodos() {
        return new ArrayList<>(dados);
    }
}
