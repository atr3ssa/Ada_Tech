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
    
    static {//bloco estatico
        
        // criar os botões e inicializar:
        Botao botaoAmarelo = new Botao();
            // atributos:
                botaoAmarelo.setCor("Amarelo");
                botaoAmarelo.setLargura(100);
                botaoAmarelo.setAltura(40);
                botaoAmarelo.setTipoBorda(TipoBordaEnum.TRACEJADA);
                
        Botao botaoVermelho = new Botao();
            // atributos:
                botaoVermelho.setCor("Vermelho");
                botaoVermelho.setAltura(30);
                botaoVermelho.setLargura(160);
                botaoVermelho.setTipoBorda(TipoBordaEnum.FINA);
                
        Botao botaoAzul = new Botao();
            // atributos:
                botaoAzul.setCor("Azul");
                botaoAzul.setLargura(35);
                botaoAzul.setAltura(125);
                botaoAzul.setTipoBorda(TipoBordaEnum.TRACEJADA);
        
        /* add botões (Registrador de botões):
                Se eu passar uma chave (ex: do botão amarelo) o registrador vai devolver uma instância ( do botão amarelo)
                
                */
        
        REGISTRY.put("BOTAO_AMARELO", botaoAmarelo);
        REGISTRY.put("BOTAO_VERMELHO", botaoVermelho);
        REGISTRY.put("BOTAO_AZUL", botaoAzul);
    }
    
    public static BotaoRegistry getInstance(){ // método getInstance p pegar uma instância do meu botão Registry
      if(Objects.isNull(botaoRegistry))  {
          botaoRegistry = new BotaoRegistry();
          return botaoRegistry;
      }
      return botaoRegistry;
    }
    // A partir da inicialização da Classe:
    
    //método para pegar o botão (getBotão):
    public static Botao getBotao(String chave){//passa a chave p gente, lá no REGISTRY eu vou pegar o prototipo que eu quero e passar p a minha factory getInstance
        
        return BotaoFactory.getInstance(REGISTRY.get(chave)); // retorna
    }
    
}
