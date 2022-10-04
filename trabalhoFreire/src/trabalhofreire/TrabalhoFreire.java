/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofreire;



import java.util.Scanner;

/**
 *
 * @author Felip
 */
public class TrabalhoFreire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[4][3];
        int[] somaMatriz = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("digite o valor da " + (j + 1) + "° da coluna " + (i + 1) + "° linha: ");
                matriz[i][j] = entrada.nextInt();
                somaMatriz[i] += matriz[i][j];
            }
        }
        System.out.println("=============================================");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                
            }
            
            System.out.println("= "+somaMatriz[i]);
        }
        
          

    }
}
