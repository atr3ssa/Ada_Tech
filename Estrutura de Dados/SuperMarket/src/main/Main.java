//pacote
package main;

//importações
import implementation.Supermarket;
import implementation.SupermarketArray;
import java.util.Scanner;

public class Main {
    //Estrutura de dados = forma específica de armazenar dados
    // TAD = Tipos abstratos de dados
        // LISTA LIGADA = semelhnate a um vetor (tamanho infinito e alocado de forma dinamica
        // PILHAS = estrutura de dados de uma extremidade (inserir e remover pela extremidade), linear
        // FILAS = O 1° que chegou é atendido e removido, linear, dupla extremidade
        // Arvore = não é linear, profundidade, complexidade
        
    
    private final static int SIZE = 3;
    
    public static void main(String[] args) {//classe executável
        Scanner scanner = new Scanner (System.in); // Classe para receber dados do usuário
        Supermarket supermarket = new SupermarketArray (SIZE); // constante
        int opcao; //variável onde as respostas serão armazenadas
        
        do{ //laço do while
            System.out.println("\n Lista de Compras");
            System.out.println("1 - Inserir");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção:");
            opcao = scanner.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("Digite o item a ser inserido:");
                    String item = scanner.next();
                    supermarket.add(item);
                    break;
                case 2:
                    supermarket.print();
                    break;
                case 3:
                    System.out.println("Digite a posição do item a ser removido");
                    int index = scanner.nextInt();
                    supermarket.delete(index);
                    break;
                case 4:
                    System.out.println("saindo do programa...");
                    break;
                default:
                    System.err.println("Opção inváida, por favor, digite novamente");
            }     
        } while (opcao != 4); // enquanto o número digitado for diferente de 4, o menu vai seguir em looping
    
        scanner.close(); //finalizar
        
    }

    


   
}
