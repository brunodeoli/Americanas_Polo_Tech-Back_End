package Modulo3.Aula3e4.Zoologico.interfaces;

public interface Comedor {
    default void comer(String alimento){
        System.out.println(getClass().getSimpleName() + " comendo " + alimento);
    }
}