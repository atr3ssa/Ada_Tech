// pacote
package chainofresponsibility.Solution;

import chainofresponsibility.Carro;
import java.math.BigDecimal;


public class DescontoCarroValorMaiorQueCemMil extends DescontoCarro {

    public DescontoCarroValorMaiorQueCemMil(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        
        if (carro.getPreco().compareTo(new BigDecimal(100000.00)) > 0){ // se o preço de venda maior que 100.000, ganha um desconto de 10.000
           return valorVenda.subtract(new BigDecimal(10000)); // compare to: comparar
       }
         return proximoDesconto.aplicaDesconto(carro);
    }
    
}
