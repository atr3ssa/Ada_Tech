// pacote
package proxy.Problem;



import builder.problem.Solution.Pessoa;
import java.time.LocalDate;
import proxy.PessoaRepository;
import proxy.PessoaService;


public class PessoaTest {
    
    /*
    public static void main(String[] args){
        PessoaService pessoaService = new PessoaService(new PessoaRepository()); // injetando a dependencia
        
        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .sobrenome("Rabelo")
                .dataNascimento(LocalDate.of(2001,03,06))
                .nome("Andressa")
                .apelido("Dressa")
                .documento("12312312312")
                .build();
        
        pessoaService.save(pessoa);
        
        Pessoa pessoaRetornada = pessoaService.findById(1L);
        System.out.println(pessoaRetornada);
        
        // Proxy: Quero por log, mas n´posso alterar a classe (PessoaRepository)
        // Service vai chamar o proxy que vai chamar o pessoaRepository
        
        
    } */
    
}
