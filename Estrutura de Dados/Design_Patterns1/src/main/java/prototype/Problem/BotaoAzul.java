// pacote
package prototype.Problem;

import prototype.Botao;
import prototype.TipoBordaEnum;


public class BotaoAzul extends Botao {
    
    public BotaoAzul(){
        setCor("azul");
        setLargura(35);
        setAltura(125);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }
    
}
