/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadrado;

/**
 *
 * @author Felip
 */
public class Quadrado {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        for (int numero = 15; numero < 200; numero++){
            int quadrado = numero * numero;
        
            System.out.println("Quadrado " + quadrado);
        }
    }
    
}
