
package com.mycompany.aula02;

public class Métodos04 {
    public static void main (String[] args){
    Caneta01 c1 = new Caneta01("Nuke", "Verde", 0.4f);
    //c1.setmodelo("Bic");
    //c1.setponta (0.5f);
    c1.status();
        //System.out.println("Tenho uma caneta "+c1.getmodelo()+ " de ponta "+ c1.getponta());
    Caneta01 c2 = new Caneta01("Lux", "Roxo", 1.5f);
    c2.status();
    
    }
    
}
