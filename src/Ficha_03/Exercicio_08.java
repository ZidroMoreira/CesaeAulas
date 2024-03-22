package Ficha_03;

import java.util.Scanner;

public class Exercicio_08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Declarar variaveis

        int num = 0, anterior = 1, seguinte = 0;

        System.out.println("Introduza um numero: ");
        num = input.nextInt();

        anterior = num - 5;
        seguinte = num + 5;

        while (anterior < num) {

            System.out.println("Os Numeros Anteriores sao :" + anterior);

            anterior++;

        }

        num++; // num = num + 1;

        while (seguinte > num) {

            System.out.println("Os numeros Seguintes sao: " + seguinte);

            seguinte--;



        }


    }
}