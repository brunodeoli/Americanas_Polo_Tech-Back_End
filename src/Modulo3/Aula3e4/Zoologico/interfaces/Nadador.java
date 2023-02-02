package Modulo3.Aula3e4.Zoologico.interfaces;

public interface Nadador {
    default void nadar(){
        System.out.println("Nadando...");
    }
}
