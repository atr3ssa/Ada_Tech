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
        Botao botao_amarelo = new Botao();
            // atributos:
                botao_amarelo.setCor("amarelo");
                botao_amarelo.setLargura(100);
                botao_amarelo.setAltura(40);
                botao_amarelo.setTipoBorda(TipoBordaEnum.TRACEJADA);
                
        Botao botao_vermelho = new Botao();
            // atributos:
                botao_vermelho.setCor("Vermelho");
                botao_vermelho.setAltura(30);
                botao_vermelho.setLargura(160);
                botao_vermelho.setTipoBorda(TipoBordaEnum.FINA);
                
        Botao botao_azul = new Botao();
            // atributos:
                botao_azul.setCor("azul");
                botao_azul.setLargura(35);
                botao_azul.setAltura(125);
                botao_azul.setTipoBorda(TipoBordaEnum.TRACEJADA);
        
        /* add botões (Registrador de botões):
                Se eu passar uma chave (ex: do botão amarelo) o registrador vai devolver uma instância ( do botão amarelo)
                
                */
        
        REGISTRY.put("BOTAO_AMARELO", botao_amarelo);
        REGISTRY.put("BOTAO_VERMELHO", botao_vermelho);
        REGISTRY.put("BOTAO_AZUL", botao_azul);
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
