package Ficha_05;

import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {

        // Inportar Scanner
        Scanner input = new Scanner(System.in);

        //Declarar Variaveis

        double[] mes = new double[13];
        double total = 0;

        System.out.println("************************");

        //ler vetor

        for (int i = 1; i < mes.length; i++) {
            System.out.println("Insira a comissão do " + i + ": Mes");
            mes[i] = input.nextDouble();
            total = total + mes[i];

        }
        System.out.println("O total de comissoes anual é : " + total + " Euros");

        System.out.println("**************************");


    }
}
