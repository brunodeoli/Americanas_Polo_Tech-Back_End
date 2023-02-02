package Modulo3.Aula3e4.Repository;

import Modulo3.Aula1.Pessoa;

import java.io.*;
import java.util.List;

public class EscreverEmArquivo {

    void escreverEmArquivo(List<Pessoa> dados){
        ObjectOutputStream escritor = criarFileOutputStream();
        try{
            escritor.writeObject(dados);
        } catch (IOException e){
            System.out.println("Erro na hora de escrever arquivo");
            e.printStackTrace();
        } finally {
            try {
                escritor.close();
            } catch (IOException e){
                System.out.println("Erro na hora de fechar arquivo");
                e.printStackTrace();
            }
        }
    }

    private static ObjectOutputStream criarFileOutputStream(){
        try{
            OutputStream fileoutputStream = new FileOutputStream("dados_pessoa.txt");
            return new ObjectOutputStream(fileoutputStream);
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
