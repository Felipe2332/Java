/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autopecas;

/**
 *
 * @author felip
 */
public class ListaDePecas {
    //O objetivo dessa classe é armazenar a lista de peças da loja
    
    private Pecas[] lista;
    private int proximoIndice;
    

    public ListaDePecas(int tamanhoDesejado) {
        
        lista  = new Pecas[tamanhoDesejado];
        proximoIndice = 0;
    }
    
    
    public int adicionarPeca(Pecas pc) throws ExcecaoIndice
    {
        if(proximoIndice >= lista.length)
        {
            throw new ExcecaoIndice("Lista ta lotada caralho");
        }
        
        lista[proximoIndice] = pc;
        int indice = proximoIndice;
        proximoIndice++;
        System.out.println("O indice da peca inserida e " + indice);
        return indice;
    }
    
    void retirarUnidades(int index, int quantidade) throws ExcecaoIndice
    {
        if(index < 0 || index > lista.length)
        {
            throw new ExcecaoIndice ("Indice invalido");
        }
        
        //Criacao da variavel local
        Pecas peca = lista[index];
        
        if(peca==null)
        {
            throw new ExcecaoIndice("Não há peças no índice informado");
        }
        
        if(peca.getQtde_em_estoque()<quantidade)
        {
            throw new ExcecaoIndice("Você deseja retirar mais peças do que têm disponível no estoque");
        }
        
        //Se estiver tudo certo. Retire a quantidade desejada
        
        peca.setQtde_em_estoque(peca.getQtde_em_estoque() - quantidade);
    }
    
    void acrescentaUnidade(int index, int quantidade) throws ExcecaoIndice
    {
        if(index < 0 || index>=lista.length)
        {
            throw new ExcecaoIndice("Indice invalido");
        }
        
        //Criação da variável local do método para acessar as peças oficiais na outra classe
        Pecas peca = lista[index];
        
        if(peca==null)
        {
            throw new ExcecaoIndice("Nao ha pecas no indice informado");
        }
        
        peca.setQtde_em_estoque(peca.getQtde_em_estoque()+quantidade);
    }
    
    void imprimePeca(int index) throws ExcecaoIndice
    {
        if(index < 0 || index>=lista.length)
        {
            throw new ExcecaoIndice("Indice invalido");
        }
        
        //Estava com dúvidas aqui, tentando enfiar mais um if para verificar se o indice digitado pertencia à lista
        //Mas não precisa. A variavel local já pega/atinge o indice desejado.Só printar então
        //Criação da variável local do método para acessar as peças oficiais na outra classe
        Pecas peca = lista[index];
        System.out.println("Dados da peca no indice " + index + ":");
        System.out.println("Nome: " + peca.getDescricao());
        System.out.println("Quantidade:  " + peca.getQtde_em_estoque());
        System.out.println("Codigo:  " + peca.getCodigo_da_peca());
        System.out.println("Peso da unidade:  " + peca.getPeso());
        System.out.println("\n");
    }
    
    
    //Tem que percorrer todos os itens da lista e verificar a quantidade. Tudo que estiver menor que a quantidade especificada pelo método
    //Printar quais peças devem ser repostas
    void relatorioReposicao(int qtdeMinima)
    {
        
        for(int i = 0; i<proximoIndice;i++)
        {
            Pecas peca = lista[i];
            if(peca.getQtde_em_estoque() <= qtdeMinima)
            {
                System.out.println("Tem que fazer reposicao da peca : "+ peca.getDescricao()+" pois ha somente " + peca.getQtde_em_estoque() + " unidades disponiveis: ");
            }
        }
    }
    
    
    
    void imprimeDados()
    {
        
        for(int i = 0; i<proximoIndice;i++)//Lembrando de usar apenas < (sem o <=)
        {
            Pecas peca = lista[i];
            System.out.println("Nome:  " + peca.getDescricao());
            System.out.println("Quantidade:  " + peca.getQtde_em_estoque());
            System.out.println("Codigo:  " + peca.getCodigo_da_peca());
            System.out.println("Peso da unidade:  " + peca.getPeso());
            System.out.println("\n");
        }
        //System.out.println("O tanho da lista é " + lista.length);//Lembrando: Para imprimir o tamanho da lista tem que colocar .length senão irá printar o endereço da memória
    }
    
    
    
    
    
}
