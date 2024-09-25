// pacote
package prototype.Problem;

import prototype.Botao;
import prototype.TipoBordaEnum;


public class BotaoVermelho extends Botao {
    
    public BotaoVermelho(){
        
     setCor("Vermelho");
     setAltura(30);
     setLargura(160);
     setTipoBorda(TipoBordaEnum.FINA);
       
    }
    
}
