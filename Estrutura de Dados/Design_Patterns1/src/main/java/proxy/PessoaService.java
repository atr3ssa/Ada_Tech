package proxy;

import builder.problem.Solution.Pessoa;
import proxy.Solution.PessoaRepositoryProxy;


public class PessoaService { // minha classe de serviço


    private PessoaRepositoryProxy pessoaRepositoryProxy; // atributo / composição

// métodos:
    
    public PessoaService(PessoaRepositoryProxy pessoaRepositoryProxy) { // o constructor fará uma engessão de dependências aqui (pesquisar)
// Inversão de controle (não é necessário criar um objeto, "alguém" cria e injeta

        this.pessoaRepositoryProxy = pessoaRepositoryProxy;

}
    public void save(Pessoa pessoa){ // vai salvar 
        pessoaRepositoryProxy.save(pessoa); // e passar p/ a pessoaRepository a responsablidade
}
     public Pessoa findById(Long id){ // vai receber um id por parâmetro e retornar pessoa de acordo com o id
        return pessoaRepositoryProxy.findById(id);
    }
       
    }


