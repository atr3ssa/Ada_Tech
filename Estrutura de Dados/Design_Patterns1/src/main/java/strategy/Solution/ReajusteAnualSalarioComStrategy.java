// pacote
package strategy.Solution;


import strategy.Funcionario;



public class ReajusteAnualSalarioComStrategy {
     public void calculaReajusteAnualSalario(Funcionario funcionario, CalculadorReajusteAnualSalario calculador){
         calculador.calcularReajusteAnual(funcionario);
        
    }
    
}
