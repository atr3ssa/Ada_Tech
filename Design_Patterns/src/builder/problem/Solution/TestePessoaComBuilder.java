// pacote
package builder.problem.Solution;


public class TestePessoaComBuilder {
    public static void main(String[] args) { // atalho main
        new PessoaBuilder().nome("Andressa") // criar nova pessoa e preencher os atributos
                .sobrenome("Rabêlo") //só por um . (ponto) na frente que vc pode escolher o atributo e só preencher, independente
                // da ordem
                .apelido("Dressa")
                .documento("823213904")
                .email("andressa.lindinha@gmail.com")
                .dataNascimento(2001,03,06);
          
                
    }
    
}
