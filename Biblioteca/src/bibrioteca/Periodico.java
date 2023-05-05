/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibrioteca;

/**
 *
 * @author felip
 */
public class Periodico extends Publicacao {
    private int numero_volume;
    

    public Periodico(int numero_volume, String titulo, int qtde_copias_totais, int qtde_copias_disponiveis) {
        super(titulo, qtde_copias_totais, qtde_copias_disponiveis);
        this.numero_volume = numero_volume;
    }
    
    //Getters

    public int getNumero_volume() {
        return numero_volume;
    }
    
    
    

    @Override
    public boolean consultar()
    {
        if(qtde_copias_disponiveis > 0)
        {
            qtde_copias_disponiveis--;
            System.out.println("Consultado");
            return true;
            
        }
        return false;
    }
    
    @Override
    public boolean retornar() 
    {
        if(qtde_copias_disponiveis < qtde_copias_totais)
        {
            qtde_copias_disponiveis++;
            return true;
        }
        return false;  
    }
    
    
    
    @Override
    public void imprimir()
    {
        System.out.println("Numero do volume é " + numero_volume);
        super.imprimir();
    }

    @Override
    public boolean disponivel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

   
}
