package Modulo3.Aula3.Zoologico.interfaces;

public interface Amamentador {
    default void amamentar(){
        System.out.println(getClass().getSimpleName() + " Amamentando filhotes...");
    }
}
