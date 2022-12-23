/*
 * ATIVIDADE
 *
 * Sistema Bancário
    - Deposito
    - Sacar
    - Transferir

    - Transferir apenas se tiver saldo
    - Sacar apenas se tiver saldo

    - Todos os atributos tem que ser privados
 */

import java.util.Scanner;

public class Exercicio1 {

    static final int NUMERO_MAX_CLIENTES = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //LIBERAR CONTAS
        Conta[] contas = new Conta[NUMERO_MAX_CLIENTES];
        Cliente[] cliente = new Cliente[NUMERO_MAX_CLIENTES];
        int conta_ativa = 0;

        for (int i = 0; i < contas.length; i++) {
            contas[i] = new Conta("123"+i,"1");
        }

        //SISTEMA
        int opcao;
        Close: while(true){
            menuInicial();
            opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao){
                case 1:
                    System.out.println(cliente[0].getNome());
                    System.out.println(cliente[0].getCPF());
                    System.out.println(cliente[0].getConta());
                    break;
                case 2:
                    if(conta_ativa < NUMERO_MAX_CLIENTES){
                        System.out.print("Digite o nome do cliente: ");
                        String nome = scanner.nextLine();
                        System.out.print("Digite o CPF do cliente: ");
                        String CPF = scanner.nextLine();
                        System.out.print("Digite uma senha: ");
                        String senha = scanner.nextLine();
                        cliente[conta_ativa] = new Cliente(nome, CPF, senha, contas[conta_ativa]);
                        conta_ativa++;
                        System.out.println("CADASTRO REALIZADO COM SUCESSO!");
                    }else {
                        System.err.println("NÚMERO DE CLIENTES CADASTRADOS EXCEDIDOS.");
                    }
                    break;
                case 0:
                    System.out.println("VOCÊ SAIU COM SUCESSO!");
                    break Close;
                default:
                    System.err.println("OPÇÃO INVÁLIDA");
                    System.out.println();
            }
        }
        scanner.close();
    }

    static void menuInicial(){
        System.out.println("BANCO 926");
        System.out.println();
        System.out.println("Escolha uma operação");
        System.out.println("1 - Acessar conta:");
        System.out.println("2 - Cadastrar Conta:");
        System.out.println("0 - Sair do sistema:");
        System.out.printf("Operação: ");
    }
}
