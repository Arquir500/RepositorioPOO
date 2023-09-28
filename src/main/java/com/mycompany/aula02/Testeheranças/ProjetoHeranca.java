
package com.mycompany.aula02.Testeheranças;


public class ProjetoHeranca {
    public static void main(String[] args){
   Pessoa p1 = new Pessoa();
   Aluno p2 = new Aluno();
   Professor p3 = new Professor();
   Funcionario p4 = new Funcionario();
   
   p1.setnome("Pedro");
   p2.setnome("Maria");
   p3.setnome("Rogeria");
   p4.setnome("Jose");
   
   p1.setsexo("Masculino");
   p2.setsexo("Feminino");
   p3.setsexo("Feminino");
   p4.setsexo("Fluído");
   
   p1.setidade(19);
   p2.setidade(17);
   p3.setidade(39);
   p4.setidade(49);

   p3.setsalario(2000);
   p3.receberAumento(200);
   
        System.out.println(p1.pessoasStatus());
        System.out.println(p2.pessoasStatus());
        System.out.println(p3.pessoasStatus());
        System.out.println(p4.pessoasStatus());
    
    }

}
