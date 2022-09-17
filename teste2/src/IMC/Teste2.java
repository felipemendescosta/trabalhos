
package IMC;

import java.util.Scanner;


public class Teste2 {


    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a sua Altura: ");
        double Altura = entrada.nextDouble();
        
        System.out.print("Informe o seu Peso: ");
        double Peso = entrada.nextDouble();
        
        double IMC = Peso/Math.pow(Altura, 2);
        
        System.out.println("Seu IMC: " + String.format("%.1f",IMC));
        
         if (IMC < 18.5){
            System.out.println("Peso Baixo");
         }    
         else if (IMC  >= 18.5 && IMC <= 24.9 ){
            System.out.println("Peso Normal");
         }
         else if (IMC >= 25.0 && IMC <= 29.9){
            System.out.println("Sobrepeso");
         }
         else if(IMC >= 30.0 && IMC <= 34.9){
            System.out.println("Obesidade(Grau I)");
         }
         else if(IMC >= 35.0 && IMC <= 39.9){
            System.out.println("Obedidade Severa (Grau II)");
         }
         else{
            System.out.println("Obesidade Mórbida (Grau III)");
         }
         
}
 
}
