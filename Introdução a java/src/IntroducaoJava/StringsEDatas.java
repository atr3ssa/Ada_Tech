/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boolean_aula;
//importações
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class StringsEDatas {
    public static void main(String[] args) {
        //Olá + nome de alguem. Hoje é + diadasemana, bom dia
        
        //declarar variaveis
        String nome= "Andressa";
        
        //Manipulação de Strings e Datas
        
        //Nome em maiúsculas
        System.out.println(nome.toUpperCase());
        //Nome em minúsculo
        System.out.println(nome.toLowerCase());
        //Consultar quantos caracteres tem a String (comprimento)
        System.out.println(nome.length());
        
        String nomeOutro= "andressa";
        
        //Comparar Strings (se variar o o tamanho da letra, da como false, do contrario é true
        System.out.println(nome.equals(nomeOutro));
        //Compara Strings, mas ignora o tamanho das letras
        System.out.println(nome.equalsIgnoreCase(nomeOutro));
        
        //ISO 0601 = Define o padão das datas
        //data com as informações locais
        //ano mês dia
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        
        //Locale nome da variavel= brasl = novo objeto locale("idioma", "país");
        Locale brasil = new Locale("pt","BR" );
        
        //mostrar hoje.diadasemana em português (getDisplayName(estilo, variavel Locale)
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        
        //mostrar hoje.diadomes
        System.out.println(hoje.getDayOfMonth());
        
        //mostrar hoje.diadoano
        System.out.println(hoje.getDayOfYear());
           
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        
        LocalDateTime agora = LocalDateTime.now();
        if(agora.getHour() >= 8 && agora.getHour() <12){
           saudacao = "Bom dia!"; 
        } else if(agora.getHour()>=12 && agora.getHour() <18){
            saudacao = "Boa Tarde!";
        } else if(agora.getHour()>=18 && agora.getHour() <24){
            saudacao= "Boa noite!";
        } else {
            saudacao = "Olá";
        }
        //formatos depois valores
        System.out.printf("Olá, %s. hoje é %s, %s. %n", nome, diaSemana, saudacao.toUpperCase());
    }
  
}
