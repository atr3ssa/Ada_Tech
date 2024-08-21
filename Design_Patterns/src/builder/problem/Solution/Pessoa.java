// pacote
package builder.problem.Solution;

// Classe pessoa com os atributos: Nome, sobrenome, documento, email, apelido, data de nascimento

import java.time.LocalDate;

public class Pessoa { 
    // uma estrutura da qual posso criar objetos concretos
            //  Uma classe é uma planta e as casas criadas a partir dessa planta, são os objetos (criados a partir dos construtores
    
    // encanpsular  atributos;
   private String nome; 
   private String sobrenome;
   private String documento;
   private String email;
   private String apelido;
   private LocalDate dataNascimento; // poderia ser um localDate

   // Inserir constructor
   
        // A partir do momento que eu crio um constructor de classe, eu perco o constructor padrão
            // public Pessoa(){ padrão
   
            // )
    public Pessoa(String nome, String sobrenome, String documento, String email, String apelido, LocalDate dataNascimento) {
        // Quando for criado uma pessoa, terei que passar todos esses atributos
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.documento = documento;
        this.email = email;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
    }
    
    // getters e Setters 
        // p setar e obter os valores

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setLocalDate(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    //toString
        // Quando der um System out println (imprimir) , vai chamar o tostring para mostrar a pessoa
    @Override
    public String toString() {
        return "Pessoa{" + 
                "nome=" + nome +
                ", sobrenome=" + sobrenome + 
                ", documento=" + documento + 
                ", email=" + email + 
                ", apelido=" + apelido + 
                ", dataNascimento=" + dataNascimento + '}';
    }
    
    // Caso seja necessário por o PessoaBuider em outra classe:
    
   static class PessoaBuilder { // mudar para estático, consigo acessar fora
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
    
    public Pessoa build(){ // criaPessoa = build
      return new Pessoa(nome, sobrenome, documento, email, apelido, dataNascimento); // passar os atributos necessários 
       
    }   
}}
