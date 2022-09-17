package polindromoproblem;

import java.util.Scanner;

public class PolindromoProblem {

    public static void main(String[] args) {
        int[] polindromos = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("insira o valor numerico: ");
        for (int i = 0; i < polindromos.length; i++) {
            polindromos[i] = input.nextInt();

        }
        boolean validacao = true;

        for (int i = 0, j = polindromos.length - 1; i < polindromos.length / 2; i++, j--) {

            if (polindromos[i] != polindromos[j]) {
                System.out.println("Não e polindromo");
                validacao = false;
                break;

            }

        }
        if (validacao) {
            System.out.println("e polidromo");
        }

    }

}
