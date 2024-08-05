// pacote
package problem;

import java.util.Queue;


public class Fila_Reversa {
    /* PROBLEMA: Revertendo os primeiros K elementos de uma fila
        Escreva um p
            
            - visão top-down
            - Uso uma fila = queue;
            - 1: P os primeiros k elementos:
                - Desenfileirar elemento x;
                - Reordena K-1 elementos;
                - Enfileirar elemento X;
            - P os N-K elementos:
                - desenfileirar
                - enfileirar
    */
    
    public static Queue <Integer> reverseFirst(Queue<Integer> queue, int k){//retornar uma fila numérica, na solução chamada reverseFirst, 
        //dos K primeiros elementos, que receberam como parametro a fila que será reordenada e o valor de K
        
        // resolução recursivo
        
        solveQueue(queue,k);// método resolver 
        int n = queue.size()-k; // calcular o restante (tamanho da fila)
        // enquanto for maior que 0
    }

    private static void solveQueue(Queue<Integer> queue, int k) { // método estático, lógica principal, 
        if(k == 0) return; // se k for igual a 0, retorno nada
        int element = queue.remove(); // vou pegar um elemento, vou desenfileirar da fila, chamar o método remover
        solveQueue(queue, k-1);// mando resolver p k eleementos - 1
        queue.add(element);// depois preciso add na fila o elemento que ficou de fora no final
        
    }
    
}
