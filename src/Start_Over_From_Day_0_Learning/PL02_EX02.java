package Start_Over_From_Day_0_Learning;

import java.util.Scanner;

public class PL02_EX02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variaveis

        double salario;

        // Ler salario
        System.out.println("Introduza um salario: ");
        salario = input.nextDouble();

        //Condição se salario até 15.000 Euro paga taxa de 20 %
        //Se não  paga taxa de 30 %

        if (salario <= 15000) {
            // Pagar taxa 20 %
            salario = salario * 0.20;


            System.out.println("A taxa a pagar para um salario até 15.000 Euros é de (20%) : " + salario + " Euros");

        } else{
            // Pagar taxa 30%
            salario = salario * 0.30;


            System.out.println(" A taxa a pagar para um salario superior a 15.000 Euros é de (30%): " + salario + " Euros ");

        }
        }


    }


