//pacote
package strategy;

import java.math.BigDecimal;


public class Funcionario {
    private String nome;
    private BigDecimal salario; // mais preciso para tratar moedas
    private TipoContratacaoEnum tipoContratacao;

    public String getNome() {return nome;}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public TipoContratacaoEnum getTipoContratacao() {
        return tipoContratacao;
    }

    public void setTipoContratacao(TipoContratacaoEnum tipoContratacao) {
        this.tipoContratacao = tipoContratacao;
    }
    
    
    
    
    
}
