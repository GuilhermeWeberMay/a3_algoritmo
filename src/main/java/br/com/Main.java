package br.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaração de variaveis
        int opcao, opcao2;
        System.out.println("Barbara");
        System.out.println("Guilherme");
        // Menu inicial
        printCabecalho();
        System.out.println("MENU PRINCIPAL\n");
        System.out.println("1 - CADASTRO DE CONTAS");
        System.out.println("2 - BAIXA DE CONTAS");
        System.out.println("3 - RELATÓRIOS");
        System.out.println("0 - FINALIZAR");
        System.out.print("OPÇÃO : ");
        opcao = sc.nextInt();

        if (opcao == 1) {
            printCabecalho();
            System.out.println("CADASTRO DE CONTAS\n");
            System.out.println("1 - INCLUSÃO");
            System.out.println("2 - ALTERAÇÃO");
            System.out.println("3 - CONSULTAR");
            System.out.println("4 - EXCLUSÃO");
            System.out.println("0 - RETORNAR");
            System.out.print("OPÇÃO : ");
            opcao2 = sc.nextInt();
            if (opcao2 == 1) {
                printCabecalho();
                System.out.println("INCLUSÃO DE CONTA\n");
                System.out.println("DOCUMENTO    : ");
                System.out.println("DESCRIÇÃO    : ");
                System.out.println("BENEFICIÁRIO : ");
                System.out.println("VALOR        : ");
                System.out.println("VENCIMENTO   : ");

            }
        }
    }

    static void printCabecalho(){
        System.out.println("\nXYZ COMERCIO DE PRODUTOS LTDA.");
        System.out.println("SISTEMA DE CONTAS A PAGAR\n");
    }
}