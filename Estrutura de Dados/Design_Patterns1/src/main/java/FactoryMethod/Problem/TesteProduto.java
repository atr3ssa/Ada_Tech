// pacote
package FactoryMethod.Problem;

// PROBLEMA:A responsabilidade de informar/setar se o atributo precisa de dimensões fisicas é de quem? do cliente que está usando a classe
        

// solução1: modificar a modelagem e por o atributo PossuiDimensoesfisicas, apenas na subclasse ProdutoFisico e retira de Produto

// solução 2:
       //(p/ quando não pode alterar a modelagem (ex: quando tem banco de dados envolvido, ou é um projeto criado por outra pessoa)
       // FACTORY METHOD 
            // preciso que toda vez que for criado um produto fisico, seja setado automaticamente, se ele possui ou não dimensões
public class TesteProduto {
    public static void main(String[] args) {
        
        ProdutoFisico produtoFisico = new ProdutoFisico(); // criar um produto fisico
        produtoFisico.setPossuiDimensoesFisicas(true); // objeto criado tem dimensões fisicas?
        //setar = informar
        
        ProdutoDigital produtoDigital = new ProdutoDigital(); // criar um produto digital
        produtoDigital.setPossuiDimensoesFisicas(false);
        
    }
    
}
