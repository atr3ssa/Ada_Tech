// pacote
package FactoryMethod.Problem.Solution;

import FactoryMethod.Problem.Produto;
import FactoryMethod.Problem.ProdutoDigital;
import FactoryMethod.Problem.ProdutoFisico;
import FactoryMethod.Problem.TipoDeProdutoEnum;




public class ProdutoFactory {
    
    public static Produto getInstance(TipoDeProdutoEnum tipoDeProdutoEnum){ // recebo como parametro
        
        switch(tipoDeProdutoEnum){ // Usando o Switchcase - Caso o tipo de produto seja
           
            case FISICO: // fisico
                ProdutoFisico produtoFisico = new ProdutoFisico(); // criar o produto
                produtoFisico.setPossuiDimensoesFisicas(true); // informar que ele terá dimensões fisicas
                return produtoFisico; // retornar o produto
                
            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital(); // criar o produto
                produtoDigital.setPossuiDimensoesFisicas(false); // informar que ele terá dimensões fisicas
                return produtoDigital; // retornar o produto
                
            default:
                
                
        }
                
                
        
    
}
    
}
