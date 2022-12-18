package Modulo1.ProjetoFinal1;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        Jogo jogo = new Jogo();
        int linha = 0;
        int coluna = 0;

        jogo.jogada_atual = 8;

        if(jogo.jogada_atual%2==0){
            System.out.println("Jogador 1, escolha uma casa para marcar com 'O': ");
            linha = sn.nextInt();
            coluna = sn.nextInt();
            jogo.jogada('O', linha, coluna);
        } else{
            System.out.println("Jogador 2, escolha uma casa para marcar com 'X': ");
            linha = sn.nextInt();
            coluna = sn.nextInt();
            jogo.jogada('X', linha, coluna);
        }


    }
}

class Jogo{
    public int jogada_atual = 0;
    private Character[][] tabuleiro = new Character[3][3];

    public void jogada(char jogador, int linha, int coluna){
        if(verificaPosicao(linha,coluna)){
            this.tabuleiro[linha][coluna] = jogador;
            this.jogada_atual++;
            imprimeTabuleiro();
            verificaVencedor(jogador);
            verificaVelha();
        }



    }

    public boolean verificaPosicao(int linha, int coluna){
        //verifica se a posicao que o jogador quer jogar esta livre
        return (linha >= 0 && linha <= 2) && (coluna >= 0 && coluna <= 2);
    }

    public boolean verificaVencedor(char jogador){
        return false;
    }

    public boolean verificaVelha(){
        if(this.jogada_atual == 9){
            System.out.println("A PARTIDA DEU VELHA!\nSEM VENCEDOR");
            return true;
        }
        return false;
    }

    public void imprimeTabuleiro(){
        System.out.println("   JOGADA "+this.jogada_atual);
        for (int i = 0; i < this.tabuleiro.length; i++) {
            Character[] linha = this.tabuleiro[i];
            System.out.print("[ ");
            for (int j = 0; j < this.tabuleiro[i].length; j++) {
                Character elemento = this.tabuleiro[i][j];
                if(elemento==null){
                    System.out.print("_");
                }else{
                    System.out.print(elemento);
                }
                if(j == linha.length-1){
                    System.out.print(" ]\n");
                }else{
                    System.out.print(" | ");
                }
            }
        }
        System.out.println("-------------");
    }
}