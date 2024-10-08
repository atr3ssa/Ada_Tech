// pacote
package prototype.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import prototype.Botao;

public class BotaoRegistry { // aplicar Singleton
    
    private static BotaoRegistry botaoRegistry;
    
    //criar um Map
    private static Map<String, Botao> REGISTRY = new HashMap<>(); // Map, o cara que vai registrar o nosso protótipo
    
    static {
        // criar os botões e inicializar:
        Botao botao_amarelo = new Botao();
        Botao botao_vermelho = new Botao();
        Botao botao_azul = new Botao();
        
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
