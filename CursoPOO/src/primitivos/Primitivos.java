/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primitivos;


public class Primitivos {

   //método/função main
   //5 caracteristicas:
    // publico, estático, void (não retorne valor nenhum), o nome deve ser main, vai receber como parametro um array(String[]) ou var args (String...(indefini quantas varáveis eu vou estar recebendo nesse método)) de Strings;
    public static void main(String[] args/*qualquer nome*/) {
        //atalho sout
        System.out.println("hello, World!");
        
        //variaveis primitivos (guardando na memória)
        // não pode criar novos, já são definidos;
        //8:
        //byte(-128 - 127, 8 bits, inteiros), short, int, double(ponto flutuante), char, boolean(true or false), float(ponto flutuante), long
        
        
        //8 bits
        byte variavelByte =-127;
        // short = 16 bits (-32768 - 32767)
        // char = igual o short, mas só aceita os positivos (0 - 65535) = ""
        // int = 4 bytes (32 bits) = o mais usado (-2b - 2b) = 0
        // long = 8 bytes (64 bits) (-9t - 9t) = 0
        int variavelInt = 2147483;
        
        System.out.println(variavelInt);
        
         
    }
    
}
