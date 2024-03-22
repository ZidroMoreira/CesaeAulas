package Start_Over_From_Day_0_Learning;

import java.util.Scanner;

/*Escreva um programa que faça a soma de dois números introduzidos pelo utilizador. Apresente o
resultado da operação.*/
public class PL01_EX01 {

    public static void main(String[] args) {

        //Declarar Variaveis

        int num1,num2,total;

        Scanner input = new Scanner(System.in);
        // Introduzir numeros
        System.out.println("Introduza dois numeros para realizar a soma ");
        num1= input.nextInt();
        num2= input.nextInt();

        //Somar Numeros

        total=num1+num2;

        //Escrever resultado

        System.out.println("O resultado da soma é : " +total);

    }
}
