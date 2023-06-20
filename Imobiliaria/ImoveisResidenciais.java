/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imobiliaria;

/**
 *
 * @author felip
 */
public class ImoveisResidenciais extends ImoveisNoGeral{
    
    private int qtdeQuartos, nmrVagasNaGaragem;

    public ImoveisResidenciais(int qtdeQuartos, int nmrVagasNaGaragem, int codigo, int cep, String endereco, String nomeProprietario, String corretor) {
        super(codigo, cep, endereco, nomeProprietario, corretor);
        this.qtdeQuartos = qtdeQuartos;
        this.nmrVagasNaGaragem = nmrVagasNaGaragem;
    }

    

    

    public int getQtdeQuartos() {
        return qtdeQuartos;
    }

    public int getNmrVagasNaGaragem() {
        return nmrVagasNaGaragem;
    }
    
    
    
    
    
}
