package Modulo1.Aula4;

import java.util.Scanner;



public class Aula4_Exercicio1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

//        System.out.print("Informe o ano: ");
//        int ano = sn.nextInt();
//        System.out.print("Informe o mes: ");
//        int mes = sn.nextInt();
//        System.out.print("Informe o dia: ");
//        int dia = sn.nextInt();
//        System.out.print("Informe o hora: ");
//        int hora = sn.nextInt();
//        System.out.print("Informe o minuto: ");
//        int minuto = sn.nextInt();
//        System.out.print("Informe o segundo: ");
//        int segundo = sn.nextInt();
//
//        System.out.print("Agora informe o valor a adicionar e o parametro [y, m, d, h, M, s]: ");
//        String valor_add = sn.next();

        Tempo tempo = new Tempo(2022, 12, 15, 20, 30, 30);

        tempo.imprimeTempo();

        String tempo_add = "6234d";

        char parametro = tempo_add.charAt(tempo_add.length() - 1);
        int valor = Integer.parseInt(tempo_add.substring(0, tempo_add.length() - 1));

        System.out.println("valor: " + valor + " parametro: " + parametro);

        switch (parametro) {
            case 'y':
                tempo.attAno(valor);
                break;
            case 'm':
                tempo.attMes(valor);
                break;
            case 'd':
                tempo.attDia(valor);
                break;
            case 'h':
                tempo.attHora(valor);
                break;
            case 'M':
                tempo.attMinuto(valor);
                break;
            case 's':
                tempo.attSegundo(valor);
                break;
            default:
                System.out.println("O valor é invalido");
        };

        tempo.imprimeTempo();

    }
}

class Tempo {
    int ano = 0;    int mes = 0;    int dia = 0;
    int hora = 0;    int minuto = 0;    int segundo = 0;

    private final int SEG_POR_MINUTO = 60;
    private final int MIN_POR_HORA = 60;
    private final int HORA_POR_DIA = 24;
    private final int MES_POR_ANO = 12;

    public Tempo(int y, int m, int d, int h, int M, int s) {
        this.ano = y;
        this.mes = m;
        this.dia = d;
        this.hora = h;
        this.minuto = M;
        this.segundo = s;
    }

    public void attAno(int add_ano) {
        this.ano += add_ano;
    }

    public void attMes(int add_mes) {
        int add_ano = (this.mes+add_mes)%MES_POR_ANO == 0 ? (this.mes+add_mes-1)/MES_POR_ANO : (this.mes+add_mes)/MES_POR_ANO;
        attAno(add_ano);
        this.mes = (this.mes+add_mes)%MES_POR_ANO == 0 ? 12 : (this.mes+add_mes)%MES_POR_ANO;
    }

    public void attDia(int add_dia) {
        int add_mes = (this.dia+add_dia)%30 == 0 ? (this.dia+add_dia-1)/30 : (this.dia+add_dia)/30;
        attMes(add_mes);
        this.dia = (this.dia+add_dia)%30 == 0 ? 30 : (this.dia+add_dia)%30;
    }

    public void attHora(int add_hora) {
        attDia((this.hora+add_hora)/HORA_POR_DIA);
        this.hora = (this.hora+add_hora)%HORA_POR_DIA;
    }

    public void attMinuto(int add_minuto) {
        attHora((this.minuto+add_minuto)/MIN_POR_HORA);
        this.minuto = (this.minuto+add_minuto)%MIN_POR_HORA;
    }

    public void attSegundo(int add_segundo) {
        attMinuto((this.minuto+add_segundo)/SEG_POR_MINUTO);
        this.segundo = (this.segundo+add_segundo)%SEG_POR_MINUTO;
    }

    public void imprimeTempo(){
        System.out.printf("A data é: %02d/%02d/%d %02d:%02d:%02d\n", this.dia, this.mes, this.ano, this.hora, this.minuto, this.segundo);
    }
}