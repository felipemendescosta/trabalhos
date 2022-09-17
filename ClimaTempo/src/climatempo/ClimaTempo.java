
package climatempo;

import java.util.Scanner;



public class ClimaTempo {


    public static void main(String[] args) {
       float temp [] = new float[7];
       String Semana[] = {"Domingo","Segunda","Terca","Quarta","Quinta","Sexta","Sabado"};
        Scanner input = new Scanner(System.in);
        
        for(int i=0;i<temp.length;i++){
            
        System.out.print("Informe a temperatura de "+Semana[i]+": ");
        temp[i] = input.nextFloat();
        if(temp[i] >= 80)
                System.out.println("Temperatura Invalida: "+temp[i]);
            
        }
        System.out.println("");
        System.out.println("Informacoes da temperatura em #");
        System.out.println("");
        float media = 0.0f;
        for(int i=0; i< temp.length;i++){
            System.out.print(Semana[i]+" :");    
            for(int j = 0; j<temp[i];j++){
                
            System.out.print("#");
       
            }
            System.out.println("");
            
           
            System.out.println("");
            
        media +=temp[i]/temp.length;
           
        }
        System.out.println("A média da temperatura: "+String.format("%.2f",media));
        for(int i=0;i<temp.length;i++){
            if(temp[i]>media){
                System.out.println("A temeperatura de "+Semana[i]+ " "+temp[i]+"° e maior que a media "+String.format("%.2f",media));
            }
        }
        
           
    }
    
}
    
