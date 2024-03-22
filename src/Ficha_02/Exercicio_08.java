package Ficha_02;

import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {

        //Importar Scanner
        Scanner input = new Scanner(System.in);

        //Nota Media Ponderada Nota1 = 25% | Nota 2 = 35 %| Nota 3 = 40 %

        double mediaPond, nota1, nota2, nota3, ponD1 = 0.25, ponD2 = 0.35, ponD3 = 0.40;


        //Ler nota 1
        System.out.println("Insira a Primeira Nota ");
        nota1 = input.nextDouble();

        //Ler nota 2
        System.out.println("Insira a Segunda Nota ");
        nota2 = input.nextDouble();

        //Ler nota 3

        System.out.println("Insira a Terceira Nota ");
        nota3 = input.nextDouble();

        mediaPond = (nota1 * ponD1 + nota2 * ponD2 + nota3 * ponD3) / (ponD1 + ponD2 + ponD3);

        System.out.println("A média Ponderada é : " + mediaPond);

        if (mediaPond >= 9.5) { //Aprovada

            System.out.println("Aprovado , Parabens");

        } else {
            System.out.println("Reprovado");
        }
        System.out.println("**********Fim do Programa**********");

    }
}
