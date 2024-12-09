// pacote
package adapter.Problem;

import java.math.BigDecimal;

// imagina que vc faz parte de uma parte de financero do banco
public class JarOperacoesContaCorrente {
    // para simular um JAR
    
    // métodos (do seu Jar)
    public boolean validaSaldo(BigDecimal valorPretendidoSangue){ // validar o saldo
        System.out.println("validando o saldo...");
        return true;
    }
    
    public void saca(BigDecimal valorPretendido){ // sacar o valor da conta
        System.out.println("Sacando...");
    }
    
    public void deposita(BigDecimal valor){ // depoistar o valor da conta
        System.out.println("Depositando...");
    }
    
}
