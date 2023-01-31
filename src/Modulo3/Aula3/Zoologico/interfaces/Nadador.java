package Modulo3.Aula3.Zoologico.interfaces;

public interface Nadador {
    default void nadar(){
        System.out.println("Nadando...");
    }
}
