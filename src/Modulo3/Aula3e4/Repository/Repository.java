package Modulo3.Aula3e4.Repository;

import Modulo3.Aula1.Pessoa;
import java.util.List;

public interface Repository {

    Pessoa salvar(Pessoa pessoa);
    void atualizar(Pessoa pessoa);
    boolean deletar(Pessoa pessoa);
    Pessoa consultar(String cpf);
    List<Pessoa> listarTodos();
}
