// pacote
package adapter.Problem.Solution;

import adapter.Problem.JarOperacoesContaCorrente;
import java.math.BigDecimal;


public class ClientJarOperacoesContaCorrenteAdapter {
    private JarOperacoesContaCorrenteAdapter jarContaAdapter;
    
    public ClientJarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrenteAdapter jarContaadapter){
        this.jarContaAdapter=jarContaAdapter; // constructor (está recebendo o jar)
    }
    
    
    // realizar as operações:
   
    public void saca(BigDecimal valorPretendido){
        jarContaAdapter.saca(valorPretendido);// sacar, a partir do jar
    }
    
    public void deposita(BigDecimal valor){
        jarContaAdapter.deposita(valor); // depositar, a partir do jar
    }
}
