package Ficha_05;
/*5. Escreva um programa que lê um array de tamanho 10 e calcula a média dos elementos.
 */

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

             //Declarar Variaveis

        double[] vetor = new double[10];

        double total = 0, media = 0;

        for (int a = 1; a < vetor.length; a++) {

            System.out.println("Introduza o " + a + "º valor para fazer a média: ");
            vetor[a] = input.nextDouble();


        }

             //Calcula a soma dos valores inseridos

        for (int a = 1; a < vetor.length; a++) {

            total = total + vetor[a];

            //calcular a media


            media = total / vetor.length;
        }

        System.out.println("O Resultado da média dos valores introduzidos anteriormente é : " + media);
    }
}

