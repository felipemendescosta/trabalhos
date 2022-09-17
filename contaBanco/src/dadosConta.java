/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felip
 */
public class dadosConta {
    public String  nome;
    public boolean  abriuConta;
    public boolean  fechouConta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getAbriuConta() {
        return abriuConta;
    }

    public boolean setAbriuConta(boolean abriuConta) {
       return this.abriuConta = abriuConta = true;
       
    }

    public boolean getFechouConta() {
        return fechouConta;
    }

    public boolean setFechouConta(boolean fechouConta) {
       return this.fechouConta = fechouConta = false;
        
    }  
    
}
