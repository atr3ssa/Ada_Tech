// pacote
package strategy.Solution;

import java.math.BigDecimal;
import strategy.Funcionario;


public class CalculadorReajusteSalarioPJ implements CalculadorReajusteAnualSalario{

    @Override
    public void calcularReajusteAnual(Funcionario funcionario) { // mplementar um método
        //ESTRATÉGIA DO CLT FICARÁ AQUI DENTRO
        
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.10)))); // multiply = faz a multiplicação do salario por 10% 
            //se for CLT, pego o salario desse funcionário e add 10%
    }
            
}
