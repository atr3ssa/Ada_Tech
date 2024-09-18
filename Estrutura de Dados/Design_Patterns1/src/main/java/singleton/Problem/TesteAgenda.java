// pacote
package singleton.Problem;


public class TesteAgenda {
    
    public static void main(String[] args) {
        reservaDia("Segunda");
    }
    
    //método p reservar dias
    public static void reservaDia(String dia){ //passei dia como parametro
        
        Agenda agenda = new Agenda(); //criar uma agenda: (um objeto)
        
        agenda.ocupa(dia);//reservar o dia
        System.out.println(agenda.getDias()); // imprimir minha agenda
        
    }
    
}
