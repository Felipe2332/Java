/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibrioteca;

/**
 *
 * @author felip
 */
public class Livro_tecnico extends Livro{

    private boolean reservado;  

    public Livro_tecnico(boolean reservado, String nome_autor, String titulo, int qtde_copias_totais, int qtde_copias_disponiveis) {
        super(nome_autor, titulo, qtde_copias_totais, qtde_copias_disponiveis);
        this.reservado = false;
    }
    
    
    @Override
    public void reservar()
    {
        reservado = true;
        qtde_copias_disponiveis--;
    }
    
    public void liberar()
    {
        reservado = false;
        qtde_copias_disponiveis++;
    }
    
    @Override
    public boolean emprestar()
    {
       if(reservado || !disponivel())
       {
           return false;
       }
       qtde_copias_disponiveis--;
       return true;
    }
    

    @Override
    public boolean devolver() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean consultar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     @Override
    public void imprimir()
    {
        super.imprimir();
    }

    

    @Override
    public boolean retornar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean disponivel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
