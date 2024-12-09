// pacote
package adapter.Problem.Solution;

import adapter.Problem.JarOperacoesContaCorrente;
import java.math.BigDecimal;


public class TestOperacoesContaCorrenteAdapter {
    public static void main(String[] args) {// teste 
        
        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        JarOperacoesContaCorrenteAdapter jarContaAdapter = new JarOperacoesContaCorrenteAdapter(); // Variável local
        ClientJarOperacoesContaCorrenteAdapter client = new ClientJarOperacoesContaCorrenteAdapter(jarConta); // criar um client
        
        
       // realizar operações:
       BigDecimal valorPretendidoParaSaque = new BigDecimal(1000 /* valor para sacar */); // quando trabalhar com moedas, melhor usar o Bigdecimal
       
       
       client.saca(valorPretendidoParaSaque); // sacar o valor pretendido      
       client.deposita(new BigDecimal(500));
        
        
    }
}
