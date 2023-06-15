/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_kart;

/**
 *
 * @author felip
 */
    public class Baterias{

        //Só essa classe é visível para os usuários
        private String categoria;
        private int numero_da_bateria,numero_equipe_vencedora,numero_de_equipes;
        private int numEquipesInscritas;
        private Equipes_participantes[] Equipes_lista;

        //Criação da lista/bateria
        public Baterias() { 
            this.categoria = categoria;
            this.numero_da_bateria = numero_da_bateria;
            numero_de_equipes = 11;
            Equipes_lista = new Equipes_participantes[this.numero_de_equipes];//Aqui define o máximo de equipe que podem se inscrever
            this.numEquipesInscritas = 0;
            
            for (int i = 0; i < Equipes_lista.length; i++)
            {
            Equipes_lista[i] = new Equipes_participantes(-1, "", "");//Tem que construir o array, senão vai me retornar que o array está vazio
            }
        }






        void inscreverEquipe(int numeroEquipe,String Nome,String Piloto) throws Numero_de_equipes_max
        {
            //Se o número de equipes inscritas for mais que o numero total aceitos, que é 10, não permite.
            if(numEquipesInscritas >= numero_de_equipes)
            {
                throw new Numero_de_equipes_max("Limite de inscrições atingidas");
            }

            Equipes_participantes novaEquipe = new Equipes_participantes(numeroEquipe,Nome,Piloto);
            Equipes_lista[numEquipesInscritas] = novaEquipe;
            numEquipesInscritas++;

        }

        int buscarEquipe(int numeroEquipe)
        {
            for(int i =0; i<numEquipesInscritas;i++)
            {
                if(Equipes_lista[i].getNumero_da_equipe()==numeroEquipe)
                {
                    System.out.println(i);//Retorna o indice da equipe
                    return i;
                }

            }
            System.out.println("Equipe não encontrada");
            return -1;// Equipe não encontrada
        }



        void desclassificar(int index) throws Numero_de_equipes_max
        {
            if(index < 0 || index >= numEquipesInscritas)
            {
                throw new Numero_de_equipes_max("Indice informado invalido");
            }

            //Criacao da variavel local para atribuir
            Equipes_participantes equipe = Equipes_lista[index];
            equipe.setClassificacao(-1);

        }

    void classificar(int index, int posicao) throws Numero_de_equipes_max
        {
            //Criacao da variavel local
            Equipes_participantes equipe = Equipes_lista[index];
            if(index < 0 || index >= numEquipesInscritas)
            {
                throw new Numero_de_equipes_max("Indice informado invalido");
            }

            
            else if(equipe ==null)
            {
                System.out.println("A equipe não foi definida");
            }

            
            else if(Equipes_lista[index].getClassificacao()==-1)
            {
                //Se a equipe já foi desclassificada, não permitir classificação
                System.out.println("Essa equipe foi desclassificada");
            }

            else if(Equipes_lista[index].getClassificacao()==1)
            {
                equipe.setClassificacao(posicao);
                System.out.println("A equipe vencedora");
            }
            else
            {
                equipe.setClassificacao(posicao);
                //System.out.println("Equipe " + equipe.getNome_da_equipe() + " classificada na posicao " + posicao + "\n");//Colocar o título da equipe(nome)
            }
        }
    
    
    void listarEquipes()
    {
        System.out.println("O resultado da beteria foi\n");
        
        for(int i =0; i<numEquipesInscritas;i++)
        {
            Equipes_participantes equipe = Equipes_lista[i];
            if(equipe.getClassificacao()==1)
            {
                System.out.println("A equipe vencedora foi " + equipe.getNome_da_equipe()+"\n\n");
            }
            System.out.println("Nome da equipe: " + equipe.getNome_da_equipe());
            System.out.println("Nome do piloto: " + equipe.getNome_do_piloto());
            if(equipe.getClassificacao()==-1)
            {
                System.out.println("Equipe desclassificada");
            }else
            System.out.println("Classificacao final: " + equipe.getClassificacao()+ " lugar " + "\n");
        }
    }



           
}
