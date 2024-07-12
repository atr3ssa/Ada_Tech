//pacote
package dataStructure;

//Operação Criar lista e esvaziar lista

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
    private int length;// Tamanho
    

    class Node { // Classe interna NÓ
        
        //A lista ligada é composta de nós e cada nó armazena uma informação, um apontador
        String data; //informação que eu quero armazenar
        Node next; // todo nó aponta p um próximo nó

        public Node(String data) { //Constructor = Inicializar
            this.data = data;
        }  
    }
    public LinkedList(String data){ // Constructor
        length = 1; // tamanho 1
        Node newNode = new Node(data);
        head = newNode; // cabeça aponta p o único nó da lista
        tail = newNode; // cauda aponta p o único nó da lista 
    }
    
    //Métodos:
    
   public void getHead() { //método Cabeça
       
    if(this.head == null){
        System.out.println("Lista vazia");
    }else {
        System.out.println("Head: " + head.data);
    }
} 
   public void getTail(){ //método Cauda
       
      if(this.tail == null){
        System.out.println("Lista vazia");
    } else {
          System.out.println("Tail: " + tail.data);
      } 
   }
   public void getLength(){ // método Tamanho
       System.out.println("Length: " + this.length); // mostra o tamanho da lista
   }
   public void makeEmpty(){
       head = null;
       tail = null;
       length = 0;
   }
   
    public static void main(String[] args) {
        LinkedList list = new LinkedList("elemento 1");
        list.getHead();
        list.getTail();
        list.getLength();
    }
    
}
