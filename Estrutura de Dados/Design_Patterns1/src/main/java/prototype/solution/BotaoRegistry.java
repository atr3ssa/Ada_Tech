// pacote
package prototype.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import prototype.Botao;
import prototype.TipoBordaEnum;

public class BotaoRegistry { // aplicar Singleton
    
    private static BotaoRegistry botaoRegistry;
    
    //criar um Map
    private static Map<String, Botao> REGISTRY = new HashMap<>(); // Map, o cara que vai registrar o nosso protótipo
    
    static {
        // criar os botões e inicializar:
        Botao botao_amarelo = new Botao();
            // atributos:
                botao_amarelo.setCor("amarelo");
                botao_amarelo.setLargura(100);
                botao_amarelo.setAltura(40);
                botao_amarelo.setTipoBorda(TipoBordaEnum.TRACEJADA);
                
        Botao botao_vermelho = new Botao();
        Botao botao_azul = new Botao();
            // atributos:
                botao_azul.setCor("azul");
                botao_azul.setLargura(35);
                botao_azul.setAltura(125);
                botao_azul.setTipoBorda(TipoBordaEnum.TRACEJADA);
        
        // add botões:
        REGISTRY.put("BOTAO_AMARELO", botao_amarelo);
        REGISTRY.put("BOTAO_VERMELHO", botao_vermelho);
        REGISTRY.put("BOTAO_AZUL", botao_azul);
    }//bloco estatico
    
    public static BotaoRegistry getInstance(){
      if(Objects.isNull(botaoRegistry))  {
          botaoRegistry = new BotaoRegistry();
          return botaoRegistry;
      }
      return botaoRegistry;
    }
    // A partir da inicialização da Classe:
    
}
