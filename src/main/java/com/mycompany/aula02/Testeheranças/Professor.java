
package com.mycompany.aula02.Testeheranças;

import com.mycompany.aula02.Testeheranças.Pessoa;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public void receberAumento(float aum ){
        this.salario += aum;
        
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
    public void setsalario( float salario){
        this.salario = salario;
    }
}
