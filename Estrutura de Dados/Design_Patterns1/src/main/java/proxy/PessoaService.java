package proxy;


public class PessoaService { // minha classe de serviço


    private PessoaRepository pessoaRepository; // atributo / composição

// métodos:
    
    public PessoaService(PessoaRepository pessoaRepository) { // o constructor fará uma engessão de dependências aqui (pesquisar)
// Inversão de controle (não é necessário criar um objeto, "alguém" cria e injeta

        this.pessoaRepository = pessoaRepository;

}
    public void save(Pessoa pessoa){ // vai salvar 
        pessoaRepository.save(pessoa); // e passar p/ a pessoaRepository a responsablidade
}
     public Pessoa findById(Long id){ // vai receber um id por parâmetro e retornar pessoa de acordo com o id
        return pessoaRepository.findById(id);
    }

}
