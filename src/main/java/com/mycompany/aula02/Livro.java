
package com.mycompany.aula02;


public class Livro implements Publicação{
    private String titulo;
    private String autor;
    private int totalpag;
    private int pagatual;
    private boolean aberto;
    private Pessoas leitor;

    
    public String detalhes() {
        return "Livro" + " titulo = " + titulo + "\n autor= " + autor + "\n totalpag= " + totalpag + 
                ", pagatual= " + pagatual + ", aberto= " + aberto + "\n leitor= " + leitor.getnome() +", idade= "
                +leitor.getidade()+  ", sexo= " + leitor.getsexo();
                
    }
    
  

    public Livro(String titulo, String autor, int totalpag, Pessoas leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalpag = totalpag;
        this.pagatual  = 0;
        this.aberto=false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalpag() {
        return totalpag;
    }

    public void setTotalpag(int totalpag) {
        this.totalpag = totalpag;
    }

    public int getPagatual() {
        return pagatual;
    }

    public void setPagatual(int pagatual) {
        this.pagatual = pagatual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoas getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoas leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto= true;
    }

    @Override
    public void fechar() {
        this.aberto =false;
    }

    @Override
    public void folhear(int p) {
        this.pagatual=p;
    }

    @Override
    public void avancarPag() {
        this.pagatual++;
    }

    @Override
    public void voltarPag() {
        this.pagatual--;
    }
    
}
