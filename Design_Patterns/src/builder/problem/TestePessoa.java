//pacote
package builder.problem;

// Creational

import builder.problem.Solution.Pessoa;

public class TestePessoa {
    public static void main(String[] args) { // método main
        // como estou usando um constructor de classe, preciso passar os valores
        Pessoa pessoa = new Pessoa("Andressa",
                "Rabêlo",
                "823213904",
                "andressa.rabelo@ada.com.br",
                "Dessa", 
                "06/03/2001"); 
        
        System.out.println(pessoa); // imprimir pessoa
                
    }
  
    
    
    
    
    
    
    
    
    
}
