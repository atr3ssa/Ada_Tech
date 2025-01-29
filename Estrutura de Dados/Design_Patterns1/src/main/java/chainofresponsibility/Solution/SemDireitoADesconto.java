// pacote
package chainofresponsibility.Solution;

import chainofresponsibility.Carro;
import chainofresponsibility.Marca;
import java.math.BigDecimal;


public class SemDireitoADesconto extends DescontoCarro {

    public SemDireitoADesconto(DescontoCarro proximoDesconto) {
        super(proximoDesconto); // chamar o constructor da classe pai
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        return BigDecimal.ZERO;
    }
    
}
