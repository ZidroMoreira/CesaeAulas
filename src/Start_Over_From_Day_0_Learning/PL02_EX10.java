package Start_Over_From_Day_0_Learning;

import java.util.Scanner;

/*Escreva um programa que leia dois números reais e pergunte ao utilizador qual a operação aritmética que quer
realizar e apresente o resultado. O utilizador deve responder usando o símbolo da operação (exemplo: para fazer
a soma, o utilizador deve escrever ‘+’). Se for inválido apresente erro. */
public class PL02_EX10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variaveis
        String operador;
        double num1, num2, total;
        System.out.println("*************************Inicio**************************");

        //Ler valores
        System.out.println("Insira um numero ");
        num1 = input.nextDouble();

        System.out.print("Insira outro numero ");
        num2 = input.nextDouble();


        System.out.println(" Escolha um operador aritmético para realizar a operação:\n+ ( Soma):\n- (Subtração):\n* (multiplicação):\n/ (Divisão):");

        //ler string input.next
        operador = input.next();



        switch (operador) {
            case "+":
                total = num1 + num2;
                System.out.println("O Resultado da Soma é : " + total);
                break;
            case "-":
                total = num1 - num2;
                System.out.println("O Resultado da Subtração é : " + total);
                break;

            case "*":
                total = num1 * num2;
                System.out.println("O Resultado da Multiplicação é : " + total);
                break;
            case "/":
                total = num1 / num2;
                System.out.println("O Resultado da Divisão é : " + total);
                break;

            default:
                System.out.println("Operador Invalido!!\n\n");

                break;


        }
    }


}

