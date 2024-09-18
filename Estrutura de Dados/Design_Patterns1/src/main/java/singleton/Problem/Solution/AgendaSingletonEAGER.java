// pacote
package singleton.Problem.Solution;

import java.util.HashMap; // import hashMap
import java.util.Map; // Map


public class AgendaSingletonEAGER {
    // hashmap de String
    
    private Map<String, Boolean> diasDisponiveis = new HashMap<>(); // HashMap de String e boolean
    
    public AgendaSingletonEAGER(){ // Construtor
        
        // mostro os dias disponiveis
        diasDisponiveis.put("Domingo", Boolean.TRUE);
        diasDisponiveis.put("Segunda", Boolean.TRUE);
        diasDisponiveis.put("Terça", Boolean.TRUE);
        diasDisponiveis.put("Quarta", Boolean.TRUE);
        diasDisponiveis.put("Quinta", Boolean.TRUE);
        diasDisponiveis.put("Sexta", Boolean.TRUE);
        diasDisponiveis.put("Sabado", Boolean.TRUE);
        
        
    }
    public Map<String, Boolean> getDias() /*Método */{return diasDisponiveis;} // retorna todos os dias dísponiveis
    
    // caso, alguém chame p algo:
    public void ocupa(String dia){ // recebe uma String
        // Se eu receber ex: "Segunda", ele vai dizer que está falso (indisponível)
        
        diasDisponiveis.replace(dia, Boolean.FALSE);} // método ocupa
    
    // Continuar minuto: 02:30
}
