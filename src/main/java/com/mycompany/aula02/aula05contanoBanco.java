
package com.mycompany.aula02;

public class aula05contanoBanco {
    public static void main(String[] args){
        contaBanco p1 = new contaBanco();
        p1.setNumConta(1110);
        p1.setDono("Jose");
        p1.abrirConta("CC");
        p1.depositar(100);
        p1.sacar(50);
        p1.sacar(100);
        p1.fecharConta();
        
        contaBanco p2 = new contaBanco();
        p2.setNumConta(2220);
        p2.setDono("Maria");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(350);
        
        p1.estadoAtual();
        p2.estadoAtual();
        
    }
    
}
