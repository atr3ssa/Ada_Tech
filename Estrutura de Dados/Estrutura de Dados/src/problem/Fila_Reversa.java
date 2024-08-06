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
        while(n-- > 0){// enquanto for maior que 0
            int element = queue.remove();// ler da fila, retirar da fila e
            queue.add(element);//reinserir na fila.
        }
        return queue; // retornar o resultado da fila manipulada
    }

    private static void solveQueue(Queue<Integer> queue, int k) { // método estático, lógica principal, 
        if(k == 0) return; // se k for igual a 0, retorno nada
        int element = queue.remove(); // vou pegar um elemento, vou desenfileirar da fila, chamar o método remover
        solveQueue(queue, k-1);// mando resolver p k eleementos - 1
        queue.add(element);// depois preciso add na fila o elemento que ficou de fora no final
        
    }
    // FALTA TESTAR
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); // Fila<inteiros> fila = nova listaligada<>();

// Criar uma fila de 5 elementos
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        
        System.out.println();
        
    }
}
