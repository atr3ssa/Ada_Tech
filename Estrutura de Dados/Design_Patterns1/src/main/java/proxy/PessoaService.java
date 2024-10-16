package proxy;

import builder.problem.Solution.Pessoa;
import proxy.Solution.PessoaRepositoryProxy;
import proxy.Solution.ProxyPessoa;


public class PessoaService { // minha classe de serviço


    private ProxyPessoa proxyPessoa; // atributo / composição

// métodos:
    
    public PessoaService(ProxyPessoa proxyPessoa) { // o constructor fará uma engessão de dependências aqui (pesquisar)
// Inversão de controle (não é necessário criar um objeto, "alguém" cria e injeta

        this.proxyPessoa = proxyPessoa;

}
    public void save(Pessoa pessoa){ // vai salvar 
        proxyPessoa.save(pessoa); // e passar p/ a pessoaRepository a responsablidade
}
     public Pessoa findById(Long id){ // vai receber um id por parâmetro e retornar pessoa de acordo com o id
        return proxyPessoa.findById(id);
    }
       
    }


