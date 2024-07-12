package main;


//Classes importadas de outro pacote
import animais_heranca.Cachorro;
import animais_heranca.Gato;
import animais_heranca.Passaro;
import lojas.PetShop;

public class Main {
    public static void main(String[] args) {
        //Classe define o que é o objeto(caracteristicas, comportamentos) / classe diferente de objeto
        //variavel de referencia ( referencia um objeto) / cria objeto na memória
        
            //objetos / EX1: Cachorro cachorro0 = new Cachorro(); //Construtor padrão (zerado)
            
          Cachorro cachorro1 = new Cachorro("Puppy","marrom", 25 , 5.5, 5 , "paz");//define a classe construída, coloca o nome da variavel de refencia para o objeto = cria um novo objeto Cachorro;
        
          Gato /*Classe de referencia*/ gato1 = new Gato/* Classe verdadeira */("Mel","branco", 15, 4.5, "paz");
                //todo gato é um animal, mas nem todo animal é um gato = polimorfismo
                //ex: Animal gato2 = new animal(); ERRADO, pq mesmo que TODO ANIMAL É UM  ANIMAL, a classe animal(pai) é abstrata, então não pode criar objetos
                //ex2: Animal gato2 = new Gato (); OK, pq TODO GATO É UM ANIMAL
                //ex3: Gato gato2 = new Animal(); ERRADO, pq NEM TODO ANIMAL É UM GATO
                
          Passaro passaro1 = new Passaro("Dori", "Amarelo", 9, 2.3, "paz");
            
          PetShop petshop = new PetShop();
          
          //polimorfismo = capacidade de um objeto de poder ser referenciado de várias formas
          
          //Gato (métodos)
          gato1.soar();
          petshop.banho(gato1);
            System.out.println("O gato está " + gato1.getEstadoDeEspirito());
          
          //Passaro (métodos)
          passaro1.soar();
          
          //Cachorro (métodos)
          cachorro1.soar();//chamar método / variavel de referencia do objeto . método(); / P/ realizar uma ação
          petshop.banho(cachorro1);
            System.out.println("O cachorro está " + cachorro1.getEstadoDeEspirito());
          petshop.tosar(cachorro1);
            System.out.println("O cachorro está " + cachorro1.getEstadoDeEspirito());
          
           
          //cachorro1.pegar(); /dessa forma, não aparece o que foi retornado. P/ aparecer é necessário usar um System out, como abaixo:
          System.out.println("O cachorro pegou a " + cachorro1.pegar()); // Pegar
        
          System.out.println("O cachorro está " + cachorro1.interagir("vai dormir!"));// Interagir
          System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
          System.out.println("O cachorro está " + cachorro1.interagir("nada"));
          System.out.println("O cachorro está " + cachorro1.interagir("pisar na patinha"));
         

        
        //ANOTAÇÕES:
                    //colocar as variaveis cachorro
                        // EX: cachorro1.setNome("Puppy");
                                //referencia.chamaométodo(passa a variavel);
                        // cachorro1.setCor ("marrom");
                    //COMO FICA EM MEMÓRIA(cada objeto tem um endereço de memória próprio):
                                //System.out.println(cachorro0.toString());
                                //System.out.println(cachorro1.toString());
                                //System.out.println(cachorro2.toString());
                    //cachorro1 = cachorro2; //fez com que ambos objetos ficassem com o mesmo endereço de memória (Cuidado)
                                //Isso faz com que um dos objetos se perca na memória e não possa mais ser achado /Garbet colector = coletor de lixo no java, em algum momento ele vai rodar e jogar o objeto perdido fora
                                //Pesquisar como funciona o garbet colector no java
                    //mostrar na memória, agora que o endereço de ambas foi igualado
                                //System.out.println(cachorro1.toString());
                                //System.out.println(cachorro2.toString());

                 
               //Curiosidades:
                    //valor default de qualquer objeto é null;
                    //posso substiyuir o . por _
                    //aclopamento = quando uma classe depende de outra = herança
                    // estudar herança X acoplamento
                        double d = 1.0d;// tem que por o d ou o f, para mostrar que é um double ou float;
                        float f = 2.0f;

                        float x = (float)d + f; // Casting = por somar floats, e ter um double, tive que falar para o java confiar que o double pode ser somado como um float, ai funcionou
                            System.out.println(x);
    }
}
