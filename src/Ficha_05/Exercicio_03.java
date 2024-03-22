package Ficha_05;

import java.util.Scanner;
/*3. Escreva um programa que lê um array de tamanho 10
 e encontra o maior elemento.
*/

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//declarar variaveis

        int[]vetor = new int[11];
        int maior = 0;

        System.out.println("*********************");
        //ler vetor

        for (int i = 1; i < vetor.length; i++) {

            System.out.println("Insere "+i+ "º valores para encontrar o maior elemento: ");

            vetor[i] = input.nextInt();


        }
        System.out.println("*******************");
            //Encontrar o Maior elemento
            for (int i = 1; i < vetor.length; i++) {
                if (vetor[i] > maior) {
                    maior = vetor[i];
                }
            }
            //Aprensentar o maior elemento

        System.out.println("Maior : " +maior);








            }


    }

