// pacote
package adapter.Problem;

import java.math.BigDecimal;

// biblioteca fechada que não podemos mexer nela
// esse client vai usar o Jar
public class ClientJarOperacoesContaCorrente { 
    
    private JarOperacoesContaCorrente jocc;
    
    public ClientJarOperacoesContaCorrente(JarOperacoesContaCorrente jocc){
        this.jocc=jocc; // constructor (está recebendo o jar)
    }
    
    
    // realizar as operações:
    
    public boolean validaSaldo(BigDecimal valorPretendidoSaque){
        return jocc.validaSaldo(valorPretendidoSaque); // validar, a partir do jar
    }
    
    public void saca(BigDecimal valorPretendido){
        jocc.saca(valorPretendido);// sacar, a partir do jar
    }
    
    public void deposita(BigDecimal valor){
        jocc.deposita(valor); // depositar, a partir do jar
    }
}
