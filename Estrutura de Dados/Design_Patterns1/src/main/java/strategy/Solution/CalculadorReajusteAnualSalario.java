// pacote
package strategy.Solution;

import strategy.Funcionario;


public interface CalculadorReajusteAnualSalario { // ganhamos polimorfismo aqui
    // definir calculadores
    
    void calcularReajusteAnual(Funcionario funcionario);
    
}

// vantagem: se amanhã surgr um novo calculo, n preciso alterar nada (por if a mais), só preciso criar um cra novo e implementar

// estudar sobre solid (principio o)

