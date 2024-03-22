package Start_Over_From_Day_0_Learning;
/*Escreva um programa que leia dois valores numéricos e apresente o maior e depois o menor.
*/
import java.util.Scanner;

public class PL02_EX06 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //ler variaveis

        int num1, num2;

        System.out.println("Introduza um numero: ");
        num1 = input.nextInt();
        System.out.println("Introduza um numero: ");
        num2 = input.nextInt();
        System.out.println("\n");

        if (num1 > num2) {
            System.out.println(+num1 + " " + num2);

        } else {
            System.out.println(+num2 + "\t\t" + num1);
        }
    }
}