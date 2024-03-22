package Ficha_03;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
    int numero = input.nextInt();

    int contador = 1;

        System.out.println("Os 5 anteriores:");
        while (contador <= 5) {
        System.out.print((numero - contador) + " ");
        contador++;
    }

    contador = 1; // Resetando o contador para usar novamente

        System.out.println("\nOs 5 seguintes:");
        while (contador <= 5) {
        System.out.print((numero + contador) + " ");
        contador++;
    }
}
}