// pacote
package proxy.Solution;

import builder.problem.Solution.Pessoa;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import proxy.PessoaRepository;

public class PessoaRepositoryProxy extends PessoaRepository{
    // criar Cache
    private Map<Long, Pessoa>cache = new HashMap<>();// simular cache, usando um HashMap
    
    // add log
    private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());
    
    @Override// Sobrescrever os métodos
    public void save(Pessoa pessoa){
        log.info("Iniciando chamada do método save...");
        super.save(pessoa); // super= classe pai
        log.info("Chamada do método save finalizada");
    }
    
    @Override
    public Pessoa findById(Long Id){
        log.info("Iniciando chamada do método findById...");
        Pessoa pessoa = super.findById(Id);
        log.info("Chamada do método findById finalizada");
        return pessoa;
    }
}
