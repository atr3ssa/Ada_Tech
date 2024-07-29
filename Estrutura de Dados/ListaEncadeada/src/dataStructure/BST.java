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
        // Contém item? (contains)
        // Remover item (delete)
    
    
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
    
    public static void main(String[] args) {
        BST tree = new BST(); // // criei minha arvore de busca, que a principio está vazia
        
        //inserindo na arvore
        tree.insert(2);
        tree.insert(1);
        tree.insert(3);
        
        tree.inOrder(); // imprimir em ordem, nesse caso, por ser uma arvore binaria de busca, será em ordem crescente
    }
    
}
