package br.com;

import java.util.Scanner;

public class Main {
    // Variavel global para podermos utlizar o scanner em qualquer lugar
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Declaração de variaveis
        int opcao;
        System.out.println("Barbara");
        System.out.println("Guilherme");
        System.out.println("Enzo");
        System.out.println("Lucas");
        System.out.println("Antonio");
        // Menu inicial
        do {
            printCabecalho();
            System.out.println("MENU PRINCIPAL\n");
            System.out.println("1 - CADASTRO DE CONTAS");
            System.out.println("2 - BAIXA DE CONTAS");
            System.out.println("3 - RELATÓRIOS");
            System.out.println("0 - FINALIZAR");
            System.out.print("OPÇÃO : ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    printCadastroDeContas();
                    break;
                case 2:
                    printBaixaDeContas();
                    break;
                case 3:
                    printRelatoriosDeContas();
                    break;
                case 0:
                    printFinalizacao();
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        } while (opcao != 0);
    }

    static void printCabecalho() {
        System.out.println("\nXYZ COMERCIO DE PRODUTOS LTDA.");
        System.out.println("SISTEMA DE CONTAS A PAGAR\n");
    }

    static void printCadastroDeContas() {
        int opcao;
        do {
            printCabecalho();
            System.out.println("CADASTRO DE CONTAS");
            System.out.println("1 - INCLUSÃO");
            System.out.println("2 - ALTERAÇÃO");
            System.out.println("3 - CONSULTA");
            System.out.println("4 - EXCLUSÃO");
            System.out.println("0 - RETORNAR");
            System.out.print("OPÇÃO : ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    inclusao();
                    break;
                case 2:
                    alteracao();
                    break;
                case 3:
                    consulta();
                    break;
                case 4:
                    exclusao();
                    break;
            }
        } while (opcao != 0);
    }

    static void inclusao() {
        //TODO
    }

    static void alteracao() {
        //TODO
    }

    static void consulta() {
        //TODO
    }

    static void exclusao() {
        //TODO
    }

    static void printBaixaDeContas() {
        // TODO
    }

    static void printRelatoriosDeContas() {
        int opcao;
        do {
            printCabecalho();
            System.out.println("RELATÓRIOS");
            System.out.println("1 - CONTAS A PAGAR");
            System.out.println("2 - CONTAS A ATRASADAS");
            System.out.println("3 - BALANÇO DE DESPESAS");
            System.out.println("0 - RETORNAR");
            System.out.print("OPÇÃO : ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    contasPagar();
                    break;
                case 2:
                    contasAtrasadas();
                    break;
                case 3:
                    balancoDeDespesas();
                    break;
            }
        } while (opcao != 0);
    }

    static void contasPagar() {
        //TODO
    }

    static void contasAtrasadas() {
        //TODO
    }

    static void balancoDeDespesas() {
        //TODO
    }

    static void printFinalizacao() {
        System.out.println("FINALIZANDO APLICAÇÃO...");
    }
}