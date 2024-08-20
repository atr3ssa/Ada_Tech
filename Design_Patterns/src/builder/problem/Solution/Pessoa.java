// pacote
package builder.problem.Solution;

// Classe pessoa com os atributos: Nome, sobrenome, documento, email, apelido, data de nascimento
public class Pessoa { 
    // uma estrutura da qual posso criar objetos concretos
            //  Uma classe é uma planta e as casas criadas a partir dessa planta, são os objetos (criados a partir dos construtores
    
    // encanpsular  atributos;
   private String nome; 
   private String sobrenome;
   private String documento;
   private String email;
   private String apelido;
   private String dataNascimento; // poderia ser um local date

   // Inserir constructor
   
    public Pessoa(String nome, String sobrenome, String documento, String email, String apelido, String dataNascimento) {
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    //toString

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
    
   
   
}
