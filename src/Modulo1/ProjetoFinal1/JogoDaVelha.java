package Modulo1.ProjetoFinal1;

public class JogoDaVelha {
    public static void main(String[] args) {

        Jogo jogo = new Jogo();
        jogo.imprimeTabuleiro();

    }
}

class Jogo{
    public int jogada_atual = 0;
    private Character[][] tabuleiro = new Character[3][3];

    public void jogada(char jogador, int linha, int coluna){
        //jogada do jogador 'X'

    }

    public boolean verificaPosicao(int linha, int coluna){
        //verifica se a posicao que o jogador quer jogar esta livre
        return false;
    }

    public boolean verificaVencedor(char jogador){
        return false;
    }

    public boolean verificaVelha(){
        if(this.jogada_atual == 9){
            System.out.println("O JOGO DEU VELHA! NINGUÉM VENCEU");
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