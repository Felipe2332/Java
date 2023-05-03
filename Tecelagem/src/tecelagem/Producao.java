/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author felip
 */
public class Producao extends Funcionario {

    private int horaDia, horaNoite;
    
    public Producao(double salarioBase, String nome, int rg) {
        super(salarioBase, nome, rg);
    }

    
    void registrarHorasDiurnas()
    {
        horaDia++;
    }
    
    void registrarHorasNoturnas()
    {
        horaNoite++;
    }
    
    double valorDiurno()
    {
        return horaDia * salarioBase;
    }
    
    double valorNoturno()
    {
        return horaNoite * salarioBase * 1.3;
    }
            
    
    @Override
    double salarioLiquido() 
    {
        return salarioBase + valorDiurno() + valorNoturno();
    }

    @Override
    void hollerith()
    {
        System.out.println("Nome do funcionario : " + nome);
        System.out.println("RG: "+ rg);
        System.out.println("Salario base " + salarioBase);
        System.out.println("Horas diurnas " + horaDia);
        System.out.println("Horas noturnas " + horaNoite);
        System.out.println("Salario liquido " + salarioLiquido());
    }

    @Override
    void novoMes() {
        horaDia = 0;
        horaNoite = 0;
        
    }

  
    
    
   
    
    
}
