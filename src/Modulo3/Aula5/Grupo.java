package Modulo3.Aula5;

import java.util.ArrayList;
import java.util.List;

public class Grupo<E> {

    private List<E> grupo = new ArrayList<>();

    public void addNoGrupo(E elemento){
        grupo.add(elemento);
    }

    @Override
    public String toString() {
        return "Grupo["
                + grupo +
                ']';
    }
}
