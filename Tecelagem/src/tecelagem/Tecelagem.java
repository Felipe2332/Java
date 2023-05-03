/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tecelagem;

/**
 *
 * @author felip
 */
public class Tecelagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Administracao p1 = new Administracao(1500,"jorge",65478);
        p1.registrarFalta();
        p1.hollerith();
        
        System.out.println("-------------------------\n");
        
        Producao p2 = new Producao(12,"Luis",65464);
        p2.registrarHorasDiurnas();
        p2.registrarHorasNoturnas();
        p2.hollerith();
        
        System.out.println("-------------------------\n");
        
        Vendas p3 = new Vendas(1200,"Hector",4567);
        p3.registrarVenda(200);
        p3.registrarVenda(300);
        
        p3.hollerith();
        
        
        
    }
    
}
