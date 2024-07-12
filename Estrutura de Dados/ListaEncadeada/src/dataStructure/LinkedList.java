
package dataStructure;


public class LinkedList { //LISTA LIGADA
    //Lista dinâmica linear, composta por nós
    //nó(1) -> null
    //nó(2) -> null
    //nó(1) nó(2)
    
    //Principais operações: //Métodos
    
        //Add item: 
            //prepand(inicio=cabeça), append(final=cauda), insert(criar método p inserir em determinada posição)
        //Ler os itens:
            //getHead(inicio), getTail(final), get(criar método p ler determinada posição)
        //Remover:
            //RemoveFirst(inicio), RemoveLast(final), delete(criar método p remover determinada posição)
        //Imprimir (listar)
    
    //Principais operações OPCIONAIS: //Métodos
    
        //Tamanho atual da lista = getlenght
        //Está vazia? = isEmpty
        //Esvaziar Lista = makeEmpty
    
    private Node head; // Cabeça
    private Node tail; // Cauda
    private int lentgh;// Tamanho
    

    class Node { // Classe interna NÓ
        
        //A lista ligada é composta de nós e cada nó armazena uma informação, um apontador
        String data; //informação que eu quero armazenar
        Node next; // todo nó aponta p um próximo nó

        public Node(String data) { //Constructor = Inicializar
            this.data = data;
        }
        
        
        
    }
    
}
