/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibrioteca;

/**
 *
 * @author felip
 */
public class Bibrioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Publicacao p1 = new Periodico(3,"A vida dos gansos",10,5);
         p1.imprimir();
         p1.consultar();
         
         Livro_nao_tecnico p2 = new Livro_nao_tecnico("George","A vida dos patos",4,0);
         p2.emprestar();
         p2.imprimir();
         
         Livro p3 = new Livro_tecnico(true,"Luis","A vida da desgraça",99,99);
         p3.reservar();
         p3.emprestar();
         p3.imprimir();
         //Resolver esse bagui de true
         
         
         //ta faltando descobrir como devolve, reserva e um monte de coisa dos livros
         //Corrigir a disponibilidade
         //Classes abstratas
    
       
    
    }
    
   
}
