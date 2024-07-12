
package boolean_aula;


public class Funcoes {
    //método = função de partida
    public static void main(String[] args) {//escopo
        //farei o mesmo, mas dentro de uma função
        //String nome = "Andressa";
        //System.out.println("Hello " + nome);
        
        //Função sem retorno
        String nomeOriginal = "let's Code!";
        //chamar a função/método AQUI, dentro do main. Com o paramentro dentro dos ()
        
        //escopo de função
        saudacao(nomeOriginal);
        
        //Função com retorno
        int resultado = soma(2,3);
        System.out.println(resultado);
    }
    //As variaveis de escopos diferentes não tem nenhuma relação, desse modo  o nome tem obrigação de ser igual, apenas dentro do mesmo escopo
    //funcao/método Saudacao
    //saudacao(passagem de parametros)
    //Sem retorno
    public static void saudacao(String nomeParametro) {//escopo
        System.out.println("Hello " + nomeParametro);
    }
    
    //função com retorno
    public static int soma(int a, int b) {
        //p retornar a soma p a variavel resultado lá no main
        return a+b;
        
    }
}
