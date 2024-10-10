// pacote
package proxy;

import java.util.HashMap;
import java.util.Map;


public class PessoaRepository {
    
    private Map<Long, Pessoa> banco = new HashMap<>(); // vai simular um banco de dados
    private static Long countId = 1L; // vai contabilizando, 1, 2... conforme as pessoas forem cadastradas
    
    public void save(Pessoa pessoa){  // método para salvar a pessoa
        banco.put(countId++, pessoa); // coloca pessoa no banco e vai contabilizando e guardando
    }
    
    public Pessoa findById(Long id){ // buscar a pessoa pelo id
        try {
            Thread.sleep(3000); // 3 milissegundos (a thread vai dormir nesse tempo)
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        return banco.get(id); // vai pegar do banco de pessoas , a pessoa cadastrada com o banco
        // simulando o comportamento de um banco só com 2 métodos
    }
}
