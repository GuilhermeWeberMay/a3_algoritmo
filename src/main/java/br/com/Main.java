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
        // TODO
    }

    static void printBaixaDeContas() {
        // TODO
    }

    static void printRelatoriosDeContas() {
        // TODO
    }

    static void printFinalizacao() {
        // TODO
    }
}