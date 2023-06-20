/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imobiliaria;

/**
 *
 * @author felip
 */
public class Imobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaImoveis lista1 = new ListaImoveis(4);
        
        ImoveisNoGeral imv = new ImoveisNoGeral(12,43543553,"Rua da petunias","Gabriel","Geraldo");
        ImoveisNoGeral imv1 = new ImoveisNoGeral(14,135454,"Rua dos doidos","Virginia","Felipe");
        ImoveisNoGeral imv2 = new ImoveisNoGeral(18,13545764,"Rua dos malucos","Lucy","Pedro");
        ImoveisNoGeral imv3 = new ImoveisResidenciais(4,2,22,13474400,"Rua das flores","Samuel","Stela");
        
        try
        {
            
           //Cadastrar imovel na lista
           lista1.cadastrarImovel(imv);
           lista1.cadastrarImovel(imv1);
           lista1.cadastrarImovel(imv2);
           lista1.cadastrarImovel(imv3);
           
           //Alugar imovel
           lista1.alugarImovel(14, "Geraldão");
           
           //Vender imovel
           lista1.venderImovel(18, "Vendedor");
           
           //Listar
           lista1.listarImoveis("Eduardo", true, true);
        }
        catch(TamanhoMaxExc e)
        {
            System.out.println(e.getMessage());
        }
        
        
    }
}
