package Ficha_02;

import java.util.Scanner;

//Crie um programa que mostre o menor de três números inteiros lidos.
public class Exercicio_09 {
    public static void main(String[] args) {

        //Importar scanner
        Scanner input = new Scanner(System.in);

        //Variaveis
        int nuM1, nuM2, nuM3, menor;


        //Ler 1º Numero Inteiro
        System.out.println("Insira o Primeiro valor inteiro: ");
        nuM1 = input.nextInt();

        //Ler 2º Numero Inteiro
        System.out.println("Insira o Segundo valor inteiro:");
        nuM2 = input.nextInt();

        //Ler 3º Numero Inteiro
        System.out.println("Insira o Terceiro valor inteiro");
        nuM3 = input.nextInt();

        // Compara o 1º Numero com o 2º Numero

        if (nuM1 < nuM2) {

            menor = nuM1;

        } else {

            menor = nuM2;
        }
        // Compara o var menor  com o 3º numero

        if (menor < nuM3) {

            System.out.println("O numero menor é :" + menor);

        } else {

            System.out.println("O numero menor é " + nuM3);
        }


    }
}
