/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author felip
 */
public class Administracao extends Funcionario{
    
    private int faltas;

    public Administracao(double salarioBase, String nome, int rg) {
        super(salarioBase, nome, rg);
        this.faltas = 0;
    }
    
    
    void registrarFalta()
    {
        faltas++;
    }
    
    double salarioBase(double salarioBase)
    {
        
        return salarioBase;
    };
    
    
    
    
    @Override
    double salarioLiquido() {
        return salarioBase - (salarioBase / 30)*faltas;
    }

    @Override
    void novoMes() {
        faltas = 0;
    }
    
    @Override
    void hollerith()
    {
        System.out.println("Nome do funcionario : " + nome);
        System.out.println("RG: "+ rg);
        System.out.println("Salario base " + salarioBase);
        System.out.println("Quantia de faltas " + faltas);
        System.out.println("Salario liquido " + salarioLiquido());
    }
    
    
    
    
}
