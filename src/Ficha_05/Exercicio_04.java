package Ficha_05;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int[] vetor = new int[11];
        int menor = 1;

        System.out.println("*********************");


        for (int i = 1; i < vetor.length; i++) {

            System.out.println("Insira o " + i + "º para encontrar o menor elemento:");
            vetor[i] = input.nextInt();

            if (vetor[i] < menor) {

                menor = vetor[i];
            }

        }
        System.out.println("***********************");

       System.out.println("O numero menor inserido é : " + menor);
    }
}


