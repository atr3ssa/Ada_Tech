
package animais_heranca;

            //Quais são os modificadores de acesso:
                                    //    a partir da mesma classe = public, protected, default, private
                                    //    Qualquer classe no mesmo pacote = public, protected, default
                                    //    Qualquer classe filha no mesmo pacote = public, protected, default
                                    //    Qualquer classe filha pacote diferente = public, protected
                                    //    Qualquer classe em pacote diferente = public

//Classe abstrata = não pode criar um objeto a partir dela (IMPORTANTE) / só descrevem o que podem ter / necessário especificar classes filhas (cao, gato), para criar objetos (caes e gatos)
public abstract class Animal { //Classe pai / classe criada p explicar herança
    //atributos em comum entre todos os animais / atributos = caracteristicas do objeto
    
        //encapsulamento / encapsular o seu objeto de forma segura
    protected String nome; //private = só mesma classe acessa, como quero que os filhos acessem será PROTECTED
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito; 
    
    //Constructor (selecionar todos) / sempre entre os atributos e os métodos / constructor = oq executa a construção do seu objeto
        
                //public Animal(){} //construtor default/padrão, vazio
    
    public Animal(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        //pega a info x que está aqui no construtor e passa para a x que está nos atributos
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
    }

    //Métodos Getters(pegar) e Setters(colocar)
    
    public String getNome() {
        return nome;
        //pega a variavel nome
        //retorne nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        //não tem retorno
        //ex com validação
        // if(nome.equals("lily")){
        // this.nome = nome;  
        // }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
        //recebe a cor nessa variavel e guarda na variavel cor do atributo
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }
    
    
    
    //métodos que todos os animais tem / método = interagir com objeto/ações (objeto executa a ação)
    
     protected void comer(){
       //Método que não faz nada
       //assinatura
       //método público, não tem retorno, se chama "comer", não recebe variável nenhuma
    }
    protected void dormir(){
       //Método que não faz nada
       //assinatura
       //método público, não tem retorno, se chama "comer", não recebe variável nenhuma 
    }
    public abstract void soar(); // abstract = significa que cada animal terá que especificar o som
        //Método que só imprime algo
        //System.out.println("CRI CRI");
    //}
}
