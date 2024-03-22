package Start_Over_From_Day_0_Learning;
/*Escreva um programa para calcular a área da circunferência. As dimensões devem ser requisitadas ao
utilizador.*/

import java.util.Scanner;

public class PL01_EX04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar Variaveis

        double area = 0, pi = 3.14159, raio;


        //Escreve mensagem
        System.out.println("*********************Inicio********************\n");
        System.out.println("Calcular a Circunferencia\n");
        System.out.println("Insere o valor do raio da circunferencia : ");
        raio= input.nextDouble();

        // Calculo da area
        area=pi*raio*raio;

        //Escreve resultado

        System.out.println("A Area da Circunferencia é : \n"+ area);

        System.out.println("*********************Fim********************");

    }
}
