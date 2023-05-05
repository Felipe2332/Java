/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibrioteca;

/**
 *
 * @author felip
 */
public abstract class Livro extends Publicacao {
    
    private String nome_autor;

    public Livro(String nome_autor, String titulo, int qtde_copias_totais, int qtde_copias_disponiveis) {
        super(titulo, qtde_copias_totais, qtde_copias_disponiveis);
        this.nome_autor = nome_autor;
    }
    
    //Getter

    public String getNome_autor() {
        return nome_autor;
    }
        
    //Metodos exclusivos de livro
    
    public abstract boolean emprestar();
    public abstract boolean devolver();
    public abstract void reservar();
    
       
    
    @Override
    public void imprimir()
    {
        
        System.out.println("Nome do autor é " + nome_autor);
        super.imprimir();
    }

    
    
    
    
}
