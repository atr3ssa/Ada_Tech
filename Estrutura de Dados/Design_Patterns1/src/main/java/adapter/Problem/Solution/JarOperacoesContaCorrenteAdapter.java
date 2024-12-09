// pacote
package adapter.Problem.Solution;

import adapter.Problem.JarOperacoesContaCorrente;
import java.math.BigDecimal;


public class JarOperacoesContaCorrenteAdapter {
    // fazer uma composição para simular o uso do jar
    
    private JarOperacoesContaCorrente jarConta;

    // constructor
    
    public JarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrente jarConta) {
        this.jarConta = jarConta;
    }

    JarOperacoesContaCorrenteAdapter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    // métodos (do seu Jar)
    
    public void saca(BigDecimal valorPretendido){ // sacar o valor da conta
       if (jarConta.validaSaldo(valorPretendido)){
           jarConta.saca(valorPretendido);
           System.out.println("Sacando...");
       }else{
           
           // usar excepction
           throw new IllegalArgumentException("Saldo Indisponível...");
       }
    }
    
    public void deposita(BigDecimal valor){ // depoistar o valor da conta
        jarConta.deposita(valor);
        System.out.println("Depositando...");
    }
    
}
