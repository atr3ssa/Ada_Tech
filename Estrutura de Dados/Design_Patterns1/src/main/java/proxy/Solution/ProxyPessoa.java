// pacote
package proxy.Solution;

import builder.problem.Solution.Pessoa;


public interface ProxyPessoa {
    
    // abstrato
    void save(Pessoa pessoa);
    
    Pessoa findById(Long id);
}
