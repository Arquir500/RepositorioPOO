
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
    public void getidade(int idade){
        this.idade =idade;
    }
    public String getsexo(){
        return sexo;
    }
    public void getsexo(String nome){
        this.sexo=sexo;
    }
}
