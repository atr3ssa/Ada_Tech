// pacote
package strategy.Solution;

import strategy.Problem.*;
import java.math.BigDecimal;
import strategy.Funcionario;
import strategy.TipoContratacaoEnum;


public class TesteAjusteSalarioComStrategy {
    public static void main(String[] args) {
        
        ReajusteAnualSalarioComStrategy reajusteAnualSalario = new ReajusteAnualSalarioComStrategy();
        Funcionario funcionarioCLT = new Funcionario();
        funcionarioCLT.setNome("Victor");
        funcionarioCLT.setTipoContratacao(TipoContratacaoEnum.CLT);
        funcionarioCLT.setSalario(new BigDecimal(5000));
        
        Funcionario funcionarioPJ = new Funcionario();
        funcionarioPJ.setNome("Podowski");
        funcionarioPJ.setTipoContratacao(TipoContratacaoEnum.PJ);
        funcionarioPJ.setSalario(new BigDecimal(10000));
        
        Funcionario funcionarioEstagio = new Funcionario();
        funcionarioEstagio.setNome("Osvaldo");
        funcionarioEstagio.setTipoContratacao(TipoContratacaoEnum.ESTAGIO);
        funcionarioEstagio.setSalario(new BigDecimal(2000));
        
        //Calcular nossos reajustes aqui
        reajusteAnualSalario.calculaReajusteAnualSalario(funcionarioCLT, new CalculadorReajusteSalarioCLT());
        reajusteAnualSalario.calculaReajusteAnualSalario(funcionarioPJ, new CalculadorReajusteSalarioPJ());
        reajusteAnualSalario.calculaReajusteAnualSalario(funcionarioEstagio, new CalculadorReajusteSalarioESTAGIO());
        
        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
        System.out.println(funcionarioEstagio);
                
                
                
        
    }
    
}
