/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_kart;

/**
 *
 * @author felip
 */
public class Exercicio_kart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Criar uma bateria primeiro(como lista) e então ir adicionando equipes nessa lista/bateria
        Baterias Bateria1 = new Baterias();
        
        
        
        //Inscrição de equipes
        try
        {
            Bateria1.inscreverEquipe(23, "Trovao", "José");
            Bateria1.inscreverEquipe(99, "Sol", "Gabriel");
            Bateria1.inscreverEquipe(74, "Floresta", "Hector");
            
            
            Bateria1.classificar(0,1);
            Bateria1.classificar(1,2);
            Bateria1.classificar(2,4);
            
            Bateria1.listarEquipes();
            
        }
        catch(Numero_de_equipes_max e)
        {
            System.out.println(e.getMessage());
        }
        
        
        //novaBateria.buscarEquipe(23);
        
        
    }
    
}
