
package lapizera;


public class Caneta {
    public String modelo;
    private float ponta;
    public boolean tampar;
    public String cor;
    
    public Caneta(String m, String c, float p){
        this.cor = "Azul";
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
    }
    public String getCor(){
        return this.cor;
    }
    public String setCor(String c){
        return this.cor=c;
    }
 
    public boolean getTampar(){
        return this.tampar = true;
    }
    public boolean setdestampar (){
         return this.tampar = false;
    }
    public String getModelo(){
        return this.modelo; 
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void Status(){
        System.out.println("SOBRE A CANETA");
         System.out.println("Modelo: " + this.modelo);
          System.out.println("Ponta: " + this.ponta);
           System.out.println("Cor "+ this.cor);
            System.out.println("tampada " + this.getTampar());
            
    }
}
