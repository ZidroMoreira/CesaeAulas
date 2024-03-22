package Ficha_02;

import java.util.Scanner;

public class Exercicio_07 {

    public static void main(String[] args) {

        double valor;
        int var;



        //Importar Scanner
        Scanner input = new Scanner(System.in);

        // Ler Valor
        System.out.println("Insira um numero");

        valor = input.nextDouble();

        // Condição se é ou nao par

        if (valor % 2 == 0) {
            System.out.println("Numero par");

        } else {

            System.out.println("Numero Impar ");
        }
    }
}

