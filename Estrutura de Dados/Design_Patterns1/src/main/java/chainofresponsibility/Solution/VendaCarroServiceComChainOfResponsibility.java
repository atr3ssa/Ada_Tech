// pacote
package chainofresponsibility.Solution; // cadeia de responsabilidade = criar classes e cada uma terá uma tarefa

import chainofresponsibility.Problem.*;
import chainofresponsibility.Carro;
import chainofresponsibility.Marca;
import java.math.BigDecimal;



public class VendaCarroServiceComChainOfResponsibility { // calcula o valor da venda - aplicar descontos
    public BigDecimal calculaValorVenda(Carro carro) {
        DescontoCarro desconto = new DescontoCarroFIAT(
                new DescontoCarroFORD(
                        new DescontoCarroCHEVROLET(
                                new DescontoCarroValorMaiorQueCemMil(
                                        new SemDireitoADesconto(null)
                                ))));
               
        return desconto.aplicaDesconto(carro);
    }
    
}
