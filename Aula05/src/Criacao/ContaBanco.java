package Criacao;

public class ContaBanco {

    public int numConta; // 
    protected String tipo; // poupan ou corrente
    private String dono; // nome do dono da conta
    private float saldo; // quanto de dinheiro tem na conta 
    private boolean status; // status ver se ta fechada ou aberta

    //Métodos personalizado
    public void estadoAtual() {
        System.out.println("------------------------------------");
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());

    }
    //MÉTODOS modificador

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if ("Conta Corrente".equals(t)) {
            this.setSaldo(50);
        } else if ("Conta Poupansa".equals(t)) {
            this.setSaldo(150);

        }
    }

    public void fecharConta() {
        if (getSaldo() > 0) {
            System.out.println("A conta não pode ser fechada tem dinheiro");

        } else if (this.getSaldo() < 0) {
            System.out.println("A conta não pode ser fechada pois ta em débito");
        } else {
            System.out.println("conta fechada com sucesso!");
        }
    }

    public void depositar(float v) {
        if (getStatus()) {
            setSaldo(getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de" + getDono());
        } else {
            System.out.println("Impossivel depósitar em uma conta fechada");
        }
    }

    public void sacar(float v) {
        if (getStatus()) {
            if (getSaldo() >= v) {
            }
            setSaldo(getSaldo() - v);
            System.out.println("Saque realizado na conta de " + getDono());
        } else {
            System.out.println("Saldo Insuficiente para Saque" + getDono());
        }

    }

    public void pagarMensal() {
        int v = 0;
        if ("Conta Corrente".equals(getTipo())) {

        } else if ("Conta Poupansa".equals(getTipo())) {
            v = 20;
        }
        if (getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por" + getDono());
        } else {
            System.out.println("Impossivel pagar uma conta fechada");
        }
    }
    // MÉTODOS ESPECIAIS

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
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

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
