/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imobiliaria;

/**
 *
 * @author felip
 */
public class ListaImoveis {
    
    private ImoveisNoGeral[] listaDeImoveis;
    private int tamanhoMaximo;
    

    public ListaImoveis(int tamanhoDesejado) {
        listaDeImoveis = new ImoveisNoGeral[tamanhoDesejado];
        tamanhoMaximo=0;
        for(int i =0;i<listaDeImoveis.length;i++)
        {
            listaDeImoveis[i]= new ImoveisNoGeral(-1,-1,"","","");
        }
    }
    
    void cadastrarImovel(ImoveisNoGeral imv) throws TamanhoMaxExc 
    {
        if(tamanhoMaximo >= listaDeImoveis.length)
        {
            throw new TamanhoMaxExc("Quantidade de imoveis maxima");
        }
        for(int i =0;i<listaDeImoveis.length;i++)//SE FOR VERIFICAR CODIGO IGUAL, PRECISA PERCORRER TODOS EXISTENTES, POR ISSO O 'FOR'
        {
            if(listaDeImoveis[i].getCodigo()==imv.getCodigo())
            {
                throw new TamanhoMaxExc("Codigo ja existe");
            }
        }
        //LEMBRAR DISSO PARA A PROVA
        listaDeImoveis[tamanhoMaximo] = imv;
        tamanhoMaximo++;
        imv.isAlugado();
        imv.isVendido();
        
        
    }
    
    
    void alugarImovel(int codigo, String corretor) throws TamanhoMaxExc
    {
    boolean codigoValido = false;
    
    for (int i = 0; i < tamanhoMaximo; i++) {
        if (listaDeImoveis[i].getCodigo() == codigo) {
            if (listaDeImoveis[i].isAlugado()) {
                throw new TamanhoMaxExc("Imovel ja alugado");
            }
            
            listaDeImoveis[i].setCorretor(corretor);
            listaDeImoveis[i].setAlugado(true);
            codigoValido = true;
            break;
        }
    }
    
    if (!codigoValido) {
        throw new TamanhoMaxExc("Código inválido");
    }
    
    
    
    }
    void venderImovel(int codigo,String corretor) throws TamanhoMaxExc
    {
        boolean codigoValido = false;
        for(int i = 0;i < listaDeImoveis.length;i++)
        {
            if(codigo == listaDeImoveis[i].getCodigo())
            {
                listaDeImoveis[i].setVendido(true);
                listaDeImoveis[i].setCorretor(corretor);
                codigoValido = true;
                break;
            }
            
            if(listaDeImoveis[i] instanceof ImoveisResidenciais)
            {
                System.out.println("é residencial");
            }
        }
        
        if(!codigoValido)
        {
            throw new TamanhoMaxExc("codigo invalido na hora da venda");
        }
    }


   
    
    void listarImoveis(String titulo,boolean apenasDisponiveis,boolean residenciais)
    {
        System.out.println(titulo+"\n");
        for(int i = 0;i<tamanhoMaximo;i++)
        {
            if(apenasDisponiveis && !listaDeImoveis[i].isAlugado())
            {
                continue;
            }
            
            if(residenciais && (listaDeImoveis[i] instanceof ImoveisResidenciais))
            {
                continue;
            }
            
            System.out.println("Codigo: " + listaDeImoveis[i].getCodigo());
            System.out.println("CEP: " + listaDeImoveis[i].getCep());
            System.out.println("Endereco: " + listaDeImoveis[i].getEndereco());
            System.out.println("Nome do proprietario: " + listaDeImoveis[i].getNomeProprietario());
            System.out.println("\n");
            
        }
        
        
    }
        
        
    
    
}
