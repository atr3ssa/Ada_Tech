// pacote
package adapter.Problem;

import java.math.BigDecimal;


public class JarOperacoesContaCorrente {
    // para simular um JAR
    
    public boolean validaSaldo(BigDecimal valorPretendidoSangue){
        System.out.println("validando o saldo...");
        return true;
    }
    
    public void saca(BigDecimal valorPretendido){
        System.out.println("Sacando...");
    }
    
}
