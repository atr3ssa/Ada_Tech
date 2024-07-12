
package animais_heranca;


public class Gato extends Animal {
     //Atributos estão sendo herdados da classe animal
    static int numeroDeGatos; //Variável estática = única p cada classe

     //Constructor herdado da classe animal
    
    public Gato(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito); //constructor que bate com o constrctor do pai (super) /ele envia as infos daqui p lá
    }
    
    //Métodos estão sendo herdados da classe animal
    
    @Override // Método Override
    public String toString() { //Método Override toString: / deixar o endereço de memória + legível para os humanos / escolher uma variável única / escolhe um campo p validar como único ( no caso aqui, o NOME)
        return "Gato{" + "nome=" + nome + '}';
    }
     @Override // herdei a ação soar do pai, mas alterei o som especifico do gato, que desejo que apareça
     public void soar(){
         System.out.println("MIAU MIAU");
     }
    
    
}
