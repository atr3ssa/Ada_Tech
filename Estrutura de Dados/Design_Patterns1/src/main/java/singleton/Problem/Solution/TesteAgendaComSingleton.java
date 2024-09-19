// pacote
package singleton.Problem.Solution;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import singleton.Problem.*;


public class TesteAgendaComSingleton {
    
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        /*
        AgendaSingletonEAGER agenda1 = AgendaSingletonEAGER.getInstance();
        AgendaSingletonEAGER agenda2 = AgendaSingletonEAGER.getInstance();
        System.out.println(agenda1);
        System.out.println(agenda2);
        
        reservaDiaEAGER("Segunda");
        reservaDiaEAGER("Sabado");
        reservaDiaEAGER("Domingo"); 
        
        AgendaSingletonLAZY agenda1 = AgendaSingletonLAZY.getInstance();
        AgendaSingletonLAZY agenda2 = AgendaSingletonLAZY.getInstance();
        System.out.println(agenda1);
        System.out.println(agenda2);
        
        /*
        
        -  Código travesso que foi na classe e pegou o construtor declarado (privado e inacessivel), mas dei true e deixei ele acessível.
        -  Dei varios new instance e posso criar varas instancias. mesmo com ele privado e aparentemente PROTEGIDO. Quebramos o Singleton.
        -  É um puta perigo, ta quebrando a regra de um construtor
        -  Existe uma forma de impedir que aconteça = usando ENUM
        - O Enum, impede que o código de reflection venha atuar em cima do construtor
        
        // Reflection
        Constructor<AgendaSingletonLAZY> construtorTravesso = AgendaSingletonLAZY.class.getDeclaredConstructor();
        construtorTravesso.setAccessible(true);
        AgendaSingletonLAZY agendaTravessa1 = construtorTravesso.newInstance();
        AgendaSingletonLAZY agendaTravessa2 = construtorTravesso.newInstance();
        System.out.println(agendaTravessa1);
        System.out.println(agendaTravessa2);
        
        
        reservaDiaLAZY("Segunda");
        reservaDiaLAZY("Sabado");
        reservaDiaLAZY("Domingo");*/
        
        // Quando utilizar o Singleton, usar o ENUM, pos ele bloqueia o Reflection
        AgendaSingletonENUM agenda1 = AgendaSingletonENUM.getInstance();
        AgendaSingletonENUM agenda2 = AgendaSingletonENUM.getInstance();
        System.out.println(agenda1.hashCode());
        System.out.println(agenda2.hashCode());
        
        // Reflection
        Constructor<AgendaSingletonENUM> construtorTravesso = AgendaSingletonENUM.class.getDeclaredConstructor();
        construtorTravesso.setAccessible(true);
        AgendaSingletonENUM agendaTravessa1 = construtorTravesso.newInstance();
        AgendaSingletonENUM agendaTravessa2 = construtorTravesso.newInstance();
        System.out.println(agendaTravessa1);
        System.out.println(agendaTravessa2);
        
        
        reservaDiaENUM("Segunda");
        reservaDiaENUM("Sabado");
        reservaDiaENUM("Domingo");
        
        
        
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
     public static void reservaDiaENUM(String dia){ //passei dia como parametro
        AgendaSingletonENUM agenda = AgendaSingletonENUM.getInstance(); //criar uma agenda: (um objeto)
        // Alt + ENTER
        agenda.ocupa(dia);//reservar o dia
        System.out.println(agenda.getDias()); // imprimir minha agenda
        
    }
    
    
    // PROBLEMA: Sempre que eu chamo o método agenda, ele cria uma nova agenda. Logo, nõa consigo deixar masi de um dia ocupado na minha 
    // agenda, pois é sempre criado uma nova instância que herda as infos de agenda ( q traz todos os dias já como true);
    
    // SOLUÇÃO: Criar um Singleton, que será uma única instância na memória que apenas será atualizada com as informações;
    // SINGLETON: 3 formas: EAGER (O java já nicializa como objeto), LAZY , ENUM (Indicada e mais usada, pois bloqueia o Reflection

    
}
