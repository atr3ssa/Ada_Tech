// pacote
package singleton.Problem.Solution;

import singleton.Problem.*;


public class TesteAgendaComSingleton {
    
    public static void main(String[] args) {
        /*
        AgendaSingletonEAGER agenda1 = AgendaSingletonEAGER.getInstance();
        AgendaSingletonEAGER agenda2 = AgendaSingletonEAGER.getInstance();
        
        reservaDiaEAGER("Segunda");
        reservaDiaEAGER("Sabado");
        reservaDiaEAGER("Domingo"); */
        
        AgendaSingletonLAZY agenda1 = AgendaSingletonLAZY.getInstance();
        AgendaSingletonLAZY agenda2 = AgendaSingletonLAZY.getInstance();
        
        reservaDiaLAZY("Segunda");
        reservaDiaLAZY("Sabado");
        reservaDiaLAZY("Domingo");
        
        
    }
    
    //método p reservar dias
    public static void reservaDiaEAGER(String dia){ //passei dia como parametro
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance(); //criar uma agenda: (um objeto)
        // Alt + ENTER
        agenda.ocupa(dia);//reservar o dia
        System.out.println(agenda.getDias()); // imprimir minha agenda
        
    }
    public static void reservaDiaLAZY(String dia){ //passei dia como parametro
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance(); //criar uma agenda: (um objeto)
        // Alt + ENTER
        agenda.ocupa(dia);//reservar o dia
        System.out.println(agenda.getDias()); // imprimir minha agenda
        
    }
    
    
    // PROBLEMA: Sempre que eu chamo o método agenda, ele cria uma nova agenda. Logo, nõa consigo deixar masi de um dia ocupado na minha 
    // agenda, pois é sempre criado uma nova instância que herda as infos de agenda ( q traz todos os dias já como true);
    
    // SOLUÇÃO: Criar um Singleton, que será uma única instância na memória que apenas será atualizada com as informações;
    // SINGLETON: 3 formas: EAGER (O java já nicializa como objeto), LAZY 

    
}
