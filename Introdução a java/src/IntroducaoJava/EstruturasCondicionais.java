/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boolean_aula;


public class EstruturasCondicionais {
    public static void main(String[] args) {
        // declarar variável
        int nota = 100;
        String graduacao;
        //nota maior ou igual 70, aluno aprovado
        
        //(if, else)
        //teste lógico
        /*if(nota>=70){
            System.out.println("Aluno aprovado"); 
        } else {
            System.out.println("Aluno não aprovado");
        } */
        
        // Graduações A=80, B=70, C=60, D=0
        if(nota>=80){
            graduacao="A";
        } else if(nota<80 && nota>=70){
            graduacao="B";
        } else if(nota <70 && nota >=60){
            graduacao="C";
        } else if(nota<60 && nota>=0){
            graduacao="D";
        } else {
            graduacao="";
        }
        switch(graduacao){
            case "A":
            case "B":
                System.out.println("Aluno aprovado");
                //parada
                break;
            case "C":
            case "D":
                System.out.println("Aluno reprovado");
                //parada
                break;
            default:
                System.out.println("Graduação inválida");
        }
    }
}
