/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lerduasnotas;
import java.util.Scanner;
        
public class LerDuasNotas {

  
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Primeira Semestra =");
        int primeiroSemestre = entrada.nextInt();
        
        System.out.print("Segundo Semestre = ");
        int segundoSemestre = entrada.nextInt();
        
        int soma = (primeiroSemestre + segundoSemestre);
        
        if (soma < 60){
            System.out.println("Nota Final = "+ soma);
            System.out.println("reprovado");
                
        }
        else{
            System.out.println("Nota Final = "+ soma);
            System.out.println("Aprovado");
        }
        }
        
    }
    

