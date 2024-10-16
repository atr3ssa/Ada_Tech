// pacote
package proxy.Solution;

import builder.problem.Solution.Pessoa;


public interface ProxyPessoa { // usado como polimorfismo
    
    // abstrato
    void save(Pessoa pessoa);
    
    Pessoa findById(Long id);
}
