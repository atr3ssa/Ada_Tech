// pacote
package chainofresponsibility.Problem;

import chainofresponsibility.Carro;
import chainofresponsibility.Marca;
import java.math.BigDecimal;


public class VendaCarroService {
    public BigDecimal calculaValorVenda(Carro carro) {
       BigDecimal valorVenda = carro.getPreco();
       
       if (Marca.FIAT.equals(carro.getMarca())){
         return valorVenda.substract(new BigDecimal(1000));  
       }
       
       if (Marca.FORD.equals(carro.getMarca())){
           return valorVenda.substract(new BigDecimal(2000));
       }
       
       if (carro.getPreco().compareTo(new BigDecimal(100000.00)) > 0){
           return valorVenda.substract(new BigDecimal(10000));
       }
    }
    
}
