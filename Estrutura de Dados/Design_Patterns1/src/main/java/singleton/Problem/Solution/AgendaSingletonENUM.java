// pacote
package singleton.Problem.Solution;

import java.util.HashMap; // import hashMap
import java.util.Map; // Map
import java.util.Objects;


public enum AgendaSingletonENUM {
    // hashmap de String
    
    Instance; // atributo do ENUM
  
    
    private Map<String, Boolean> diasDisponiveis = new HashMap<>(); // HashMap de String e boolean
    
    private AgendaSingletonENUM(){ // Construtor privado p proteger o código. Pos quero que tenha só uma instancia e com ele  público
        // eu ainda consigo criar novas instancias, por isso, deixar privado
        
        // mostro os dias disponiveis
        diasDisponiveis.put("Domingo", Boolean.TRUE);
        diasDisponiveis.put("Segunda", Boolean.TRUE);
        diasDisponiveis.put("Terça", Boolean.TRUE);
        diasDisponiveis.put("Quarta", Boolean.TRUE);
        diasDisponiveis.put("Quinta", Boolean.TRUE);
        diasDisponiveis.put("Sexta", Boolean.TRUE);
        diasDisponiveis.put("Sabado", Boolean.TRUE);
        
        
    }
    
    //P/ obter a instancia, criar método:
    public static AgendaSingletonENUM getInstance(){
        
        return Instance;
    }
    
    public Map<String, Boolean> getDias() /*Método */{return diasDisponiveis;} // retorna todos os dias dísponiveis
    
    // caso, alguém chame p algo:
    public void ocupa(String dia){ // recebe uma String
        // Se eu receber ex: "Segunda", ele vai dizer que está falso (indisponível)
        
        diasDisponiveis.replace(dia, Boolean.FALSE);} // método ocupa
    
   
}
