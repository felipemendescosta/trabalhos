/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somadoisarray;

import java.util.Scanner;

/**
 *
 * @author Felip
 */
public class SomaDoisArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a [] = new int[5];
       int b [] = new int[5];
       int c [] = new int[5];
       
       Scanner input = new Scanner(System.in);
       for(int i=0;i<5;i++){
        System.out.print("Informe o "+a[i]+"° A:");   
        a[i] = input.nextInt(); 
       }
         System.out.println("=========================");
        for(int i=0;i<5;i++){   
        System.out.print("Informe os Valores de B: ");
        b[i] = input.nextInt();
        }
         System.out.println("=========================");
         
         System.out.println("Soma dos Dois Array");
        for(int i =0; i <5;i++){
        c[i] = a[i]+b[i];
            System.out.println(c[i]); 
       }
        
            
        
       
    
   }
    
 }


