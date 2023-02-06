package Modulo3.Aula5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteador<E> {

    private final List<E> lista;

    public Sorteador(List<E> lista) {
        this.lista = lista;
    }

    public Dupla<E, Integer> sortear() {
        if (lista.isEmpty()) {
            throw new IllegalArgumentException("A lista está vazia");
        }
        int indiceSorteado = ThreadLocalRandom.current().nextInt(lista.size());
        E elementoSorteado = lista.remove(indiceSorteado);
        return new Dupla<>(elementoSorteado, indiceSorteado);
    }

    public List<Grupo<E>> agrupar(int numeroDeGrupos) {
        List<Grupo<E>> grupos = inicializarGrupos(numeroDeGrupos);
        int indiceGrupoAtual = 0;
        dividirEmGrupos(numeroDeGrupos, grupos);
        return grupos;
    }

    private boolean hasNext() {
        return !lista.isEmpty();
    }

    private List<Grupo<E>> inicializarGrupos(int numeroDeGrupos) {
        List<Grupo<E>> grupos = new ArrayList<>();
        for (int i = 0; i < numeroDeGrupos; i++) {
            grupos.add(new Grupo<>());
        }
        return grupos;
    }

    private void dividirEmGrupos(int numeroDeGrupos, List<Grupo<E>> grupos){
        int indiceGrupoAtual = 0;
        while(hasNext()){
            Dupla<E, Integer> elementoEIndiceSorteado = sortear();
            E elementoSorteado = elementoEIndiceSorteado.getPrimeiro();
            Integer indiceSorteado = elementoEIndiceSorteado.getSegundo();
            grupos.get(indiceGrupoAtual).addNoGrupo(elementoSorteado);
            indiceGrupoAtual++;
            if(indiceGrupoAtual == numeroDeGrupos){
                indiceGrupoAtual = 0;
            }
        }
    }

}

