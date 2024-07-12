
package boolean_aula;


public class Booleano {
    public static void main(String[] args) {
        //Declarando uma variável boolean
        boolean resultado = false;
        //operadores lógicos 
       
        //(algoritmo para ir a praia)
        boolean fimDeSemana = false;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        //mostrar resultado
        //atalho sout
        
        // Tabela verdade:
        // Operador && (AND)
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false
        
        // Operador ||(OR) 
        // true && true = true
        // true && false = true
        // false && true = true
        // false && false = false
        
        // Operador ||(NOT) 
        // true && true = false
        // true && false = false
        // false && true = false
        // false && false = true
        
        System.out.println(vamosAPraia);
        
        //Operador Alternario (3 termos)
        // termo sendo avaliado (?), valor caso seja verdadeiro, valor caso seja falso
        String mensagem = fimDeSemana ? "É fim de semana!" : "não é fim de semana!";
        System.out.println(mensagem);
    }
    
}
