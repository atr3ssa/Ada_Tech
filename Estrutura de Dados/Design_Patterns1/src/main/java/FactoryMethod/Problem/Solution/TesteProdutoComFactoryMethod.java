// pacote
package FactoryMethod.Problem.Solution;

import FactoryMethod.Problem.Produto;
import FactoryMethod.Problem.TipoDeProdutoEnum;
import java.util.Calendar;


public class TesteProdutoComFactoryMethod {
    public static void main(String[] args) {
        Produto produtoDigital = ProdutoFactory.getInstance(TipoDeProdutoEnum.DIGITAL);
        
        Produto produtoFisico = ProdutoFactory.getInstance(TipoDeProdutoEnum.FISICO);
        
        System.out.println(produtoDigital);
        System.out.println(produtoFisico);
        
        // Classe exemplo de Factorymethod:
        Calendar instance = Calendar.getInstance(); // alt + enter // instância de Calendar
    }
    
    // VANTAGEM: Rstamos virtualizando um constructor, usando o getInstance (q retorna uma instância)
        // se eu quiser por mais um produto, é só add no enum, depois no switchcase
        // Passei a responsabilidade para a factory, ao invés do cliente, afinal ele não tem que se preocupar com configurações (+ flexibilidade)
        // Encapsulei minhas regras de negócio
}
