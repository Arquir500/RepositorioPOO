
package com.mycompany.aula02.Testeheranças;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    public void fazerAnive(){
        this.idade++;
    }
    
    public String getnome(){
        return nome;
}
    public void setnome( String nome){
        this.nome=nome;
    }
    public int getidade(){
        return idade;
    }
    public void setidade(int idade){
        this.idade =idade;
    }
    public String getsexo(){
        return sexo;
    }
    public void setsexo(String sexo){
        this.sexo=sexo;
    }
    public String pessoasStatus() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo +'}';
    }   
}
