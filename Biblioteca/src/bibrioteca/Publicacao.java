/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibrioteca;

/**
 *
 * @author felip
 */
public abstract class Publicacao {
    protected String titulo;
    protected int qtde_copias_totais,qtde_copias_disponiveis;

    public Publicacao(String titulo, int qtde_copias_totais, int qtde_copias_disponiveis) {
        this.titulo = titulo;
        this.qtde_copias_totais = qtde_copias_totais;
        this.qtde_copias_disponiveis = qtde_copias_disponiveis;
    }
    
    //Getters

    public String getTitulo() {
        return titulo;
    }

    public int getQtde_copias_totais() {
        return qtde_copias_totais;
    }

    public int getQtde_copias_disponiveis() {
        return qtde_copias_disponiveis;
    }

    
    
    
    
    public abstract boolean disponivel();
    
    public abstract boolean consultar();
    
    public abstract boolean retornar();
    
    /*public boolean retornar()
    {
        if(qtde_copias_disponiveis < qtde_copias_totais)
        {
            qtde_copias_disponiveis++;
            return true;
        }
        return false;
    }
    */
    
    
    
    public void imprimir()
    {
        System.out.println("O nome do livro é " + titulo);
        System.out.println("\nA quantidade de cópias totais é " + qtde_copias_totais);
        System.out.println("\nA quantidade de cópias disponíveis é " + qtde_copias_disponiveis);
    }
    
}
