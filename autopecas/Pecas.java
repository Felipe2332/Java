/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autopecas;

/**
 *
 * @author felip
 */
public class Pecas {
    
    
    private int codigo_da_peca,qtde_em_estoque;
    private String descricao;
    private double peso;

    public Pecas(int codigo_da_peca, int qtde_em_estoque, String descricao, double peso) {
        this.codigo_da_peca = codigo_da_peca;
        this.qtde_em_estoque = qtde_em_estoque;
        this.descricao = descricao;
        this.peso = peso;
    }

    //Acesso aos atributos sem alterar diretamente
    public int getCodigo_da_peca() {
        return codigo_da_peca;
    }

    public int getQtde_em_estoque() {
        return qtde_em_estoque;
    }

    public void setQtde_em_estoque(int qtde_em_estoque) {
        this.qtde_em_estoque = qtde_em_estoque;
    }
    
    

    public String getDescricao() {
        return descricao;
    }

    public double getPeso() {
        return peso;
    }
    
    
    
      
}
