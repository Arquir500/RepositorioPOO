
package com.mycompany.aula02.Testeheranças;

import com.mycompany.aula02.Testeheranças.Pessoa;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    public void cancelarMatricula(){
        
    }
    public int getmatricula(){
        return matricula;
    }
    public void setmatricula( int matricula){
        this.matricula = matricula;
    }
    public String getcurso(){
        return curso;
    }
    public void setcurso(String curso){
        this.curso = curso;
    }
}
