package Ficha_02;

import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {

        //Importar Scanner

        Scanner input = new Scanner(System.in);


        //Declarar Variaveis


        double salario, taxa20Por = 0.20, taxa30Por = 0.30, taxa35Por = 0.35, taxa40Por = 0.40, taxa;


        System.out.println("Insira um salario");

        salario = input.nextDouble();

        // Imposto de 20 %

        if (salario <= 15000) {

            taxa = salario * taxa20Por;

            System.out.println("Paga a taxa de 20 % :" + taxa);

        }

        // Imposto de 30 %

        if (salario > 15000 && salario <= 20000) {

            taxa = salario * taxa30Por;

            System.out.println("paga taxa de 30 % : " + taxa);
        }

        //Imposto de 35 %

        if (salario > 20000 && salario <= 25000) {

            taxa = salario * taxa35Por;

            System.out.println("Paga taxa de 35 %" + taxa35Por);
        }
        //Imposto de 40 %

        if (salario > 25000) {

            taxa = salario * taxa40Por;

            System.out.println("Paga taxa de 40% " + taxa + "Euro");
        }


    }


}

