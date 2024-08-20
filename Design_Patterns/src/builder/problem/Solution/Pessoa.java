// pacote
package builder.problem.Solution;

// Classe pessoa com os atributos: Nome, sobrenome, documento, email, apelido, data de nascimento
public class Pessoa { 
    // uma estrutura da qual posso criar objetos concretos
            //  Uma classe é uma planta e as casas criadas a partir dessa planta, são os objetos
    // encanpsular  atributos;
   private String nome; 
   private String sobrenome;
   private String documento;
   private String email;
   private String apelido;
   private String dataNascimento; // poderia ser um local date

   // Inserir constructor
   
    public Pessoa(String nome, String sobrenome, String documento, String email, String apelido, String dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.documento = documento;
        this.email = email;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
    }
   
   
}
