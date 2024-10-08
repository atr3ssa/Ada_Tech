// pacote
package prototype.solution;


import prototype.Botao;
import prototype.TipoBordaEnum;

public class TesteBotaoPrototype {
    
    public static void main(String[] args) {
        
        Botao botaoVermelho = BotaoRegistry.getBotao("BOTAO_VERMELHO");
        System.out.println(botaoVermelho);
        
        Botao botaoAzul = BotaoRegistry.getBotao("BOTAO_AZUL");
        System.out.println(botaoAzul);
        
         Botao botaoAmarelo = BotaoRegistry.getBotao("BOTAO_AMARELO");
        System.out.println(botaoAmarelo);
        
        
        String chave = "BOTAO_PRETO";
        Botao botaoPreto = new Botao();
                botaoPreto.setCor("preto");
                botaoPreto.setLargura(35);
                botaoPreto.setAltura(125);
                botaoPreto.setTipoBorda(TipoBordaEnum.TRACEJADA);
                
        BotaoRegistry.addRegistry(chave, botaoPreto);
        
        Botao botaoPretoClone = BotaoRegistry.getBotao("BOTAO_PRETO");
        System.out.println(botaoPretoClone);
    }

    
}
