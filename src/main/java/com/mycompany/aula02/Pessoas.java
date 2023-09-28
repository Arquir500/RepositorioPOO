package com.mycompany.aula02;

public class Pessoas {
    private String nome;
    private int idade;
    private String sexo;
    
    public void aniversário(){
        this.idade++;
    }
    
    public Pessoas (String nome, int idade, String sexo){
    this.nome = nome;
    this.idade = idade;
    this.sexo = sexo;
    }
    
    public String getnome(){
        return nome;
    }
    public void setnome(String nome){
        this.nome=nome;
    }
    public int getidade(){
        return idade;
    }
    public void setidade(int idade){
        this.idade=idade;
    }
    public String getsexo(){
        return sexo;
    }
    public void setsexo(String sexo){
        this.sexo=sexo;
    }
}
