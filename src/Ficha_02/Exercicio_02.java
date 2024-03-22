package Ficha_02;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {


        //Importar Scanner

        Scanner input = new Scanner(System.in);

        //Declarar Variaveis
        double salario, taxa20Por = 0.20, taxa30Por = 0.30, taxa;

        //Ler salario

        System.out.print("Introduza um salario: ");
        salario = input.nextDouble();


        //Condiçao

        if (salario <= 15000) {
            //Pagar taxa de 20 %
            taxa = salario * taxa20Por;

            System.out.println("Paga taxa de 20 Porcento: " + taxa);

        } else {
            //Pagar taxa de 30 %
            taxa = salario * taxa30Por;

            System.out.println("Paga taxa de 30 Porcento: " + taxa);
        }


    }
}
