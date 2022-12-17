package Modulo1.Aula1;/*  não é aceito 2 classes public no arquivo
    char é aspas simples
    string é aspas duplas
    cpf e cnpj é salvo como String
    valores monetarios são do tipo BigDecimal
    para constantes utiliza-se final + tipo

    WRAPPER:
        -   tipos primitivos em objetos, podendo utilizar seus métodos.
        -   byte -> Byte
        -   short -> Short
        -   int -> Integer
        -   long -> Long
        -   float -> Float
        -   double -> Double
        -   char -> Character
        -   boolean -> Boolean

    O operador de igualdade (==) verifica somente de tipos primitivos
    Não é possivel comparar Strings. Compila mas o que compara é espaço na memória.

    Toda classe herda de objects.
    O object possui o método equals, porém é utilizado o operador de igualdade, logo, compara espaço na memória (referencia).

    estudar String pool.
 */

public class Aula1 {
    public static void main(String[] args) {
        final float FATOR_CONVERSAO_LB = 2.20462F;
        float kg = 100F;
        System.out.printf("%.2fkg são %.2flb", kg, kg*FATOR_CONVERSAO_LB);
    }
}
