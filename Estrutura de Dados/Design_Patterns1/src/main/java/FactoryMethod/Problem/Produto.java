// pacote
package FactoryMethod.Problem;

import java.math.BigDecimal;


public class Produto {
    
    private String descricao;
    private BigDecimal preco;
    private boolean possuiDimensoesFisicas; // Como altura, largura, profundidade...
    
    // Getters e Setters

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public boolean isPossuiDimensoesFisicas() {
        return possuiDimensoesFisicas;
    }

    public void setPossuiDimensoesFisicas(boolean possuiDimensoesFisicas) {
        this.possuiDimensoesFisicas = possuiDimensoesFisicas;
    }
    
    
    
    
}
