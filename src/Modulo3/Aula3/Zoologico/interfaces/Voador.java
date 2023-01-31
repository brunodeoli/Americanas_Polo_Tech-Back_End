package Modulo3.Aula3.Zoologico.interfaces;

public interface Voador {
    default void voar(){
        System.out.println("Voando...");
    }
}
