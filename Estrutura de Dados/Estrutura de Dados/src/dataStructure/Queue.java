//pacote
package dataStructure;

// Operação criar Fila
public class Queue { // FILAS
    // FILAS = 1° elemento inserido será o 1° a ser tirado
    // FIFO = First in First out ---- LILO = Last in Last out
    // ex: Fila de atendimento bancário
    // Possui 2 extremidades: em 1: É feita a inserção de elementos (fim da fila); em outra: É feita a remoção de elementos (ínicio da fila);
    // Problemas resolvidos: Escalonamento de tarefas por ordem de chegada
    // Tempo de espera de clientes em Call Center
    // Definição do número de caixas de supermercado
    
    // Principais Operações:
    
    // Add Item (queue)
    // Remover item (dequeue)
    // Imprimir (print)
    
    // Operação Opcional:
    
    // Primeiro da fila (getFirst)
    // Último da fila (getLast)
    // tamanho da fila (getLength)
    
    private Node first;
    private Node last;
    private int length;
    
    public class Node { // Classe nó
        
        int value; // vai apresentar um valor int
        
        Node next; // vai apontar p o próximo nó

        public Node(int value) { //implementar constructor
            this.value = value; // recebe um valor e armazena na propriedade de valor desse nó
            
        }  

        public int getValue() {
            return value;
        }
        
    }

    public Queue(int value) { // implementar o constructor da Fila
        Node newNode = new Node(value); // recebe um valor inicial que será armazenado no nó
        first = newNode; // esse nó será o primeiro da fila
        last = newNode; // esse nó será o último da fila
        length++; // incrementar o tamanho
    }
     
    
    // OPERAÇÃO LER O 1° DA FILA(getFirst) / Métodos:
    
    public void getFirst(){// Método getFirst
       if(first == null){ // Se o 1° for igual a null (nada)
           System.out.println("Fila vazia"); // mostre: " Fila vazia"
       } else { // senão
           System.out.println("1°: " + first.value); // mostre: "1° (first): " + (concatenação) valor do 1°
       }
    }
    
    // OPERAÇÃO LER O ÚLTIMO DA FILA(getLast)
    
    public void getLast(){ // Método getLast
        if(last == null){ // Se o último for igual a null (nada)
            System.out.println("Fila vazia"); // mostre: " Fila vazia"
        } else { // senão
            System.out.println("Último: " + last.value); // mostre: "último (last): " + (concatenação) valor do último
        }
    }
    
    // OPERAÇÃO Imprimir o tamanho da fila (getLength)
    
    public void getLength(){ // método Tamanho
        System.out.println("Tamanho: " + this.length); // mostra o tamanho da lista
    }
    
    // OPERAÇÃO Imprimir Fila (print)
    
    public void print(){
        System.out.println("####################### F I L A ###########################");
        Node temp = this.first; // temporário inicializa no 1° / posição FIXA
        while(temp != null){ // enquanto o temporário for diferente de null, quando for null significa que chegou no final da lista
           System.out.println(temp.value); // mostrar o dado onde o temporário se encontra
           temp = temp.next; // temporário recebe o próximo
       }
        System.out.println("###########################################################");
    }
    
    // OPERAÇÃO Enfileirar / Inserir (enqueue)
    
    public void enqueue(int value){
        Node newNode = new Node(value);
        if(length == 0){ // se o tamanho for igual a 0
            first = newNode; // o novo nó aponta p o primeiro
            last = newNode;  // o novo nó aponta p o último
        } else { //senão
            last.next = newNode; //O próximo do último recebe o novo nó
            last = newNode; // O último recebe o novo nó
        }
        length++;
    }
    
     // OPERAÇÃO Desenfileirar / Remover (dequeue)
    
    public Node dequeue(){
        if(length == 0) return null; // Se o tamanho for igual a 0 (vazio), será retornado nulo
        Node temp = first; // O nó temporáro recebe o primeiro
        if(length == 1){ // Se o tamanho for igual a 1
          first = null; // O nó será o primeiro da fila
          last = null;  // O nó também será o último da fila
        }else { // senão
            first = first.next;  // O próximo do primeiro vira o primeiro
            temp.next = null; // O próximo do nó temporário é nulo, dessa forma sendo desplugado
        }
        length--; // decrementar
        return temp; // retornar temp (o elemento excluído)
    }
    
    public static void main(String[] args) {
        Queue myQueue = new Queue(1);
        
        myQueue.print(); // imprimir
        myQueue.getFirst(); // primeiro
        myQueue.getLast(); // último
        myQueue.getLength(); // tamanho
        //
        myQueue.enqueue(2); // inserir
        myQueue.enqueue(3); // inserir
        myQueue.print(); // imprimir
        myQueue.getFirst(); // primeiro
        myQueue.getLast(); // último
        myQueue.getLength(); // tamanho
        //
        System.err.println(myQueue.dequeue().value); // imprimir o elemento excluído
        System.err.println(myQueue.dequeue().value); // imprimir o elemento excluído
        System.err.println(myQueue.dequeue().value); // imprimir o elemento excluído
        
    }
    
    
    
    
    
    
}
