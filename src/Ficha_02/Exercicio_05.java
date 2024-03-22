package Ficha_02;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        //Importar Scanner
        Scanner input = new Scanner(System.in);


        //Declarar Variaveis

        double num1, num2;

        //Ler Valor 1
        System.out.println("Introduza um numero:");
        num1 = input.nextDouble();

        // Ler Valor 2
        System.out.println("Introduza um numero");
        num2 = input.nextDouble();

        // Compara o Num 1 se é Menor que o Num 2 e escreve o menor para o maior
        if (num1 < num2) {
            System.out.print(+num1 + " " + num2);

        }

        // Compara se o Num 2 se é Menor que o Num 1 e escreve o menor para o maior
        if (num2 < num1) {
            System.out.print(+num2 + " " + num1);


        }

        // Verifica se o Num1 = Num 2 || ( OU ) Num2 = Num1
        // == ( Igual ) mas devo usar o .Equals
        if (num1 == num2 || num2 == num1) {

            System.out.println("Valores Sao Iguais");
        }
    }
}
