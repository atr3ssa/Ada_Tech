// pacote
package strategy.Problem;

import strategy.Funcionario;
import strategy.TipoContratacaoEnum;


public class ReajusteAnualSalario {
    
    public void calculaReajusteAnual(Funcionario funcionario){
        
    }
        if(TipoContratacaoEnum.CLT.name().equals(funcionario.getTipoContratacao().name())){ // equals = p ver se é igual
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(BigDecimal(0.10)))); // multiply = faz a multiplicação do salario por 10% 
            //se for CLT, pego o salario desse funcionário e add 10%
         
        } else if (TipoContratacaoEnum.PJ.equals(funcionario.getTipoContratacao())){
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(BigDecimal(0.05))));
        
        }else if (TipoContratacaoEnum.ESTAGIO.equals(funcionario.getTipoContratacao())){
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(BigDecimal(0.02))));
    }
    
}
