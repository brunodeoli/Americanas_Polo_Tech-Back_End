package Modulo3.Aula3e4.Zoologico.classes;

import Modulo3.Aula3e4.Zoologico.interfaces.Comedor;

public class Galinha implements Comedor {

    @Override
    public void comer(String alimento) {
        System.out.println("Bicando " + alimento);
    }
}
