package Modulo3.Aula3e4.Zoologico.interfaces;

public interface Voador {
    default void voar(){
        System.out.println("Voando...");
    }
}
