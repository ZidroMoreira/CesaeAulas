package Ficha_05;

import java.util.Scanner;

public class Exercicio_01 {
// Implemente um programa que permita adicionar 10 números inteiros a um array e que os imprima pela ordem
//de inserção
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar Variaveis
        int[] vetor = new int[10];

        System.out.println("****************************");
        //.lenght vê o comprimento do vetor
        for (int i = 0; i < vetor.length; i++) {

            System.out.println("Insira um valor no vetor " + i + "]:");

            vetor[i] = input.nextInt();


        }
        System.out.println("***************************");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor[" + i + "]" + vetor[i]);

        }


    }
}
