/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaescolartrabalho;

import java.util.Scanner;

/**
 *
 * @author Felip
 */
public class SistemaEscolarTrabalho {

    public static Scanner entrada = new Scanner(System.in);
    public static int notas[][] = new int[2][2];

    public static void main(String[] args) {

        String[] alunos = new String[4];

        int op = 1;
        int opAluno = 1;
        int contAluno = 0;
        int codAluno = 0;
        int opNota = 1;

        while (op != 0) {
            op = menuPrincipal();

            switch (op) {
                case 1:
                    while (opAluno != 0) {
                        opAluno = menuAluno();

                        switch (opAluno) {
                            case 1:
                                if (contAluno <= 3) {

                                    System.out.println("Iniciando cadastro......");

                                    System.out.println("Informe o nome do aluno: ");

                                    alunos[contAluno] = entrada.next();

                                    contAluno = contAluno + 1;

                                } else {

                                    System.out.println("Vetor Cheio!");

                                }

                                break;

                            case 2:
                                System.out.println("Inciando consulta......");

                                for (int i = 0; i < 4; i++) {

                                    System.out.println(i + " - " + alunos[i]);

                                }
                                System.out.println();
                                break;

                            case 3:
                                System.out.println("Iniciando alteração......");

                                System.out.println("Informe o código do aluno: ");

                                codAluno = entrada.nextInt();

                                if ((codAluno < 0) || (codAluno > 3)) {

                                    System.out.println("Informe um código válido!");

                                } else {

                                    System.out.println("Informe o novo Nome: ");

                                    alunos[codAluno] = entrada.next();

                                }

                                break;
                            case 4:

                                System.out.println("Inciando remoção......");

                                System.out.println("Informe o código do aluno: ");

                                codAluno = entrada.nextInt();

                                if ((codAluno < 0) || (codAluno > 3)) {

                                    System.out.println("Informe um código válido!");

                                } else {

                                    alunos[codAluno] = null;

                                    System.out.println("Removido com sucesso");

                                }

                                break;

                            case 0:
                                System.out.println("Voltando para o Menu principal!");
                                break;

                            default:

                                System.out.println("Informe um valor válido!");

                        }
                    }

                case 2:
                    while (opNota != 0) {
                        opNota = menuNotas();
                        switch (opNota) {
                            case 1:

                                System.out.println("Cadastro Nota......");
                                inserirNotas();
                                break;

                            case 2:
                                System.out.println("Consulta Nota......");
                                mostrarNotas();

                                break;
                            case 3:
                                System.out.println("Alteração Nota......");
                                alteraNota();

                                break;
                            case 4:

                                System.out.println("remoção Nota......");
                                removerNota();

                                break;
                            default:

                                System.out.println("Informe um valor válido!");

                        }
                    }
                case 0:
                    break;
                default:
                    System.out.println("Informe um valor válido!");

            }
        }

    }

    //metodo modificador
    public static int menuPrincipal() {
        System.out.println("SN - Sistema de Alunos e Notas");

        System.out.println("1 - Alunos");

        System.out.println("2 - Notas");

        System.out.println("0 - Sair");

        System.out.print("Digite uma opção: ");

        return entrada.nextInt();
    }

    public static int menuAluno() {
        System.out.println("SN - Sistema de Alunos");

        System.out.println("1 - Cadastrar");

        System.out.println("2 - Consultar");

        System.out.println("3 - Alterar");

        System.out.println("4 - Remover");

        System.out.println("0 - Sair");

        System.out.print("Digite uma opção: ");

        return entrada.nextInt();

    }

    public static int menuNotas() {
        System.out.println("SN - Sistema de Notas");

        System.out.println("1 - Cadastrar");

        System.out.println("2 - Consultar");

        System.out.println("3 - Alterar");

        System.out.println("4 - Remover");

        System.out.println("0 - Sair");

        System.out.print("Digite uma opção: ");

        return entrada.nextInt();
    }

    public static void inserirNotas() {
        for (int l = 0; l < notas.length; l++) {
            System.out.println("Informe as notas do " + (l + 1) + "° aluno");
            for (int c = 0; c < 2; c++) {
                System.out.print("Informe a " + (c + 1) + " nota: ");

                notas[l][c] = entrada.nextInt();

            }
        }
    }

    public static void mostrarNotas() {
        for (int l = 0; l < notas.length; l++) {
            System.out.print("Notas do " + (l + 1) + "° aluno: ");
            for (int c = 0; c < 2; c++) {
                System.out.print(notas[l][c] + " || ");

            }
            System.out.println();
        }
    }

    public static void removerNota() {
        for (int l = 0; l < notas.length; l--) {
            System.out.println("Remova a nota " + (l + 1) + "° aluno");
            for (int c = 0; c < 2; c--) {
                System.out.print("Informe a " + (c + 1) + " nota: ");

                notas[l][c] = entrada.nextInt();

            }
        }
    }

    public static void alteraNota() {
        for (int l = 0; l < notas.length; l++) {
            System.out.println("Alterar a notas do " + (l + 1) + "° aluno");
            for (int c = 0; c < 2; c++) {
                System.out.print("Informe a " + (c + 1) + " nota: ");

                notas[l][c] = entrada.nextInt();

            }
        }

    }
}
