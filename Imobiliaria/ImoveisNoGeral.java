/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imobiliaria;

/**
 *
 * @author felip
 */
public class ImoveisNoGeral {
    private int codigo,cep;
    private String endereco,nomeProprietario,corretor;
    private boolean alugado,vendido,disponivel;

    public ImoveisNoGeral(int codigo, int cep, String endereco, String nomeProprietario, String corretor) {
        this.codigo = codigo;
        this.cep = cep;
        this.endereco = endereco;
        this.nomeProprietario = nomeProprietario;
        this.corretor = corretor;
        alugado = false;
        vendido = false;
        disponivel = false;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    

    
    
    public String getCorretor() {
        return corretor;
    }
    
    public boolean isAlugado() {
        return alugado;
    }

    public void setCorretor(String corretor) {
        this.corretor = corretor;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
    
    
    
    

    

    public int getCodigo() {
        return codigo;
    }

    public int getCep() {
        return cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }
    
    
    
    
      
    
}
