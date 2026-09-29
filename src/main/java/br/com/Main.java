package br.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaração de variaveis
        int opcao, opcao2;
        System.out.println("Barbara");
        System.out.println("Guilherme");
        System.out.println("Enzo");
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
                    printCabecalho();
                    System.out.println("CADASTRO DE CONTAS");
                    System.out.println("1 - INCLUSÃO");
                    System.out.println("2 - ALTERAÇÃO");
                    System.out.println("3 - CONSULTA");
                    System.out.println("4 - EXCLUSÃO");
                    System.out.println("0 - RETORNAR");
                    System.out.print("OPÇÃO : ");
                    opcao2 = sc.nextInt();
                    System.out.println(opcao2);
                    break;
            }
        } while (opcao != 0);
    }

    static void printCabecalho() {
        System.out.println("\nXYZ COMERCIO DE PRODUTOS LTDA.");
        System.out.println("SISTEMA DE CONTAS A PAGAR\n");
    }
}