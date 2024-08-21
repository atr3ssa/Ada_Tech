// pacote
package builder.problem.Solution;

import java.time.LocalDate;


public class PessoaBuilder {
    // uma estrutura da qual posso criar objetos concretos
            //  Uma classe é uma planta e as casas criadas a partir dessa planta, são os objetos (criados a partir dos construtores
    
    // encanpsular  atributos;
   private String nome; 
   private String sobrenome;
   private String documento;
   private String email;
   private String apelido;
   private LocalDate dataNascimento; // poderia ser um localDate
   
   // SETTERS - métodos
        // Após criar os setters, vou mudar o nome dos métodos p o mesmo nome dos atributos:

    public PessoaBuilder nome(String nome) {  // O nome vai retornar PessoaBuilder(O nome da classe)
        this.nome = nome;
        return this; // retornar o próprio objeto ( o próprio builder (PessoaBuilder))
    }

    public PessoaBuilder sobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
        return this;
    }

    public PessoaBuilder documento(String documento) {
        this.documento = documento;
        return this;
    }

    public PessoaBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PessoaBuilder apelido(String apelido) {
        this.apelido = apelido;
        return this;
    }

    public PessoaBuilder dataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }
   
    // método publico
    
    public Pessoa criaPessoa(){
      return new Pessoa(nome, sobrenome, documento, email, apelido, dataNascimento); // passar os atributos necessários 
       
    }
   
   
}
