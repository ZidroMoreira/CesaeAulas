package Ficha_03;
//Faça um programa que leia um número inteiro e imprima os números inteiros de 0 até este número.

import java.util.Scanner;

public class Exercicio_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Declarar Variaveis

        int limite = 0, num = 0;

        System.out.println("Introduza um limite");

        limite = input.nextInt();


        while(num <= limite){

            System.out.println(num);

            num = num + 1;

        }


    }
}
