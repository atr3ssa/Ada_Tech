// pacote
package builder.problem.Solution;

import java.time.LocalDate;


public class TestePessoaComBuilder {
    public static void main(String[] args) { // atalho main
        Pessoa pessoa = // mudei para Pessoa pessoa ( criar pessoa)
                new PessoaBuilder()
                // Comecei a chamar os métodos
                // Consigo chamar um objeto depois do outro, pois como ele retorna o próprio objeto (PessoaBuilder)
                // Então, eu chamo e ele retorna, pula p o outro, chama e retorna... se chama: FLUÊNCIA DE MÉTODO
                .nome("Andressa") // criar nova pessoa e preencher os atributos com os valores
                .sobrenome("Rabêlo") //só por um . (ponto) na frente que vc pode escolher o atributo e só preencher, independente
                // da ordem
                .apelido("Dressa")
                .documento("823213904")
                .email("andressa.lindinha@gmail.com")
                .dataNascimento(LocalDate.of(2001,03,06)) // método distatico
                .criaPessoa(); // último método que criei (criar pessoa)
        
      // alt + ENTER (escolha a opção  
      
        System.out.println(pessoa); // imprimir a pessoa na tela (dados e valores sobre ela)
      
        
        // VANTAGEM: Agora eu sei exatamente qual atrbuto eu estou me referindo
        
          
                
    }
    
}
