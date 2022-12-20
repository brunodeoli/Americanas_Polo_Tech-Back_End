package Modulo1.ProjetoFinal1;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        Jogo jogo = new Jogo();

        int linha = 0;
        int coluna = 0;

        jogo.inicio();

        // jogo em aberto enquanto nao tiver vencedor ou velha
        do {
            if (jogo.rodada % 2 == 0) {
                System.out.println("-> Jogador 1, escolha uma casa para marcar com 'O':");
                try {
                    linha = sn.nextInt();
                    coluna = sn.nextInt();
                    jogo.jogada('O', linha, coluna);
                } catch(java.util.InputMismatchException e){
                    System.out.println("O valor informado é invalido");
                    break;
                }
            } else {
                try {
                    System.out.println("-> Jogador 2, escolha uma casa para marcar com 'X':");
                    linha = sn.nextInt();
                    coluna = sn.nextInt();
                    jogo.jogada('X', linha, coluna);
                } catch(java.util.InputMismatchException e){
                    System.out.println("O valor informado é invalido");
                    break;
                }
            }
        } while(!jogo.verificaVencedor() && !jogo.verificaVelha());

        sn.close();
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
            System.out.println("\n* Casa ja ocupada ou invalida, jogue novamente *\n");
        }
    }

    private boolean verificaPosicao(int linha, int coluna){
        //verifica se a casa que o jogador quer jogar esta livre e eh valida
        boolean valida = (linha >= 0 && linha <= 2) && (coluna >= 0 && coluna <= 2);
        boolean livre = false;
        if(valida){
            livre = this.tabuleiro[linha][coluna] == null;
        }
        return livre && valida;
    }

    public boolean verificaVencedor(){
        //verifica diagonais
        boolean verifica_diagonal = verificaCasasIguais(this.tabuleiro[0][0], this.tabuleiro[1][1], this.tabuleiro[2][2]);
        boolean verifica_inversa = verificaCasasIguais(this.tabuleiro[0][2], this.tabuleiro[1][1], this.tabuleiro[2][0]);
        if(verifica_diagonal || verifica_inversa){
            return true;
        }

        // verifica linhas e colunas
        for (int i = 0; i < this.tabuleiro.length; i++) {
            boolean verifica_linha = verificaCasasIguais(this.tabuleiro[i][0], this.tabuleiro[i][1], this.tabuleiro[i][2]);
            boolean verifica_coluna = verificaCasasIguais(this.tabuleiro[0][i], this.tabuleiro[1][i], this.tabuleiro[2][i]);
            if(verifica_linha || verifica_coluna){
                return true;
            }
        }

        // retorna falso se nao encontrou vencedor
        return false;
    }

    private boolean verificaCasasIguais(Character casa1, Character casa2, Character casa3){
        boolean isValid = casa1 != null && casa2 != null && casa3 != null;
        if(isValid){
            char marcacao = casa1;
            if (marcacao == casa2 && marcacao == casa3) {
                int jogador = marcacao == 'O' ? 1 : 2;
                System.out.println("JOGADOR " + jogador + " VENCEU!");
                return true;
            }
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
        System.out.println("=== RODADA "+this.rodada+" ===\n----------------");
        System.out.println("    0   1   2");
        for (int i = 0; i < this.tabuleiro.length; i++) {
            Character[] linha = this.tabuleiro[i];
            System.out.print(i + " [ ");
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
        System.out.println("----------------\n");
    }

    public void inicio(){
        System.out.println("========= JOGO DA VELHA =========");
        System.out.println("Marque a casa desejada, inserindo\n   primeiro a posicao da linha\n em seguida a posicao da coluna\n        separado por espaço.\n Por exemplo para casa do centro:\n               1 1");
        System.out.println();
        imprimeTabuleiro();
    }
}