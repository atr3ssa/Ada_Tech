// pacote
package chainofresponsibility.Problem; // cadeia de responsabilidade = criar classes e cada uma terá uma tarefa

import chainofresponsibility.Carro;
import chainofresponsibility.Marca;
import java.math.BigDecimal;



public class VendaCarroService { // calcula o valor da venda - aplicar descontos
    public BigDecimal calculaValorVenda(Carro carro) {
       BigDecimal valorVenda = carro.getPreco(); // pega o valor da venda
       
       // BigDecimal (método)
       
       if (Marca.FIAT.equals(carro.getMarca())){ // se o carro for da fiar, ganha um desconto de 1000
         return valorVenda.subtract(new BigDecimal(1000)); // através do método subtract (subtrair) 
       }
       
       if (Marca.FORD.equals(carro.getMarca())){
           return valorVenda.subtract(new BigDecimal(2000));
       }
       
       if (carro.getPreco().compareTo(new BigDecimal(100000.00)) > 0){ // se o preço de venda maior que 100.000, ganha um desconto de 10.000
           return valorVenda.subtract(new BigDecimal(10000)); // compare to: comparar
       }
        return valorVenda;
    }
    
}
