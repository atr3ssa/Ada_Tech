
package lojas;
//classes importadas
import animais_heranca.Animal;
import animais_heranca.Cachorro;


public class PetShop { //polimorfismo
    // métodos do petshop
    
    public void banho(Animal animal){//ação para todos os animais
        animal.setEstadoDeEspirito("limpo");
        
    }
    public void tosar(Cachorro cachorro){ // ação apenas para cachorros
        cachorro.setEstadoDeEspirito("tosado");
    }
    public void deixarHotel(Animal animal){//ação para todos os animais
        animal.setEstadoDeEspirito("saudades");
    }
}
