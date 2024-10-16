// pacote
package proxy.Solution;

import builder.problem.Solution.Pessoa;
import java.time.LocalDate;
import proxy.PessoaService;

public class PessoaTestProxy {
     public static void main(String[] args){
         PessoaRepositoryProxy pessoaRepositoryProxy = new PessoaRepositoryProxy();
        PessoaService pessoaService = new PessoaService(new PessoaRepositoryProxy()); // injetando a dependencia
        
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
        
        // Proxy: Quero por log, mas n´posso alterar a classe (PessoaRepository) ou quero fazer cash para melhorar a performance e ficar mais rapido
        // Service vai chamar o proxy que vai chamar o pessoaRepository
        
        
    }
}
