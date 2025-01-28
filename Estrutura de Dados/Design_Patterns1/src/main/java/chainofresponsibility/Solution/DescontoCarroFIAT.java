// pacote
package chainofresponsibility.Solution;

import chainofresponsibility.Carro;
import chainofresponsibility.Marca;
import java.math.BigDecimal;


public class DescontoCarroFIAT extends DescontoCarro {

    public DescontoCarroFIAT(DescontoCarro proximoDesconto) {
        super(proximoDesconto); // chamar o constructor da classe pai
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        
        if (Marca.FIAT.equals(carro.getMarca())){ // se o carro for da fiar, ganha um desconto de 1000
         return valorVenda.subtract(new BigDecimal(1000)); // através do método subtract (subtrair) 
       }
        return proximoDesconto.aplicaDesconto(carro);
    }
    
}
