// pacote
package problem;

import dataStructure.Tree;
import java.util.ArrayList;
import java.util.List;


public class LargestTreeValues {
    
    /* PROBLEMA: Maior valor em cada nível da Árvore Binária
    
            Dada uma árvore binária, encontre o maior valor em cada nível
    
    ALGORITMO:
        1- Utilize o algoritmo BFS (não é necessário ser um BFS) para percorrer a árvore e uma lista auxiliar
        2- Para cada elemento e seu nível da árvore:
            - Se a lista possuir o índice = nível, substitua pelo maior valor;
            - Senão adicione na lista/ vetor
    
    
    precisa ter uma árvore binária aplicada. como já tem uma no file Tree, então ta ok
    */
    
    public static List<Integer> largestValues(Tree tree){
        // criar lista de retorno
        
        var list = new ArrayList<Integer>(); // variavel lista receberá um array de inteiros
        // implementar o método preOrder (raiz - esquerda - direita)
        solveTree(tree.root, 0, list); //método recursivo solve (raiz da arvore, nível , lista)
        
        return list; // retornar lista
    }
// método
    private static void solveTree(final Tree.Node node, // recebe um nó 
                                  final int level, // recebe um nível 
                                  final ArrayList<Integer> list) { // recebe a lista que vai ser preenchida
        
        if(node == null) return; // se o nó for nulo, ele retornará nada
        
        if(level == list.size()){ // se o nó nao for nulo, verificar se aquele nivel já foi avaliado
            // se o nivel for  igual ao tamanho da lista
            list.add(node.value); // add o valor do elemento na lista, nesse caso, o valor do nó      
        }else { //senão, se já existia um elemento naquela posição
            // Vou sobrescrever na posição
            list.set(level, Math.max /* CLASSE MATH */(list.get(level), node.value)); //setar na lista, naquele level(indice) o valor máximo, do elemento que ta
            // armazenado naquela posição, com o valor que eu quero inserir
            
        }
        
        // chamar o método de forma recursiva
        solveTree(node.left, level+1, list); //chamar o método para caminhar para o lado esquerdo, quando desço mais um nível, o level é incrementado, além disso, envio a lista
        solveTree(node.right, level+1, list); // O mesmo, mas agora caminho para o lado direito
        
    }
    public static void main(String[] args) {
        Tree tree = new Tree(); // Arvore arvore = nova Arvore
        
        // método inserir:
        
        tree.insert(100); 
        
        tree.insert(10);
        tree.insert(5);
        
        tree.insert(6);
        tree.insert(1);
        tree.insert(7);
        tree.insert(5);
        
        // Quero que imprima os maiores valores de cada nível
        System.out.println(largestValues(tree));
    }
    
    
}
