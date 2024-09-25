// pacote
package prototype.Problem;

import prototype.Botao;
import prototype.TipoBordaEnum;


public class BotaoAmarelo extends Botao {
    
      public BotaoAmarelo(){
        setCor("amarelo");
        setLargura(100);
        setAltura(40);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }
}
