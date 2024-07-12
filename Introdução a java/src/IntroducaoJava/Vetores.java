/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introducaoJava;

import java.util.Arrays;


public class Vetores {
    public static void main(String[] args) {
        //Não misturar tipos no Array = Vetor
        
        //array com 5 posições
        //1° forma:
        //String[] letras = new String[5];
        //p referenciar é usado indice, o 1° é sempre 0 no java
        //[0] [1] [2] [3] [4]
        //letras[0]= "a";
        //letras[1]= "b";
        //letras[2]= "c";
        //letras[3]= "y";
        //letras[4]= "z";
        
        //para mostrar o que tem dentro de um array, preciso por o sout dentro de um for (laço de repetição)
        //for(int i=0; i< letras.length; i++){
          // System.out.println(letras[i]); 
        //}
        
        //2° forma:
        //String[] letras = {"a", "b", "c", "y", "z"};
        //System.out.println(Arrays.toString(letras));
        
        //3° forma
        //descobrir o maior, o menor e a média dos elementos
        
        int[] numeros = { 9, 10, 12, 25, 2};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;
        
        for(int i=0; i < numeros.length; i++){
            if(numeros[i]> maior){
                maior = numeros[i];
            } 
            if (numeros[i] < menor){
                menor = numeros[i];
            }
            media += numeros[i];
            // media = media + numeros[i]
            
        }
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
            System.out.println("Média: " + media/numeros.length);
        
        
    }
}
