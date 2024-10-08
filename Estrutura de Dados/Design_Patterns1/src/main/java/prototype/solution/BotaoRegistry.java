// pacote
package prototype.solution;

import java.util.Objects;

public class BotaoRegistry { // aplicar Singleton
    
    private static BotaoRegistry botaoRegistry;
    
    public static BotaoRegistry getInstance(){
      if(Objects.isNull(botaoRegistry))  {
          botaoRegistry = new BotaoRegistry();
          return botaoRegistry;
      }
      return botaoRegistry;
    }
    
}
