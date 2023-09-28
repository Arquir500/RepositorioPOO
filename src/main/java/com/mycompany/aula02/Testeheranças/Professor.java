
package com.mycompany.aula02.Testeheranças;

import com.mycompany.aula02.Testeheranças.Pessoa;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public void ReceberAumento(){
        this.salario = this.salario + 60;
    }
    public String getespecialidade(){
        return especialidade;
    }
    public void setespecialidade( String especialidade){
        this.especialidade = especialidade;
    }
    public float getsalario(){
        return salario;
    }
    public void setespecialidade( float especialdiade){
        this.especialidade = especialidade;
    }
}
