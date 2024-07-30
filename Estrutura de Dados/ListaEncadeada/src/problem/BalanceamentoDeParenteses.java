
package problem;


import java.util.Set;
import java.util.Stack;


public class BalanceamentoDeParenteses {
    
    /* PROBLEMA: BALANCEAMENTO DE COLCHETES EM UMA EXPRESSÃO
            Escreva um programa para examinar se os pares e as ordem estçao corretos na expressão dada.
 
        - Classico;
        - Envolve pilhas;
    
        Solução: uo de pilhas
        1- Empilhar caracteres de abertura;
        2- Ao identificar caracter de fechamento:
            - desempilhar e verificar se coincide com abertura;
        3- Ao final a pilha deve estar vazia.
    
    Em um exame:
        Ou vão te fornecer a pilha, ou vc cria uma, ou utiliza os recursos da linguagem

*/
    
    // dada a expressão, eu quero saber se ela é valida ou não:
   public static boolean solve(String expression){ // expressão
       // Nesse exemplo, vou usar a pilha do JAVA:
       // Criar dois conjuntos:
       Set<Character> openSymbols = Set.of('(','{','['); // Caracter de abertura - Quando for character é aspas simples ' '
       Set<Character> closeSymbols = Set.of(')','}',']');// caracter de fechamento
       Stack<Character> stack = new Stack<>();   
       
       for(char c /* o que eu li (c)*/: expression.toCharArray()){// caracter de leitura em cima da minha e´pressão como um array de caracteres
           if(openSymbols.contains(c)) stack.push(c); // se for um caractere de abertura eu insiro na pilha
           if(closeSymbols.contains(c)){ // se for  um caracter de fechamento
           // saber se minha pilha está preenchida:
           if(stack.isEmpty()) return false; // se elea estiver vazia, vai retornar falso
           var open = stack.pop(); // senão, vou ler esse caracter de abertura, extrar da pilha
           if(open == '(' && c != ')') return false; // validar - se o open for igual a ( e o que que eu li (c), for diferente de um ) fechando, retorno falso
           if(open == '{' && c != '}') return false;
           if(open == '[' && c != ']') return false;
// ler o caractere, desempilhar
           }
       }
            return stack.isEmpty(); // se a pilha estiver vazia é valida, senão invalida
     } 
   
    public static void main(String[] args) {
        System.out.println(solve("2*(3+4+5*[2+3)]")); // pedindo para analisar essas expressões - ess é false
        System.out.println(solve("[2*(3+4+5*[2+3]/(2+(3+(7+5)*9)*6)*[5+8]+17)+2]")); // essa é true
    }
   
    
}
