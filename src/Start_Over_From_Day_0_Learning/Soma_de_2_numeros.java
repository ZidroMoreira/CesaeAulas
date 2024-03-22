package Start_Over_From_Day_0_Learning;
/*Escreva um programa que faça a soma de dois números
introduzidos pelo utilizador e apresente o resultado
dessa soma*/

import java.util.Scanner;

public class Soma_de_2_numeros {
    public static void main(String[] args) {

        //Importar Scanner
        Scanner input = new Scanner(System.in);
        double num1, num2, soma;
        System.out.println("******************Inicio************************");

        //Mensagem
        System.out.println("Insira o Numeros para a operação de soma: ");

        //Atribuição dos 2 valores inseridos nas variaveis (num1 e num2)

        num1 = input.nextDouble();
        num2 = input.nextDouble();
        // Soma = Numero 1 + o Numero 2
        soma = num1 + num2;


        System.out.println("O resultado da operação da soma é : " + soma);
        System.out.println("*************Fim*Programa*************************");
    }

}
