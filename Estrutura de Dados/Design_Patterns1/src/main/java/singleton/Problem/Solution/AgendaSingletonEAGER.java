// pacote
package singleton.Problem.Solution;

import java.util.HashMap; // import hashMap
import java.util.Map; // Map

/*
EAGER:
    - Carrega a classe com a instancia junto
    - Mesmo que eu n utilize a instancia ele ainda vai instanciar, ela estará lá. Ocupa memória mesmo sem precisar

*/


public class AgendaSingletonEAGER {
    // hashmap de String
    
    // Criar um atributo com o mesmo nome da classe (estatico e final)
    
    private static  final AgendaSingletonEAGER Instance = new AgendaSingletonEAGER();/* 
    
    static = significa que terá só uma instância / uma única
    final = n vai poder ser modificado e por ser final, logo na criação, tem que dar um = new Agenda...();*/
    
    private Map<String, Boolean> diasDisponiveis = new HashMap<>(); // HashMap de String e boolean
    
    private AgendaSingletonEAGER(){ // // Construtor privado p proteger o código. Pos quero que tenha só uma instancia e com ele  público
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
    
    //P/ obter a instancia (AgendaSingletonEAGER), criar método:
    public static AgendaSingletonEAGER getInstance(){
        return Instance; //retornar nstancia
    }
    
    public Map<String, Boolean> getDias() /*Método */{return diasDisponiveis;} // retorna todos os dias dísponiveis
    
    // caso, alguém chame p algo:
    public void ocupa(String dia){ // recebe uma String
        // Se eu receber ex: "Segunda", ele vai dizer que está falso (indisponível)
        
        diasDisponiveis.replace(dia, Boolean.FALSE);} // método ocupa
    
    // Continuar minuto: 02:30
}
