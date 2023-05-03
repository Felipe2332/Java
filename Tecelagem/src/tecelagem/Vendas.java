/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author felip
 */
public class Vendas extends Funcionario {

    private double totalVendas;
    
    public Vendas(double salarioBase, String nome, int rg) {
        super(salarioBase, nome, rg);
        this.totalVendas = 0;
    }
    
    void registrarVenda(double valor)
    {
        totalVendas+= valor;
    }
    
    double calculoComissao()
    {
        return totalVendas * 0.3;
    }
    

    @Override
    double salarioLiquido()
    {
        return salarioBase + calculoComissao();
    }

    @Override
    void hollerith() 
    {
        System.out.println("Nome do funcionario : " + nome);
        System.out.println("RG: "+ rg);
        System.out.println("Salario base " + salarioBase);
        System.out.println("Total de vendas " + totalVendas);
        System.out.println("Quantia de comissao" + calculoComissao());
        System.out.println("Salario liquido " + salarioLiquido());
    }

    @Override
    void novoMes() 
    {
        totalVendas = 0;
    }
    
}
