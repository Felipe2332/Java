/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author felip
 */
public abstract class Funcionario {
    
   protected double salarioBase;
   protected String nome;
   protected int rg;

    public Funcionario(double salarioBase, String nome, int rg) {
        this.salarioBase = salarioBase;
        this.nome = nome;
        this.rg = rg;
    }

   
    
  
   
   
    abstract double salarioLiquido();
    abstract void hollerith();
    abstract void novoMes();
    
   
    
    
   
    
}
