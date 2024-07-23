// pacote
package dataStructure;


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
        // PRÉ ORDEM :
        // EM ORDEM :
        // PÓS ORDEM :
    // BUSCA
        // BUSCA EM LARGURA (BFS)
        // BUSCA EM PROFUNDIDADE (DFS)
    
    
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
        
        // Método isLeaf dentro do nó
        public boolean isLeaf() { // verificar se o nó a direita e a esquerda estão vazios
            return (this.left == null) && (this.right == null);
        }
    }
    
    // É FOLHA? (isLeaf)
    
   
    
    
    
    
}
