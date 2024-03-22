package Ficha_02;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {
        //Importar scanner


        Scanner input = new Scanner(System.in);

        //Variaveis

        double nuM1, nuM2, resultado =0;
        String operador;

        //Ler Valor 1

        System.out.println("Insira o 1º valor");
        nuM1 = input.nextDouble();

        //Ler Valor 2

        System.out.println("Insira o 2º Valor");
        nuM2 = input.nextDouble();

        // Escolher Operador + - / *

        System.out.println("Escolha o Operador");
        System.out.println("+ , Soma");
        System.out.println("- , Subtração");
        System.out.println("/ , Divisão");
        System.out.println("/ , Multiplicação");

        operador = input.next();


        switch (operador) {
            case "+":
                resultado = nuM1 + nuM2;
                System.out.println("O resultado da Soma é " + resultado);

                break;

            case "-":

                resultado = nuM1 - nuM2;
                System.out.println("O resultado da Subtração é " + resultado);

                break;

            case "/":
                resultado = nuM1 / nuM2;
                System.out.println("O resultado da Divisao é " + resultado);

                break;

            case "*":
                resultado = nuM1 * nuM2;
                System.out.println("O resultado da multiplicação é " + resultado);

            default:
                System.out.println("Escolheu opção errada");


        }
    }
}


