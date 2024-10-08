// pacote
package prototype.solution;


import prototype.Botao;

public class TesteBotaoPrototype {
    
    public static void main(String[] args) {
        
        Botao botaoVermelho = BotaoRegistry.getBotao("BOTAO_VERMELHO");
        System.out.println(botaoVermelho);
        
        Botao botaoAzul = BotaoRegistry.getBotao("BOTAO_AZUL");
        System.out.println(botaoAzul);
    }

    
}
