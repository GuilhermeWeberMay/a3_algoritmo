package br.com;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    // Variavel global para podermos utlizar o scanner em qualquer lugar
    private static Scanner sc = new Scanner(System.in);
    // Tamanho máximo dos vetores
    private static int N = 0;
    // Dados das Contas
    static String[] documentos = new String[100];
    static String[] descricao = new String[100];
    static String[] benediciario = new String[100];
    static float[] valorDebito = new float[100];
    static LocalDate[] dataVencimento = new LocalDate[100];

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
                    System.err.println("Opção Inválida\n");
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
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (N < 100) {
                        inclusao();
                    } else {
                        System.out.println("Cadastro cheio!");
                    }
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
                default:
                    System.out.println("Opção Inválida");
            }
        } while (opcao != 0);
    }

    static void inclusao() {
        char opcao1 = 'n';
        char opcao2 = 'n';
        do {
            printCabecalho();
            System.out.println("INCLUSÃO DE CONTA");
            System.out.println("DOCUMENTO:");
            documentos[N] = String.valueOf(sc.nextLine());
            System.out.println("DESCRIÇÃO:");
            descricao[N] = sc.nextLine();
            System.out.println("BENEFEICIÁRIO:");
            benediciario[N] = sc.nextLine();
            System.out.println("VALOR:");
            valorDebito[N] = Float.parseFloat(sc.nextLine());
            System.out.println("VENCIMENTO: (XXXX-XX-XX)");
            dataVencimento[N] = LocalDate.parse(sc.nextLine());
            System.out.print("CONFIRMA INCLUSÃO ( S/N ) ? ");
            opcao1 = sc.nextLine().charAt(0);
            if (opcao1 == 's' || opcao1 == 'S') {
                System.out.println("CONTA CADASTRADA COM SUCESSO!");
                System.out.println(documentos[N]);
                System.out.println(descricao[N]);
                System.out.println(benediciario[N]);
                System.out.println(valorDebito[N]);
                System.out.println(dataVencimento[N]);
                N++;
            }else{
                System.out.println("Informações descartadas");
            }
            System.out.println("NOVA INCLUSÃO ( S/N ) ?");
            opcao2 = sc.nextLine().charAt(0);
        } while (opcao2 != 'n' && opcao2 != 'N');
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
                default:
                    System.out.println("Opção Inválida");
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