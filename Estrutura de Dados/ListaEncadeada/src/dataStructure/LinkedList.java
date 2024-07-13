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
            //prepend(inicio=cabeça), append(final=cauda), insert(criar método p inserir em determinada posição)
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
    
    public LinkedList(String data){ // Constructor da lista encadeada
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
   public void makeEmpty(){ // método p esvaziar a lista
       head = null;
       tail = null;
       length = 0;
   }
   
   //Operação IMPRIMIR 
   public void print(){ //método print
       System.out.println("######################################################");
       Node temp =this.head; // temporário inicializa na cabeça / posição FIXA
       while(temp != null){ // enquanto o temporário for diferente de null, quando for null significa que chegou no final da lista
           System.out.println(temp.data); // mostrar o dado onde o temporário se encontra
           temp = temp.next; // temporário recebe o próximo
       }
       System.out.println("######################################################");
       
   }
   
   //Operação INSERIR no COMEÇO(Cabeça)
   public void prepend(String data){
       Node newNode = new Node(data);//Nó novoNó = novo Nó(dado);
       if(length == 0){ // se tamanho for igual a 0
           head = newNode; // cabeça é apontada pelo novo nó
           tail = newNode; // cauda é apontada pelo novo nó
       } else { //senão
           newNode.next = head; //O próximo do novo Nó recebe a cabeça;
           head = newNode; // A Cabeça recebe o novo nó
       }
       length++;
   }
   
   //Operação INSERIR no FINAL(Cauda)
   public void append(String data){
     Node newNode = new Node(data); //Nó novoNó = novo Nó(dado);
     if(length == 0){ // se tamanho for igual a 0
         head = newNode; // cabeça é apontada pelo novo nó
         tail = newNode;  // cauda é apontada pelo novo nó
     } else { //senão
         tail.next = newNode; //O próximo da cauda recebe o novo nó
         tail = newNode; // cauda recebe o novo nó
     }
     length++;
   }
   
   //Operação Remover do Ínicio(Cabeça)
   public Node RemoveFirst(){
      if(length == 0)return null;  //Se o tamanho for igual a 0 (vazio), será retornado nulo
      Node temp = head; // O nó temporáro recebe a cabeça
      head = head.next; // A cabeça recebe o próximo do nó temporário
      temp.next = null; //despluguei da lista o temp, colocando o próximo p ser nulo
      length--; // diminuo a lista
      
      if(length == 0){
           head = null;
           tail = null;
       }
      return temp; 
   }
   //Operação Remover do FINAL(Cauda)
   public Node RemoveLast(){ // método p remover o último item da lista (nó)
       if(length == 0)return null;  //Se o tamanho for igual a 0 (vazio), será retornado nulo
       Node pre = head; // o pre será o head 
       Node temp = null; // temporário será nulo
       
       while(pre.next != tail){ //enquanto nó depois do pre for diferente da cauda
          pre = pre.next; //pre vai receber o próximo, ou seja, vai navegar de forma linear
       } //Quando o nó depois do pre for igual a cauda
       temp = tail;// o temporario vai armazenar a cauda 
       tail = pre; //a cauda vai receber o pre
       tail.next = null; // o p´roximo da nova cauda será vazio
       
       length--;
       if(length == 0){
           head = null;
           tail = null;
       }
       return temp;
   }
   
   // Operação Ler determinada posição
   public Node get(int index){
      if(index < 0 || index >= length) return null;
      Node temp= head;
      for(int i = 0; i < index;i++){ //para i = 0, vai ser acrescentado 1 enquanto o i for menor que o index
        temp = temp.next;
      }
       return temp;
   }
   
   //Operação BÔNUS
   public boolean set(int index, String data){
      Node temp = get(index);
      if(temp != null){
          temp.data = data;
          return true;
      }
      return false;
   }
   
   //Operação inserir em determinada posição
   public boolean insert(int index, String data){
       if(index < 0 || index > length) return false;
       if(index == 0){
           prepend(data);
           return true;
       }
       if (index == length){
           append(data);
           return true;
       }
       Node newNode = new Node(data);
        Node temp = get(index -1); //
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
   }
   
   //Operação Remover de determinada posição
   public Node Remove(int index){
     if(index < 0 || index > length) return null;
     if(index == 0) return RemoveFirst();
     if (index == length -1) return RemoveLast();
     Node prev = get(index -1);
     Node temp = prev.next;
     
     prev.next = temp.next;
     temp.next = null;
        length--;
        
        return temp;
        
   }
   
   
    public static void main(String[] args) { // rodar os métodos
        LinkedList list = new LinkedList("elemento 1");
        
        list.append("elemento 2");
        list.append("elemento 3");
        list.prepend("elemento 0");
        list.print();
        
        list.Remove(2);
        list.print();
//        list.insert(2, "elemento 2.5");
//        list.set(0, "elemento A");
//        System.out.println(list.get(2).data);
//        list.print();
//        
//        list.getHead();
//        list.getTail();
//        list.getLength();
//        
//        System.err.println("O " + list.RemoveLast().data + " foi removido da CAUDA! e o " + list.RemoveFirst().data + " foi removido da CABEÇA!");
//        //System.err.println("O " + list.RemoveFirst().data + " foi removido da CABEÇA!" );
//        list.print();
        
    }
    
}
