package Ficha_04;

import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Pede 2 valores para calculo aritmetico

        double num1 = 0, num2 = 0, total;
        String operador, pergunta;

        do {
            System.out.println("Insira Primeiro valor ");
            num1 = input.nextDouble();
            System.out.println("Insira Segundo Valor");
            num2 = input.nextDouble();
            System.out.println("Insira uma opção usando o caracter da operação aritmética  \n Soma (+) \n Subtração (-)\n Divisão (/)\n Multiplicação (*)");

            operador = input.next();


            switch (operador) {

                case "+":

                    total = num1 + num2;
                    System.out.println("O resultado da Soma : " + total);
                    break;
                case "-":

                    total = num1 - num2;
                    System.out.println("O resultado da Subtração :" + total);
                    break;
                case "/":

                    total = num1 / num2;
                    System.out.println("O resultado da Divisão :" + total);
                    break;
                case "*":

                    total = num1 * num2;
                    System.out.println("O resultado da Multiplicação :" + total);
                    break;

                default:

                    System.out.println("Opção Invalida");


            }

            do {
                System.out.println("Deseja efectuar novos calculos (S/N)  ");
                pergunta = input.next();
                //Se pergunta diferente de "s"  e se pergunta diferente de "n" repete a mensagem de
                //Deseja efectuar novos calculos
            } while (!pergunta.equalsIgnoreCase("s") && !pergunta.equalsIgnoreCase("n"));


        } while (pergunta.equalsIgnoreCase("s"));


    }
}