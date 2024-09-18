// pacote
package singleton.Problem;


public class TesteAgenda {
    
    //método p reservar dias
    public static void reservaDia(String data){ //passei data como parametro
        
        Agenda agenda = new Agenda(); //criar uma agenda: (um objeto)
        
        agenda.diasDisponiveis();//reservar o dia
        
    }
    
}
