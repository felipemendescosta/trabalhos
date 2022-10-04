
package Criacao;

import java.util.Scanner;


public class Instancia {

 
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Numero da conta: ");
         int numConta = entrada.nextInt();
         
         System.out.println("Nome do Usuário: ");
         String dono = entrada.nextLine();
        
        
        p1.setNumConta(numConta);
        p1.setDono(dono);
        p1.abrirConta("Conta Corrent");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono(" Dinash");
        p2.abrirConta("Conta Poupansa");
        
        p1.depositar(100);
        p2.depositar(1000);
        p2.sacar(2000);
        
        p1.estadoAtual();
        p2.estadoAtual();  
       
                
        
              
        
  
    }
    
}
