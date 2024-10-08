//pacote
package prototype.solution;

import prototype.Botao;


class BotaoFactory {

    static void getInstance(Botao prototipo) {
        
        Botao botao - new Botao();
            botao.setCor(prototipo.getCor());
            botao.setLargura(prototipo.getLargura());
            botao.setAltura(prototipo.getAltura());
            botao.setTipoBorda(prototipo.getTipoBorda());
            
            botao;
        
    }
    
}
