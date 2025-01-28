// pacote
package chainofresponsibility.Solution;

import chainofresponsibility.Carro;
import java.math.BigDecimal;

public abstract class DescontoCarro { // classe não instanciada = abstract
    // não posso mais dar new nessa classe
    
    protected DescontoCarro proximoDesconto;// pode ser acessado apenas pelas classes filhas
    
    //constructor

    public DescontoCarro(DescontoCarro proximoDesconto) {
        this.proximoDesconto = proximoDesconto; // receber e setar
        
    }
    
    // método abstract
    
    public abstract BigDecimal aplicaDesconto(Carro carro);
    
    
    
    
}
