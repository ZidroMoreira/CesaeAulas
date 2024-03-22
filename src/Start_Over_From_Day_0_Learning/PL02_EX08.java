package Start_Over_From_Day_0_Learning;

import java.util.Scanner;

/*Escreva um programa que leia três notas (0-20 valores) de um aluno, calcule a sua média final ponderada, e diga
se está aprovado ou não (mais de 9.5). Ponderações: Nota 1: 25%; Nota 2: 35%; Nota 3: 40%
*/
public class PL02_EX08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variaveis
        double nota1,nota2,nota3, mediaPond;

        System.out.println("*********Bem*Vindo************\n");
        System.out.println("Insira a 1º Nota: ");
        nota1= input.nextInt();

        System.out.println("Insira a 2º Nota: ");
        nota2= input.nextInt();

        System.out.println("Insira a 3º Nota: ");
        nota3= input.nextInt();

        //Formula Calcular a média ponderada
        mediaPond=(nota1*0.25)+(nota2*0.35)+(nota3*0.40)/(0.25+0.35+0.40);
        System.out.println(" O resultado da Média Ponderada é :  "+ mediaPond+" Valores\n");

        //Condiçao se nota >9.5 "aprovado" , Se não "reprovado"
        if (mediaPond >=9.5){
            System.out.println("Aprovado!!!!\n");
        }else{
            System.out.println("Reprovado!!!! Estuda mais!");
        }
        System.out.println("*********Fim************");
    }

}
