package Start_Over_From_Day_0_Learning;

import java.util.Scanner;

/*Escreva um programa que leia um número, depois apresente se é par ou ímpar.
 */
public class PL02_EX07 {
    public static void main(String[] args) {
        //Declarar Variaveis
        int num1, num2;
        //Impportar Scanner
        Scanner input = new Scanner(System.in);

        //Ler num1
        System.out.println("Introduza valor ");
        num1 = input.nextInt();

        //Verificar se o numero é par ou impar

        if (num1%2==0){

            System.out.println("Numero: "+num1+" é par");

        }else{
            System.out.println("Numero: " +num1+" é impar");
        }
    }
}