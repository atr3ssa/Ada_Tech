// pacote
package dataStructure;

import java.util.LinkedList; // importar LinkedList
import java.util.Queue; // importar Queue

public class Tree { // Árvore
    
    // Arvore = Estrutura de dados não linear / Semelhante a uma árvore genealógica
    // Em cada arvore, cada nó pode ser ligado com vários outros nós
    // RAIZ = nó que não possui pai
    // NÓ PAI = nó que possui filhos/ links ou nós ligados
    // NÓ FILHO = nó que possui um nó pai
    // NÓ AVÔ = Nó que possui um nó filho e esse filho possui outros nós filhos
    // NÓS IRMÃOS = nós que possuem o mesmo pai
    // FOLHAS = Nós que não possuem filhos
    // ÁRVORES BINÁRIAS = São árvores em que um nó só pode possuir no máximo 2 filhos
        // CHEIA = Quando cada nó possui 2 ou 0 filhos
        // ÁRVORE NÃO CHEIA = nó possui 1 filho
        // ÁRVORE PERFEITA = Uma árvore cheia onde todas as FOLHAS estão no mesmo nível - em cada nível = 2^n 
            // nível 0 = 1 - nível 1 = 2 - nível 2 = 4 - nível 3 = 8 ... nível 10 = 1024
    
            // FÓRMULAS:
    
                // elementos por nível = 2^n
                // elementos 2 ^n+1 -1 OU 2 elevado a altura (n+1) -1
                // altura de uma árvore = n+1 
                    // ex: se a altura de uma árvore é 3, o nível máximo da árvore é 2 (pq a contagem começa do 0)
    
    
        // ÁRVORE BINÁRIA COMPLETA = Uma árvore cheia em que todos os nós folhas não estão no mesmo nível, MAS se ela estiver incompleta no último nível, todos os nós folhas devem estar no lado esquerdo
    
    // VANTAGENS:
        // não preciso de árvores enormes p guardar um grade número de dados
        // armazenamento de elementos e localização
        // muito usada p implementação de índices de banco de dados
    
    // PRINCIPAIS OPERAÇÕES: (não é linear, há várias (3) formas de percorrer um árvore
    
    // INICIALIZAÇÃO
    // INSERIR
    // É FOLHA? (isLeaf)
    // TRAVESSIA:
        // PRÉ ORDEM : raiz* - esquerda - direita (1°) IDENTICA A DFS
        // EM ORDEM : leitura normal esquerda - raiz* - direita (meio)
        // PÓS ORDEM : esquerda - direita - raiz* (último)
    // BUSCA
        // BUSCA EM LARGURA (BFS)
            // busca por niveis da arvore - semelhante ao método inserir
            // algoritmo de busca em largura;
        // BUSCA EM PROFUNDIDADE (DFS)
            // começo pela raiz e sempre navego para a esquerda
            // identica  a PRÉ ORDEM
    
    
    // OPERAÇÕES INICIALIZAR E INSERIR ITEM:
    
    public Node root; // nó raiz
    
    public static class Node { // Classe nó
         public int value; // valores inteiros
         public Node left; // nó a esquerda
         public Node right; // nó a direita

        public Node(int value) { // constructor
            this.value = value;
        }         
         // não haverá constructor p árvore  
        
        
        // É FOLHA? (isLeaf) 
        
        // Método isLeaf dentro do nó
        public boolean isLeaf() { // verificar se o nó a direita e a esquerda estão vazios
            return (this.left == null) && (this.right == null);
        }
    }
    
    public void insert(int value){ // método inserir (recebe valor p inserir na arvore)
        if (root == null) root = new Node(value); // se a raiz estiver vazia, será inicializada a arvore / raiz = novo nó
        else{ //senão usarei uma fila
            Node newNode = new Node(value); // novo nó
            Queue<Node> queue = new LinkedList<>(); // implementação será uma lista ligada
            queue.add(root); // add na fila o nó raiz

            while(queue.size()>0) { // enquanto minha fila tiver elementos
                Node currentNode = queue.remove(); // vou ler o elemento da fila e retirar da fila
                if(currentNode.left == null){ // se o elemento corrente, o lado esquerdo estiver vazio
                    currentNode.left = newNode; // será add um novo elemento na posição esquerda
                    break;
                } else{//senão
                    queue.add(currentNode.left); // vou add na fila aquele lado esquerdo
                }
                if (currentNode.right == null) { // o elemento, o lado direito estiver vazio
                    currentNode.right = newNode; // será add um novo elemento na posição direita
                    break;
                } else{ //senão
                    queue.add(currentNode.right); // vou add na fila aquele lado direito
                }
            }
        }
    }
    
    public void preOrder(){ // raiz - esquerda - direita
        preOrder(root); // algoritmo recursivo - imprimindo a partir da raiz da arvore em questão
    }
    
    private void preOrder(final Node node){ //método sobrescrito preOder
        // recebe de parametro um nó
        // R - E - D
        if(node == null) return; // se o nó for igual a 0, não farei nada, apenas retornará;
        System.out.println(node.value); // imprimir o valor do nó
        preOrder(node.left); // lado esquerdo do nó
        preOrder(node.right); // lado direito do nó
        
    }
    
    public void inOrder(){ // esquerda - raiz - direita
        inOrder(root); // algoritmo recursivo - imprimindo a partir da raiz da arvore em questão
    }
    
    private void inOrder(final Node node){
        // recebe de parametro um nó
        // E - R - D
        if(node == null) return; // se o nó for igual a 0, não farei nada, apenas retornará;
        inOrder(node.left); // lado esquerdo do nó
        System.out.println(node.value); // imprimir o valor do nó
        inOrder(node.right); // lado direito do nó
    }
    
    public void posOrder(){ // esquerda - direita - raiz
        posOrder(root); // algoritmo recursivo - imprimindo a partir da raiz da arvore em questão
    }
    
    private void posOrder(final Node node){
        // recebe de parametro um nó
        // E - D - R
        if(node == null) return; // se o nó for igual a 0, não farei nada, apenas retornará;
        posOrder(node.left); // lado esquerdo do nó
        posOrder(node.right); // lado direito do nó
        System.out.println(node.value); // imprimir o valor do nó
    }
    public void BFS(){ // esse método não é recursivo
        if (root == null) return; // se minha raiz estiver vazia, não faço nada;
        Queue<Node> queue = new LinkedList<>(); // senão, vou criar uma fila e add um nó raiz:
        queue.add(root); // add na fila o nó raiz
        while(!queue.isEmpty()) { 
            Node node = queue.remove(); // desenfileirar - remover itens
            if(node.left != null) queue.add(node.left); // se  o nó da esquerda for diferente de 0, vou add ele na fila
            if(node.right != null) queue.add(node.right); // se o nó a direita for dferente de 0, vou add ele na fila
            
            System.out.println(node.value);
            

          
        }
        
    }
    
    
    
    public static void main(String[] args) {
        Tree tree = new Tree(); // criei minha arvore, que a principio está vazia
        
        //inserindo na arvore
        tree.insert(37); 
        tree.insert(11);
        tree.insert(66);
        tree.insert(8);
        tree.insert(17);
        tree.insert(42);
        tree.insert(72);
        
        System.out.println("#######preOrder########");
        tree.preOrder(); // chamei o método preOrder
        System.out.println("#######inOrder########");
        tree.inOrder();
        System.out.println("#######posOrder########");
        tree.posOrder();
        System.out.println("#######BFS########");
        tree.BFS();
        System.out.println("###############");
        
        
        System.out.println(tree.root.value); // mandar imprimir o valor da raiz da arvore
        System.out.println(tree.root.left.value); // mandar imprimir o valor do lado esquerdo da raiz da arvore
        System.out.println(tree.root.right.value); // mandar imprimir o valor do lado direito da raiz da arvore
        
        System.out.println(tree.root.isLeaf()); // retornar se a raiz é folha (true or false)
        System.out.println(tree.root.left.isLeaf()); // retornar se a esquerda da raiz é folha
        System.out.println(tree.root.right.isLeaf()); // retornar se a direita da raiz é folha
    }
   
    
    
    
    
}
