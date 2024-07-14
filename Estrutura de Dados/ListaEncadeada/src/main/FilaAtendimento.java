// pacote
package main;

// PROBLEMA: Crie um programa JAVA que que simule uma fila de atendimento e os clienetes entrem na fila e sejam atendidos um por um

import dataStructure.Queue;
import java.util.Random;

public class FilaAtendimento {
    
    public static void main(String[] args) {
        int n = 5;
        var random = new Random(); // Classe para gerar número randomico
        int cliente = random.nextInt(101); // clente é um int de 100
        Queue queue = new Queue(cliente);
        System.out.println("Chegou o clinte: " + cliente);
        
        //Simula chegada dos clientes
        for(int i = 2; i < n;i++){
            cliente = random.nextInt(101); // clente é um int de 100
            System.out.println("Chegou o clinte: " + cliente);
            queue.enqueue(cliente);
        }
    }
}
