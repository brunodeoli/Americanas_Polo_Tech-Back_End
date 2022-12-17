package Modulo1.Aula6;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Escreva o numero de linhas: ");
        int num_linha = sn.nextInt();
        System.out.println("Escreva o numero de colunas: ");
        int num_coluna = sn.nextInt();

        Character[][] matriz = new Character[num_linha][num_coluna];
        matriz[0][0] = 'x';

        imprimir(matriz);

        mover(matriz);
        imprimir(matriz);
        mover(matriz);
        imprimir(matriz);
        mover(matriz);
        imprimir(matriz);
        mover(matriz);
        imprimir(matriz);
        mover(matriz);
        imprimir(matriz);
        mover(matriz);
        imprimir(matriz);
        mover(matriz);
        imprimir(matriz);
        mover(matriz);
        imprimir(matriz);
        mover(matriz);
        imprimir(matriz);
        mover(matriz);
        imprimir(matriz);
        mover(matriz);
        imprimir(matriz);
        mover(matriz);
        imprimir(matriz);

    }

    public static int[] encontrar(Character[][] mat){
        int i = 0; int j = 0;
        EncontraX: for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                if(mat[i][j] != null){
                    break EncontraX;
                }
            }
        }
        return new int[] {i,j};
    }

    public static void mover(Character[][] mat){
        int[] posicaoX = encontrar(mat);
        int linha = posicaoX[0];
        int coluna = posicaoX[1];
        if(coluna == mat[linha].length-1){
            moverParaBaixo(mat, linha);
        }else{
            mat[linha][coluna] = null;
            mat[linha][coluna+1] = 'x';
        }
    }

    private static void moverParaBaixo(Character[][] mat, int linha){
        if(linha != mat.length-1){
            mat[linha][mat[linha].length-1] = null;
            mat[linha+1][0] = 'x';
        }
    }

    public static void  imprimir(Character[][] mat){
        System.out.println();
        for (int i = 0; i < mat.length; i++) {
            Character[] linha = mat[i];
            System.out.print("[ ");
            for (int j = 0; j < mat[i].length; j++) {
                Character elemento = mat[i][j];
                if(elemento==null){
                    System.out.print("_");
                }else{
                    System.out.print(elemento);
                }
                if(j == linha.length-1){
                    System.out.print(" ]\n");
                }else{
                    System.out.print(" , ");
                }
            }
        }
        System.out.println();
    }
}