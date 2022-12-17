package Modulo1.Aula3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Informe a hora: ");
        int hora = sn.nextInt();
        System.out.print("Informe o minutos: ");
        int min = sn.nextInt();
        System.out.print("Informe minutos para adicionar: ");
        int add = sn.nextInt();

        HoraEMinuto horario = atualizaHorario(hora,min,add);

        imprimirHorario("Brasil", horario.hora, horario.minuto, 0);
        imprimirHorario("México", horario.hora, horario.minuto,-3);
        imprimirHorario("Londres", horario.hora, horario.minuto,3);
    }

    private static HoraEMinuto atualizaHorario(int hora, int min, int add){
        int novaHora = (hora+(min+add)/60);
        int novoMin = (min+add)%60;

        HoraEMinuto resultado = new HoraEMinuto();
        resultado.hora = novaHora;
        resultado.minuto = novoMin;

        return resultado;
    }

    public static void imprimirHorario(String local, int hora, int min, int dif){
        System.out.printf("Horário %s: %dh%dmin\n", local, ((hora + dif) + 24) % 24, min);
    }
}

class HoraEMinuto{
    int hora;
    int minuto;
}