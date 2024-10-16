// pacote
package proxy.Solution;

import builder.problem.Solution.Pessoa;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
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
        long inicio = System.currentTimeMillis(); // medir o tempo que esse processo vai durar
        
        Pessoa pessoa = null;
        if(Objects.nonNull(cache.get(Id))){ // se não for nulo, está no cache
        log.info("Está pegando do cache...");  
        pessoa = cache.get(Id);
        
        } else{ // se for nulo, vai pegar do super (Pessoarepository)
          log.info("Está pegando de PessoaRepository..."); 
          pessoa = super.findById(Id);
          cache.put(Id,pessoa); // e add no cache, p que na próxima esteja no cache
        }
        // Pessoa pessoa = super.findById(Id);
        log.info("Chamada do método findById finalizada"); 
        long fim = System.currentTimeMillis(); // medir o tempo que esse processo vai durar
        
        log.info("Tempo gasto na chamada..." + (fim - inicio)); // calcular e mostrar o tempo da chamada (subtraindo fim de inicio) 
        return pessoa; // retornar pessoa
    }
}
