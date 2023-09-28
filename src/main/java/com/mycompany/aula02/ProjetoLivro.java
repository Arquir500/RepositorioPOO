package com.mycompany.aula02;

public class ProjetoLivro {
    public static void main(String[] args){
        Pessoas[] P = new Pessoas[3];
        Livro[] l = new Livro[3];
        
        P[0]= new Pessoas("Pamela", 21, "Mulher");
        P[1]= new Pessoas("Roger", 28, "Homem");
        P[2]= new Pessoas("João", 25, "Homem");
        
        l[0]= new Livro("A vida","Sr.D", 200, P[0]);
        l[1]= new Livro("A morte","Sr.S", 500, P[1]);
        l[2]= new Livro("A ressureição","Sr.J", 3, P[2]);
        
        l[2].abrir();
        l[1].abrir();
        l[0].abrir();
        
        
        l[0].folhear(70);
        l[2].avancarPag();
        l[1].folhear(50);
        
        l[0].avancarPag();
        l[0].avancarPag();
        l[1].avancarPag();
        
        l[2].voltarPag();
        
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
    }
}
