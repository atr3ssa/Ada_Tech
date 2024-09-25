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
      // PROBLEMA: sempre que um usuario quiser um botao, vai ter que criar uma subclasse e isso é meio inviavel. Sempre que algo ocorrer na classe
      // pai, automaticamente todas as subclasses vão herdar o problema
      
      // SOLUÇÃO: Prototype (clonar)
      
      // min 07:20
}
