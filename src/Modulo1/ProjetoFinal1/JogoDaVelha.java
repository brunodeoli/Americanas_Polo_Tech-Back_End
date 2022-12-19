package Modulo1.ProjetoFinal1;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        Jogo jogo = new Jogo();
        int linha = 0;
        int coluna = 0;

        // jogo em aberto enquanto não tiver vencedor ou velha
        while(!jogo.verificaVencedor() && !jogo.verificaVelha()){
            if(jogo.rodada%2==0){
                System.out.println("-> Jogador 1, escolha uma casa para marcar com 'O':");
                linha = sn.nextInt();
                coluna = sn.nextInt();
                jogo.jogada('O', linha, coluna);
            } else{
                System.out.println("-> Jogador 2, escolha uma casa para marcar com 'X':");
                linha = sn.nextInt();
                coluna = sn.nextInt();
                jogo.jogada('X', linha, coluna);
            }
        }
    }
}

class Jogo{
    public int rodada = 0;
    private final Character[][] tabuleiro = new Character[3][3];

    public void jogada(char jogador, int linha, int coluna){
        if(verificaPosicao(linha,coluna)){
            this.tabuleiro[linha][coluna] = jogador;
            this.rodada++;
            imprimeTabuleiro();
        } else{
            System.out.println("\n* Casa já ocupada ou inválida, jogue novamente *\n");
        }
    }

    public boolean verificaPosicao(int linha, int coluna){
        //verifica se a casa que o jogador quer jogar esta livre e é valida
        boolean valida = (linha >= 0 && linha <= 2) && (coluna >= 0 && coluna <= 2);
        boolean livre = false;
        if(valida){
            livre = this.tabuleiro[linha][coluna] == null;
        }
        return livre && valida;
    }

    public boolean verificaVencedor(){
        for (int i = 0; i < this.tabuleiro.length; i++) {
            // verifica linhas
            if(this.tabuleiro[i][0] != null && this.tabuleiro[i][1] != null && this.tabuleiro[i][2] != null){
                char marcacao = this.tabuleiro[0][i];
                if ((marcacao == this.tabuleiro[1][i]) && (marcacao == this.tabuleiro[2][i])) {
                    int jogador = marcacao == 'O' ? 1 : 2;
                    System.out.println("JOGADOR " + jogador + " VENCEU!");
                    return true;
                }
            }
            // verifica colunas
            if(this.tabuleiro[0][i] != null && this.tabuleiro[1][i] != null && this.tabuleiro[2][i] != null){
                char marcacao = this.tabuleiro[0][i];
                if ((marcacao == this.tabuleiro[1][i]) && (marcacao == this.tabuleiro[2][i])) {
                    int jogador = marcacao == 'O' ? 1 : 2;
                    System.out.println("JOGADOR " + jogador + " VENCEU!");
                    return true;
                }
            }
            //verifica diagonal
        }
        return false;
    }

    public boolean verificaVelha(){
        if(this.rodada == 9){
            System.out.println("\nA PARTIDA DEU VELHA!\nSEM VENCEDOR");
            return true;
        }
        return false;
    }

    public void imprimeTabuleiro(){
        System.out.println("   RODADA "+this.rodada);
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
        System.out.println("-------------\n");
    }
}