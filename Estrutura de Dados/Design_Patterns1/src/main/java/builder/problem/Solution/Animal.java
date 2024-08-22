// pacote
package builder.problem.Solution;
import lombok.*;// devido a escrita recorrente de alguns códigos, ele fornece alguns já prontos

@Data // Getters e setters + to string
@AllArgsConstructor // um constructor com todos os argumentos
@NoArgsConstructor // retorna um constructor vazio
@Builder // dá um builder completo p gente preencher

public class Animal {
    private String nome;
    private String dono;
    private String raca;
    
            
    
}
