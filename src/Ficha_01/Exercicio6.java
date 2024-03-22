package Ficha_01;

import java.util.Scanner;

public class Exercicio6 {

        //comando "main"
    public static void main(String[] args) {

        // Chama a Classe Scanner para introduzir valores "input"
        Scanner input = new Scanner(System.in);

        // Variaveis de valor inteiro
        int valor1, valor2;

        //Introduz valor1
        System.out.println("Introduza valor 1"); //ex:2
        valor1 = input.nextInt();

        //Introduz valor2
        System.out.println("Introduza valor 2"); // ex:3
        valor2 = input.nextInt();

        System.out.println(" Valor 1 é "+valor1+ "   Valor 2 é "+valor2);

       valor1 = valor1 + valor2; // 5 = 2 + 3
       valor2 = valor1 - valor2; // 2 = 5 - 3
       valor1 = valor1 - valor2; // 3 = 5 - 2



        System.out.println(" Valor Permutado valor 1 = "+valor1);
        System.out.println(" Valor Permutado valor 2 = "+valor2);

    }

}
