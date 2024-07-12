//pacote
package implementation;

public class SupermarketArray implements Supermarket{
    //dados utilizados pela classe:
    private final String [] itens; // vetor
    
    private int LastIndex; // ponteiro
    
    //inicializar vetor com o construtor:
    public SupermarketArray(int SIZE) {
        itens = new String[SIZE];
        LastIndex = -1; //indicar o último elemento inserido // -1 pq não há último elemento  
    }

    //assinatura dos métodos:
    @Override
    public void add(String item) {
        if(LastIndex == itens.length-1){ // validação (se o ponteiro(LastIndex) for igual ao último espaço da lista (itens.lengyh-1), mostre que a lista está cheia
            System.err.println("Lista de Supermercado cheia"); // utilizei o err, ao invés do out, só para aparecer em vermelho
        } else { // do contrário
            LastIndex ++; // add mais um
            itens[LastIndex] = item; //guardar no objeto item
        }
    }

    @Override
    public void print() {
        System.out.println("###################################################");
            if(LastIndex < 0){
                System.out.println("Lista Vazia");  
            }
            for(int i = 0; i <= LastIndex; i++){ // laço for ( ponteiro(i) = 0; enquanto i for menor ou igual a LastIndex; acrescente +1
                System.out.println(i + " - " + itens[i]);
            }
            
        System.out.println("###################################################");
       
    }

    @Override
    public void delete(int index) {
        if(index >= 0 && index <= LastIndex){
          shift(index);
          LastIndex--;
        } else {
            System.err.println("Índice Inválido " + index);
        }
    }

    private void shift(int index) {
        for(int i = index; i < LastIndex; i++){
          itens[i] = itens[i+1];  
        }
    }
    
    
}
