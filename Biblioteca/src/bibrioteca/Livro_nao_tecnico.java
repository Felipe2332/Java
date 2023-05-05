/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibrioteca;

/**
 *
 * @author felip
 */
public class Livro_nao_tecnico extends Livro{
    
    public Livro_nao_tecnico(String nome_autor, String titulo, int qtde_copias_totais, int qtde_copias_disponiveis) {
        super(nome_autor, titulo, qtde_copias_totais, qtde_copias_disponiveis);
    }

    @Override
    public boolean emprestar() {
        if(disponivel())
        {
            qtde_copias_disponiveis--;
            return true;
        }
        return false;
    }
    
    @Override
    public boolean consultar() 
    {
        if(disponivel())
        {
            qtde_copias_disponiveis--;
            return true;
        }
        return false;  
    }

    @Override
    public boolean devolver() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean retornar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void reservar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean disponivel()
    {
       
        return qtde_copias_disponiveis > 0;
    }

    
}
