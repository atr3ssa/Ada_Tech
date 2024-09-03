// pacote
package singleton.Problem;

import java.util.HashMap; // import hashMap
import java.util.Map; // Map


public class Agenda {
    // hashmap de String
    
    private Map<String, Boolean> diasDisponiveis = new HashMap<>(); // HashMap de String e boolean
    
    public Agenda(){ // Construtor
        
        // mostro os dias disponiveis
        diasDisponiveis.put("Domingo", Boolean.TRUE);
        
    }
    public Map<String, Boolean> diasDisponiveis(){return diasDisponiveis;}
    
    public void ocupa(String dia){ diasDisponiveis.replace(dia, Boolean.FALSE);}
}
