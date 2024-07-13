//pacote
package main;

//  PROBLEMA: INVERTA UM CONJUNTO --- UTILIZANDO UMA PILHA, INVERTA UM CONJUNTO DE DADOS FORNECIDO PELO USUÁRIO

import dataStructure.Stack;


public class Main {
    
    public static void main(String[] args) {
        
        int[] numeros ={5,4,3,2,1}; // vetor de inteiros
        inverter(numeros); // método inverter
    }

    private static void inverter(final int[] numeros) {// criar o método inverter
        //ler o vetor e armazenar dentro de uma pilha
        Stack stack = new Stack(numeros[0]); // criar pilha q armazena de inicio apenas o 1° elemento
        
        for (int i = 0; i < numeros.length; i++){ // laço for
            stack.push(numeros[i]);
        }
        var node = stack.pop();
        while (node != null){ // Enquanto o nó não for vazio
            System.out.println(node.getValue());// escrever na tela o seu valor
            node = stack.pop(); // vou pular p outro valor
        }
    }
    
}
