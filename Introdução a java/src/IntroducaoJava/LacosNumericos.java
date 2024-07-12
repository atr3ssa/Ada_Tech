/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boolean_aula;


public class LacosNumericos {
    public static void main(String[] args) {
        // 1 2 3 4 5 
        // variavel que começa em 1 em vai ate 10, mudando 1 por 1, faca
        //impar de 1 a 20
        for(int i= 1; i <=10; i++){
            //laços aninhados, laço for dentro de outro
            System.out.println("");
            System.out.println("Tabuada do " + i+ ":");
            System.out.println("");
            for(int j=1; j<=10; j++){
              System.out.println(i + "X" + j + "=" + j*i); 
            
            }
            
        }
    }
}
