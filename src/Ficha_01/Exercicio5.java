package Ficha_01;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        // Chama a Classe Scanner para introduzir valores "input"

        Scanner input = new Scanner(System.in);
        double num1, num2, num3, media, mediapond;

        System.out.println("Introduza 3 valores para calcular a média");

        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();

        //Calcula a média dos 3 valores inseridos

        media = (num1 + num2 + num3) / 3;

        //Calcula a média ponderada com os pesos correspondentes de 20% 30 % e 50 %

        mediapond = (num1 * 0.2) + (num2 * 0.3) + (num3 * 0.5);

        // O "\n" é para dar ENTER nos comentários ( tem de ser feito dentro de "" )

        System.out.println("A média dos três valores é :\n" + media);

        System.out.println("A Média Ponderada dos três valores é: \n " + mediapond);


    }
}
