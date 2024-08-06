// pacote
package problem;

import dataStructure.Tree;
import java.util.ArrayList;
import java.util.List;


public class LargestTreeValues {
    
    /* PROBLEMA: Maior valor em cada nível da Árvore Binária
    
            Dada uma árvore binária, encontre o maior valor em cada nível
    
    ALGORITMO:
        1- Utilize o algoritmo BFS para percorrer a árvore e uma lista auxiliar
        2- Para cada elemento e seu nível da árvore:
            - Se a lista possuir o índice = nível, substitua pelo maior valor;
            - Senão adicione na lista/ vetor
    
    
    precisa ter uma árvore binária aplicada. como já tem uma no file Tree, então ta ok
    */
    
    public static List<Integer> largestValues(Tree tree){
        // criar lista de retorno
        
        var list = new ArrayList<Integer>(); // variavel lista receberá um array de inteiros
        return list; // retornar lista
    }
    
    
}
