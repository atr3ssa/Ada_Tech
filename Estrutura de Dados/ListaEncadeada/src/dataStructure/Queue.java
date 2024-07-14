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
    
    
    
    
    
    
    
    
    
    
}
