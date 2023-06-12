/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autopecas;

/**
 *
 * @author felip
 */
public class Autopecas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ListaDePecas lista = new ListaDePecas(10);
        
        try
        {
            //Criando Peças
            Pecas peca1 = new Pecas(12,100,"Parafuso",5);
            Pecas peca2 = new Pecas(14,50,"Tubo de ferro",240);
            Pecas peca3 = new Pecas(17,20,"Porca",150);
            
            //Adicionando na lista
            int indice1 = lista.adicionarPeca(peca1);
            int indice2 = lista.adicionarPeca(peca2);
            int indice3 = lista.adicionarPeca(peca3);
            
            //Antes da retirada e inserção de peças no estoque
            System.out.println("\nAntes da retirada de pecas\n");
            lista.imprimeDados();
            
            //Removendo quantidade das peças
            lista.retirarUnidades(0,90);
            lista.retirarUnidades(7,10);
            
            //Adicionando peças no estoque
            lista.acrescentaUnidade(0,800);
            
            //Imprimindo dados de um indice especifico
            //lista.imprimePeca(0);
            
            
            //Imprimindo dados de todas as pecas após a retirada
            System.out.println("\nApos a retirada de pecas e insercao de pecas\n");
            lista.imprimeDados();
            
            //Verificando se precisa repor estoque
            lista.relatorioReposicao(50);
        }
        catch(ExcecaoIndice e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Eita. Algo deu errado na nossa parte"); 
        }
        
        
        
    }
    
}
