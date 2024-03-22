package Ficha_01;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, soma, subtracao, multiplicacao, divisao;
        System.out.println("Bem vindo á calculadora multiuso");

        //introduzir valor
        System.out.println("Insira o um valor inteiro ");
        num1 = input.nextInt();

        //Introduzir valor
        System.out.println("Insira o segundo valor inteiro");
        num2 = input.nextInt();

        //Calcula a Soma
        soma = num1 + num2;
        System.out.println(" O resultado da soma é:" + soma);

        //calcula a Subtração
        subtracao = num1 - num2;
        System.out.println(" O resultado da Subtração é:" + subtracao);

        //calcula a Multiplicação
        multiplicacao = num1 * num2;
        System.out.println("O resultado da multiplicação é :" + multiplicacao);

        //calcula a Divisão
        divisao = num1 / num2;
        System.out.println("O resultado da divisão é :" + divisao);

    }
}
