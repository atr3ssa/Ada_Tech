//pacote
package builder.problem;

// CREATIONAL   
// problema a ser solucionado: Estou preso a ordem em que o constructor foi criada, Eu não sei se é nome, sobrenome... Pos não aparece p mim
// preciso ficar indo ver o constructor p ver quais são, isso pq é apenas uma pessoa, pois se fossem várias, o código ficaria com informações bagunçadas

// Nessa situação, entra o buider
    // p legebilidade de código e flexibilidade na construção de um objeto

import builder.problem.Solution.Pessoa;
import java.time.LocalDate;

public class TestePessoa {
    public static void main(String[] args) { // método main
        // como estou usando um constructor de classe, preciso passar os valores
        
        Pessoa pessoa = new Pessoa("Andressa", //nome
                "Rabêlo", // sobrenome
                "823213904", // documento
                "andressa.rabelo@ada.com.br", // email
                "Dessa", // apelido
                LocalDate.of(2001,03,06)); // dataNascimento
        
        System.out.println(pessoa); // imprimir pessoa
                
    }
  
    
    
    
    
    
    
    
    
    
}
