
package com.mycompany.aula02;

public class Caneta01 {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta01(String modelo, String cor, float ponta){ // método construtor
        this.modelo = modelo;       
        this.cor = cor;
        this.ponta = ponta;
        
    }
    
    public String getmodelo(){
        return this.modelo;
    }
    public void setmodelo(String m){
        this.modelo = m;
    }
    public float getponta(){
        return this.ponta;
    }
    public void setponta(float p){
        this.ponta = p;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("ponta: " + this.ponta);
        System.out.println("Cor: "+ this.cor);
        System.out.println("A caneta está tampada? "+ this.tampada);
    }
    
}
