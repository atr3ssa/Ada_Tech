package dataStructure;


public class BST { // Binary Search Tree
    // Arvore binária de busca:
    // estrutura de adados de arvore binária
    // todos os nós da subarvore esquerda possuem um valor inferior ou igual ao nó raiz
    // todos os nós da subarvore direita possuem um valor superior ao nó raiz
    // vantagens:
        // todo o lado direito de um nó tem valores maiores
        // todo lado esquerdo de um nó possui valores menores ou iguais ao nó
        // facilita a busca de elementos
        // busca binária, se vc tem 1024 elementos, vc ja eleimina a metade (512)
    
    // PRINCIPAIS OPERAÇÕES:
        // Inserir Item (insert)
            // manter esquerdo = menor valor e direito = maior valor
                // if (newItem < raiz)
                    // if (left != null)
                        // insert(left, newItem)
                    // else
                        // raiz.left = newItem
                // else
                    // if (right != null)
                        // insert(right, newItem)
                    // else
                        // raiz.right = newItem
        // Contém item? (contains) - similar a inserção
            // if (raiz == null) false
            // if (item == raiz) true
            // if (item < raiz)
                // contains(left, item)
            // else
                // contains(right, newItem
        // Remover item (delete)
            // Remover folha (remove o nó folha da arvore e a raiz fica sem um lado)
            // Nós Incompletos (se ele tiver filho de um dos lados, retiro ele e subo o filho
            // Nó completo (tem filhos nos dois lados, 1°: copiar o menor valor das suas subarvores para aposição do nó que eu quero remover, sempre da sua subarvore direita, o nó mais a esquerda)
                // 2° depois que eu copiei e coloquei no lugar do nó anterior, eu apago ele
    
    // crar uma versão não recursiva
    
    
    public Node root; // nó raiz

 
    public class Node { // Classe nó
         public int value; // valores inteiros
         public Node left; // nó a esquerda
         public Node right; // nó a direita

        public Node(int value) { // constructor
            this.value = value;
        }     
    }
    
    // Método de inserir (insert)
    
    public void insert(int value){// método inserir (recebe valor p inserir na arvore)
        if(root == null) { // se a raiz for nula (0)
            root = new Node(value); // ela vai apontar p o novo nó
        } else {
            insert(root, value); //método de inserção recursivo part 01
        }  
    }
     private void insert(final Node root, final int value) { //método de inserção recursivo part 02
        if(root == null) return; // se a raiz for nula, não vou retornar nada
        if(value == root.value) return; // se o valor for igual ao valor da raiz, não faço nada (p/ não inserir itens que já existem na lista)
        if(value > root.value){ // se o valor for menor que o valor da raiz
           if(root.right == null) root.right = new Node(value); // e se, o lado direiro estiver vazio, ai esse lado vai receber o novo nó
           else insert(root.right, value); // senão, eu navego para o lado direito   
        } else {
            if(root.left == null) root.left = new Node(value); // e se, o lado direiro estiver vazio, ai esse lado vai receber o novo nó
            else insert(root.left,value); // senão, eu navego para o lado esquerdo
        }
        
    }
     
     // método inOrder (esquerdo - raiz - direito
     // se eu uso em uma arvore binaria de busca, ela vai imprimir em ordem crescente
     
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
    
    // Contém, item? 
    
    public boolean contains(int value){ // método booleano, indico o item que eu quero pesquisar
        // será feito de forma recursiva
        return contains(root, value); // método recursivo parte 01
        
    }
    
     private boolean contains(final Node root, final int value) { // método recursivo parte 02 - Método de pesquisa
         if(root == null) return false; // se a raiz for nula, retono falso
         if(root.value == value) return true; // se o valor da raiz for igual ao valor, retorno verdadeiro
         if(value > root.value) return contains(root.right, value); // se o valor for maior que o valor da raiz, retorno contains( valor do nó da direita)
         else return contains(root.left, value); // senão, retorno o valor do nó a esquerda da raiz     
    }
     
     // Método remover
     // implementar método utilitário: que vai retornar o menor valor dada a uma arvore, ou nó corrente
     public int minValue(Node currentNode){ // fica no elemento mais a esquerda
         while(currentNode.left != null){// enquanto o nó corrente a esquerda não for nulo, 
            currentNode = currentNode.left; // eu vou navegar p o seu lado esquerdo, se ele não tiver subarvore a esquerda, então ele é o menor valor
     }
     
     return currentNode.value; // vou retornar o valor do nó corrente
}
     public void deleteNode(int value){ // de forma recursiva
         deleteNode(root, value); // método recursivo
         
     }
     
     private Node deleteNode(final Node root, final int value) {// método recursivo
         // vai retornar a subarvore com o nó deletado
         if(root == null) return null; // se o valor for nulo, retorno nulo
         
         if(value < root.value){// se o valor que eu quero deletar for menor que o da raiz, vou para o lado esquerdo:
             root.left = deleteNode(root.left, value); //o lado esquerdo vai apontar p a subarvore, depois que eu deletar aquele nó
        // se o nó que eu vou deletar está do lado esquerdo de uma arvore, o lado esquerdo vai ser igual aquela arvore com o nó deletado
        
    } else if(value > root.value) {// senão, se o valor for maior que o valor que está nessa raiz, eu faço o inverso
        root.right = deleteNode(root.left, value); // o lado direito = o nó deletado do lado direito dessa arvore passando o valor
    } else { // senão, se o valor n é menor ou maior, ou seja valor igual ao armazenado na raiz
        if ((root.left == null) && (root.right == null)){// se esse nó for uma folha, se o lado esquerdo é nulo e o direito tmb
            return null; // eu vou retornar nulo
            } else if (root.left == null){ // se ele possui lado esquerdo igual a null
                    return root = root.right; // esse nó raiz vai acabar se tornando o lado direito
                    }
     
    
    public static void main(String[] args) {
        BST tree = new BST(); // // criei minha arvore de busca, que a principio está vazia
        
        //inserindo na arvore
        tree.insert(37);
        tree.insert(66);
        tree.insert(42);
        tree.insert(11);
        tree.insert(72);
        tree.insert(8);
        tree.insert(17);
        
        System.out.println(tree.contains(11)); // se tiver o valor 11, retornará true, senão, false
        System.out.println(tree.contains(99)); // se tiver o valor, retornará true, senão, false
        
        System.out.println("#########################"); 
        tree.inOrder(); // imprimir em ordem, nesse caso, por ser uma arvore binaria de busca, será em ordem crescente
    }
    
}
