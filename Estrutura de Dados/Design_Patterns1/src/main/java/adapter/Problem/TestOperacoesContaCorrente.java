// pacote
package adapter.Problem;

import java.math.BigDecimal;


public class TestOperacoesContaCorrente {
    
    public static void main(String[] args) {// teste 
        
        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente(); // Variável local
        ClientJarOperacoesContaCorrente client = new ClientJarOperacoesContaCorrente(jarConta /* alt + enter */); // criar um client
        
        
       // realizar operações:
       BigDecimal valorPretendidoParaSaque = new BigDecimal(); // quando trabalhar com moedas, melhor usar o Bigdecimal
       client.validaSaldo(valorPretendidoParaSaque); // validar saldo
       
        
        
        
    }
    
    
    
    
    
}
