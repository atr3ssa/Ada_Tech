//pacote
package dataStructure;


//OPERAÇÃO CRIAR PILHA
public class Stack { // PILHA
    //Pilhas = lista ordenada (ordem de inserção de elementos) = o último elemento inserido será o primeiro a ser tirado
    // LIFO = last in first out (último que entrou será o 1° a sair) ---------------- FILO = First in last out (O 1° que entrou será o último a sair)
    // Possui apenas 1 extremidade, a extremidade em que insiro elementos é a mesma que eu retiro elementos
    // extreminada denominada como TOP ou TOPO
    // ex: Pilha de pratos, vc enxuga o primeiro de cima que foi o último a ser lavado
    // A INSERÇÃO e a REMOÇÃO são feitas apenas pelo topo da lista, pela cabeça, não podendo selescionar uma posição específica
    // Muito usada em: voltar no histórico de browser, validar parenteses, colchetes e chaves e esxpressões prefixa, posfixa...

    //PRINCIPAIS OPERAÇÕES:
    
    // Add item (push)
    // Remover item (pop)
    // Ler topo (getTop)
    // Imprimir (print)
    
    // OPERAÇÕES OPCIONAIS:
    
    // Altura da pilha (getHeight)

    private Node top; // Nó TOPO;
    private int height; // Altura da PILHA
    
class Node { // Classe nó
    int value; // vai apresentar um valor int
    
    Node next; // vai apontar p o próximo nó
    

        public Node(int value) { //implementar constructor
            this.value = value;
           
        }  
}
    public Stack(int value) { // implementar o constructor da PILHA
        Node newNode = new Node(value); // recebe um valor inicial que será armazenado no nó
        top = newNode; // esse nó será o topo da pilha
        height = 1; // Agr contém 1 elemento (nó) 
    }
    // Métodos:
    
    // OPERAÇÃO LER TOPO (getTop)
    
    public void getTop(){ // Método getTop
        if(top == null){ // Se o topo for igual a null (nada)
            System.out.println("Pilha vazia"); // mostre: " Pilha vazia"
        } else { // senão
            System.out.println("Topo: " + top.value); // mostre: "topo: " + (concatenação) valor do topo
        }
    }
    
    // OPERAÇÃO ALTURA DA PILHA (getHeight)
    
    public void getHeight(){ // Método get Height
        System.out.println("Altura: " + height); // Mostre: "Altura: " + (concatenação) altura
    }
    
    // OPERAÇÃO IMPRIMIR (print)
    
    public void print(){ //Método print
        System.out.println("################### P I L H A ####################");
        Node temp = top; // temporário inicializa no topo/ posição FIXA
        while(temp != null){ //siga em looping enquanto o temporário for diferente de null
            System.out.println(temp.value); // mostrar o valor onde o temporário se encontra  
            temp = temp.next; // temporário recebe o próximo ( ir p o próximo elemento)
        }
        System.out.println("##################################################");
    }
    
    //OPERAÇÃO INSERIR (push)
    
    public void push(int value){
        Node newNode = new Node(value);
        if(height == 0){ // se a altura for igual a 0
           top = newNode;  // o novo nó aponta p o topo
        } else { //senão
            newNode.next = top; //o nó após o novo nó recebe o topo
            top = newNode; // o topo recebe o novo nó
        }
        height++; // acrescenta
    }
    
    // OPERAÇÃO REMOVER (pop)
    public Node pop(){
        if(height == 0) return null;// se a altura for igual a 0
            Node temp = top; // O nó temporáro recebe o topo
            top = top.next; // O topo recebe o próximo valor
            temp.next = null; //despluguei da pilha o temp, colocando o próximo p ser nulo
            height--;
            
            if(height == 0){// se a altura for igual a 0
                top = null;
            }
            return temp; 
    }
    
    // MAIN
    
    public static void main(String[] args) {
        Stack myStack = new Stack(2);
        myStack.print(); // chamando método p imprimir na tela
        myStack.getTop(); // chamando método p mostrar o topo
        myStack.getHeight(); // chamando método p mostrar a altura
        
        myStack.push(1); // chamando método que insere um nó
        myStack.print(); // chamando método p imprimir na tela
        myStack.getTop(); // chamando método p mostrar o topo
        myStack.getHeight(); // chamando método p mostrar a altura
        
        
        System.err.println(myStack.pop().value); // imprime o valor removido --- O último a entrar é sempre o 1° a sair
        System.err.println(myStack.pop().value); // imprime o valor removido --- O último a entrar é sempre o 1° a sair
        System.err.println(myStack.pop() == null); // se a pilha estiver vazia, dará true
    }
    
    
    
    
    
    
    
    
    
    
    
    
}   
    

