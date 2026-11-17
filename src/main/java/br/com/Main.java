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
            } else {
                System.out.println("Informações descartadas");
            }
            System.out.println("NOVA INCLUSÃO ( S/N ) ?");
            opcao2 = sc.nextLine().charAt(0);
        } while (opcao2 != 'n' && opcao2 != 'N');
    }

    static void alteracao() {
        printCabecalho();
        System.out.println("ALTERAÇÃO DE CONTA");
        System.out.println("DIGITE O NÚMERO DO DOCUMENTO QUE DESEJA ALTERAR:");
        String documentoPesquisado = sc.nextLine();
        int posicaoPesquisada = pesquisaDocumento(documentoPesquisado);
        if (posicaoPesquisada != -1) {
            System.out.println("DESCRICAO");
            String novaDescricao = sc.nextLine();
            System.out.println("BENEFICIARIO");
            String novoBeneficiario = sc.nextLine();
            System.out.println("VALOR:");
            //Validação para checar se o valor é positivo 
            float novoValor = validarValor(Float.parseFloat(sc.nextLine()));
            System.out.println("VENCIMENTO: (XXXX-XX-XX) ");
            LocalDate novaData = LocalDate.parse(sc.nextLine());
            descricao[posicaoPesquisada] = novaDescricao;
            benediciario[posicaoPesquisada] = novoBeneficiario;
            valorDebito[posicaoPesquisada] = novoValor;
            dataVencimento[posicaoPesquisada] = novaData;
        } else {
            System.err.println("NENHUMA CONTA ENCONTRADA COM O DOCUMENTO" + documentoPesquisado);
        }
    }

    static float validarValor(Float valor) {
        if (valor < 0) {
            System.out.println("VALOR PRECISA SER POSITIVO");
            System.out.println("VALOR:");
            valor = Float.parseFloat(sc.nextLine());
        }
        return valor;
    }

    /**
     * Realiza a consulta de uma conta cadastrada pelo número do documento.
     * Solicita ao usuário o documento que deseja pesquisar e utiliza o método
     * pesquisaDocumento() para localizar a conta. Caso encontre, exibe todas as
     * informações da conta. Caso contrário, informa que nenhuma conta foi
     * encontrada.
     */
    static void consulta() {
        printCabecalho();
        System.out.println("CONSULTA DE CONTA");
        System.out.println("DIGITE O NÚMERO DO DOCUMENTO QUE DESEJA PESQUISAR:");
        String documentoPesquisado = sc.nextLine();
        int posicaoPesquisa = pesquisaDocumento(documentoPesquisado);
        if (posicaoPesquisa != -1) {
            System.out.println("CONTA ENCONTRADA COM SUCESSO!");
            System.out.println(documentos[posicaoPesquisa]);
            System.out.println(descricao[posicaoPesquisa]);
            System.out.println(benediciario[posicaoPesquisa]);
            System.out.println(valorDebito[posicaoPesquisa]);
            System.out.println(dataVencimento[posicaoPesquisa]);
        } else {
            System.out.println("NENHUMA CONTA ENCONTRADA COM O DOCUMENTO " + documentoPesquisado);
        }
    }

    /**
     * Pesquisa um documento no vetor de documentos cadastrados. Percorre os
     * registros existentes e compara cada documento com o valor informado,
     * retornando a posição correspondente caso encontre uma correspondência.
     *
     * @param documentoPesquisado Número do documento que será pesquisado.
     * @return Índice da posição em que o documento foi encontrado no vetor.
     * Retorna -1 caso nenhum documento correspondente seja encontrado.
     */
    static int pesquisaDocumento(String documentoPesquisado) {
        // Recebe esse valor por conta de que se o documento não existir sabe-se pelo valor iniciado
        int posicao = -1;
        for (int i = 0; i < N; i++) {
            if (documentos[i].equals(documentoPesquisado)) {
                posicao = i;
            }
        }
        return posicao;
    }

    static void exclusao() {
        printCabecalho();
        System.out.println("EXCLUSÃO DE CONTA");
        System.out.println("DIGITE O NÚMERO DO DOCUMENTO QUE DESEJA EXCLUIR:");
        String documentoPesquisado = sc.nextLine();
        int posicaoPesquisa = pesquisaDocumento(documentoPesquisado);
        if (posicaoPesquisa != -1) {
            for (int i = posicaoPesquisa; i < N; i++) {
                documentos[i] = documentos[i + 1];
                benediciario[i] = benediciario[i + 1];
                valorDebito[i] = valorDebito[i + 1];
                dataVencimento[i] = dataVencimento[i + 1];

            }
            N--;
            System.out.println("EXCLUSAO CONCLUÍDA COM SUCESSO");
        } else {
            System.err.println("NENHUMA CONTA ENCONTRADA COM O DOCUMENTO" + documentoPesquisado);
        }
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
        printCabecalho();
        System.out.println("CONTAS A PAGAR POR PERÍODO");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("VENCIMENTO\tVALOR\t\tDOCUMENTO\tDESCRIÇÃO\tBENEFICIÁRIO");
        System.out.println("---------------------------------------------------------------------------------");

        if (N == 0) {
            System.out.println("Nenhuma conta cadastrada.");
        } else {
            for (int i = 0; i < N; i++) {
                System.out.println(dataVencimento[i] + "\t" + valorDebito[i] + "\t\t" + documentos[i] + "\t\t" + descricao[i] + "\t\t" + benediciario[i]);
            }
        }
        System.out.println("-----------------------------------------------------------------------------------");
    }

    static void contasAtrasadas() {
        printCabecalho();
        System.out.println("CONTAS A ATRASADAS");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("VENCIMENTO \t VALOR \t\t DOCUMENTO \t DESCRIÇÃO \t BENEFICIÁRIO");
        System.out.println("-----------------------------------------------------------------------------------------------");

        LocalDate hoje = LocalDate.now();
        int encontrouConta = 0;

        for (int i = 0; i < N; i++) {
            if (dataVencimento[i] != null && dataVencimento[i].isBefore(hoje)) {
                System.out.println(dataVencimento[i] + "\t" + valorDebito[i] + "\t\t" + documentos[i] + "\t\t" + descricao[i] + "\t\t" + benediciario[i]);
                encontrouConta++;
            }
        }

        if (encontrouConta == 0) {
            System.out.println("Nenhuma conta atrasada encontrada.");
        }
        System.out.println("-----------------------------------------------------------------------------------------------");
    }

    static void balancoDeDespesas() {
        //TODO
    }

    static void printFinalizacao() {
        System.out.println("FINALIZANDO APLICAÇÃO...");
    }
}
