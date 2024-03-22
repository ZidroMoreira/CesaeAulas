package Ficha_03;
//Faça um programa que leia dois números inteiros, representando os valores início e fim de um intervalo e
//imprima os números inteiros neste intervalo.
import java.util.Scanner;

public class Exercicio_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variaveis

        int inicio, fim, contador;

        //Introduz o Inicio
        System.out.println("Intruduza um número de início: ");
        inicio = input.nextInt();

        //Introduz o Fim
        System.out.println("Introduza um número de fim");
        fim = input.nextInt();
        // Se valor do " Inicio <= que o valor " Fim"

        if (inicio <= fim) {
            System.out.println("Numero de Inicio: " + inicio + "   Numero de Fim: " + fim);
            // Enquanto o contador = valor " Inicio" <= que fim, incrementar contador e escrever o valor do contador com o incremento
            // Repete até o valor do contador se <= que o valor da var " fim"
            contador = inicio;
            while (contador <= fim) {

                contador++;

                System.out.println("valor  " + contador );



            }
        } else {
            System.out.println("Os valor Inicial deve ser inferior ao valor de Fim");


        }

    }
}