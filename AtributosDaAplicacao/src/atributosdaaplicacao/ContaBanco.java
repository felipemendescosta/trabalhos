
package atributosdaaplicacao;


public class ContaBanco {
        //atributos
    public int numConta;
    protected String tipo;
    private String Dono;
    private float Saldo;
    private boolean Status;
        // métodos personalizados
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            this.setSaldo(50);
        } else if (t == "CP"){
            this.setSaldo(150);
        }
    }
    public void fecharConta(){
       if (this.getSaldo() > 0){
           System.out.println("Conta não pode ser fechada porque"
                   + " ainda tem dinheiro");
           else if (this.getSaldo() < 0) {
                   System.out.println("conta não pode ser fechada"
                   + "  pois tem Débito");
       }   else{
                this.setStatus(false);
                   System.out.println("Conta fechada com sucesso!");
                   }
       } 
    }
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de"+ this.getDono());
        } else{
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    public void sacar(float v){
        if (this.getStatus()){
           if (this.setSaldo() >= v){
               this.setSaldo(this.getSaldo() - v);
               System.out.println("Saldo realizado na conta de " + this.getDono());
           } else {
               System.out.println("Impossível Sacar de uma conta Fechada");
           }
        }
        
    }
    public void pagarMensal(){
        int v;
        if (this.getTipo() == "CC") {
            v = 12;   
        } else if (this.getTipo() == "CP"){
            v = 20; 
    }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga por " + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }
        //métodos especiais
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }

    public boolean getStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }
    public void getDono (String Dono){
         return Dono;
    }
    public void setDono (String Dono){
         this.Dono = Dono;
    }
    
    
}
