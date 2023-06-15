/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_kart;

/**
 *
 * @author felip
 */
public class Equipes_participantes {
    
    private int numero_da_equipe, classificacao;
    private String nome_da_equipe,nome_do_piloto;
    
    

    public Equipes_participantes(int numero_da_equipe, String nome_da_equipe, String nome_do_piloto) {
        this.numero_da_equipe = numero_da_equipe;
        this.nome_da_equipe = nome_da_equipe;
        this.nome_do_piloto = nome_do_piloto;
        this.classificacao = 0;
        
    }

    public int getNumero_da_equipe() {
        return numero_da_equipe;
    }

   
    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
    
    

    public String getNome_da_equipe() {
        return nome_da_equipe;
    }

    public String getNome_do_piloto() {
        return nome_do_piloto;
    }

    
    
    
    
    
    
    
    

   
    
    
    
    
    
}
