package Modulo3.Aula3e4.Zoologico;

import Modulo3.Aula3e4.Zoologico.classes.Pardal;
import Modulo3.Aula3e4.Zoologico.classes.Tilapia;
import Modulo3.Aula3e4.Zoologico.classes.Vaca;

public class Zoologico {
    public static void main(String[] args) {
        Vaca vaca = new Vaca();
        Tilapia tilapia = new Tilapia();
        Pardal pardal = new Pardal();

        vaca.comer("Pasto");
        tilapia.comer("Pao");
        pardal.comer("Alpiste");
    }
}
