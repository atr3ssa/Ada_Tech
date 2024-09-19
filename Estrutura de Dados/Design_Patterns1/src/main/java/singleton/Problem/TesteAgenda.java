// pacote
package singleton.Problem;


public class TesteAgenda {
    
    public static void main(String[] args) {
        reservaDia("Segunda");
        reservaDia("Sabado");
        reservaDia("Domingo");
    }
    
    //método p reservar dias
    public static void reservaDia(String dia){ //passei dia como parametro
        
        Agenda agenda = new Agenda(); //criar uma agenda: (um objeto)
        
        agenda.ocupa(dia);//reservar o dia
        System.out.println(agenda.getDias()); // imprimir minha agenda
        
    }
    
    // PROBLEMA: Sempre que eu chamo o método agenda, ele cria uma nova agenda. Logo, nõa consigo deixar masi de um dia ocupado na minha 
    // agenda, pois é sempre criado uma nova instância que herda as infos de agenda ( q traz todos os dias já como true);
    
    // SOLUÇÃO: Criar um Singleton, que será uma única instância na memória que apenas será atualizada com as informações;
    // SINGLETON: 3 formas: EAGER,LAZY
     

    
}
