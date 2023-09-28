package com.mycompany.aula02;

public class ProjetoLivro {
    public static void main(String[] args){
        Pessoas[] P = new Pessoas[3];
        Livro[] l = new Livro[3];
        
        P[0]= new Pessoas("Pamela", 21, "Mulher");
        P[1]= new Pessoas("Roger", 28, "Homem");
        P[2]= new Pessoas("Lucas", 25, "Homem");
        
        l[0]= new Livro("A vida","Sr.D", 200, P[0]);
        l[1]= new Livro("A morte","Sr.S", 500, P[1]);
        l[2]= new Livro("A ressureição","Sr.J", 3, P[2]);
        
        System.out.println(l[1].detalhes());
    }
}
