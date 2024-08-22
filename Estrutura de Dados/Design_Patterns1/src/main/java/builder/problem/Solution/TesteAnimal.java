//pacote
package builder.problem.Solution;

// feito através do builder do lombok
public class TesteAnimal {
    public static void main(String[] args) {
        Animal animal = // mudar nome do objeto p animal
                Animal.builder()
                .nome("Rex")
                .raca("SRD")
                .dono("Andressa")
                .build();  // alt + enter 
        
        System.out.println(animal); // imprimir animal
    }
}
