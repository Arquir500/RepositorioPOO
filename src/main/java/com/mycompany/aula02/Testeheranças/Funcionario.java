
package com.mycompany.aula02.Testeheranças;

import com.mycompany.aula02.Testeheranças.Pessoa;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(){
    
    }
    public String getsetor(){
        return setor;
    }
    public void setsetor(String setor){
        this.setor = setor;
    }
    public boolean gettrabalhando(){
        return trabalhando;
    }
    public void settrabalhando(boolean trabalhando){
        this.trabalhando= trabalhando;
    }

    boolean getsalario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
