
package animais_heranca;


public class Passaro extends Animal{//herança (passaro é uma classe filha da classe animais)
    //Atributos estão sendo herdados da classe animal
    
    static int numeroDePassaros;//Variável estática = única p cada classe
    
    //constructor está sendo herdado da classe animal

    public Passaro(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);//constructor que bate com o constrctor do pai (super) /ele envia as infos daqui p lá
    }
    
     //Métodos estão sendo herdados da classe animal
    
    @Override//Método override
    public String toString() {//Método Override toString: / deixar o endereço de memória + legível para os humanos / escolher uma variável única / escolhe um campo p validar como único ( no caso aqui, o NOME)
        return "Passaro{" + "nome=" + nome + '}';
    }
     @Override // herdei o método soar do pai, mas alterei p o som que a classe filho (passaro) fará
     public void soar(){
         System.out.println("PIU PIU");
     }
    
}
