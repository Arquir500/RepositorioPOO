
package com.mycompany.aula02.Testeheranças;

import com.mycompany.aula02.Testeheranças.Pessoa;

public class Aluno extends Pessoa {
    private boolean matriculado;
    private String curso;
    
    public void cancelarMatricula(){
        
    }
    public boolean getmatriculado(){
        return matriculado;
    }
    public void setmatriculado( boolean matricula){
        this.matriculado = matriculado;
    }
    public String getcurso(){
        return curso;
    }
    public void setcurso(String curso){
        this.curso = curso;
    }
}
