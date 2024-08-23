// pacote
package FactoryMethod.Problem.Solution;

import FactoryMethod.Problem.Produto;
import FactoryMethod.Problem.TipoDeProdutoEnum;


public class TesteProdutoComFactoryMethod {
    public static void main(String[] args) {
        Produto produtoDigital = ProdutoFactory.getInstance(TipoDeProdutoEnum.DIGITAL);
        
        Produto produtoFisico = ProdutoFactory.getInstance(TipoDeProdutoEnum.FISICO);
        
        System.out.println(produtoDigital);
        System.out.println(produtoFisico);
    }
    
}
