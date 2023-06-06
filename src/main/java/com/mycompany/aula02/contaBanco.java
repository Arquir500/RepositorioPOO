package com.mycompany.aula02;

public class contaBanco {
    //atributos
    public int NumConta;
    protected String Tipo;
    private String Dono;
    private float Saldo;
    private boolean Status;
    //metodos personalizados
    public void estadoAtual(){
        System.out.println("-------------------------------------");
        System.out.println("Conta " + this.getNumConta());
        System.out.println("Tipo "+ this.getTipo());
        System.out.println("Dono "+ this.getDono());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status "+ this.getStatus());
    }
    public void abrirConta(String T){
        this.setTipo(T);
        this.setStatus(true);
        if (T == "CC"){
            this.setSaldo(50);
    }
        else if(T == "CP"){
            this.setSaldo(150);
                }
        System.out.println("Conta aberta com sucesso! " + this.getDono());
   
    }
    public void fecharConta(){
        if (this.getSaldo()>0){
            System.out.println("Conta não pode ser fechada porquê ainda têm dinheiro");
        } else if (this.getSaldo()<0){
            System.out.println("Conta não pode ser fechada pois têm débito");
        } else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso do "+ this.getDono());
        }
    
    }
    public void depositar(float V){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() +V);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else{
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta do " + this.getDono());
            } else{
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossível sacar, Conta está fechada");
        }
    }
    public void pagarMensal(){
        float v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if(this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por "+ this.getDono() );
        } else{
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }
    //metodos especiais

    public contaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return NumConta;
    }

    public void setNumConta(int NumConta) {
        this.NumConta = NumConta;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getDono() {
        return Dono;
    }

    public void setDono(String Dono) {
        this.Dono = Dono;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }

    public boolean getStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }
    
    
}
