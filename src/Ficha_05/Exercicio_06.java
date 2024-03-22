package Ficha_05;
/*6. Escreva um programa que lê um array de tamanho 10 e verifica se os elementos estão em ordem crescente.
 */

import java.util.Scanner;

public class  Exercicio_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declarar Variaveis

        double[] vetor = new double[10];
        boolean crescente = true;

        // Insere valores no vetor

        for (int i = 1; i < vetor.length; i++) {

            System.out.println("Insere o " + i + "º valor");
            vetor[i] = input.nextDouble();


        }
        //Faz a leitura do vetor
        for (int i= 1; i < vetor.length; i++) {

            if (vetor[i] <= vetor[i - 1]) { // <= Porque se dois numeros se repetirem deixa de ser uma ordem crescente
                crescente = false;

            }
        }
            if (crescente) {
                System.out.println("Valores estao na ordem crescente");
            }else{
                System.out.println("Valores NÃO estão em ordem crescente");
            }

        }
    }
