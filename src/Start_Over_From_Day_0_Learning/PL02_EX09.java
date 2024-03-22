package Start_Over_From_Day_0_Learning;
/*Crie um programa que mostre o menor de três números inteiros lidos.
 */

import java.util.Scanner;

public class PL02_EX09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //variaveis

        int num1, num2, num3, menor;

        //mensagem

        System.out.println("Insira o 1º valor");
        num1 = input.nextInt();


        System.out.println("Insira o 2º valor");
        num2 = input.nextInt();

        System.out.println("Insira o 3º valor");
        num3 = input.nextInt();

        // Guardamos na "gaveta" menor o num1 para comparação na condição do if
        menor = num1;

        // Se num2 < menor=num1 , menor passa a ser o num2 com comparação com o num1
        if (num2 < menor) {

            menor = num2;

        }
        // Se num3 < menor( num2 ) , menor = num3
        if (num3 < menor) {

            menor = num3;

        }

        // Escreve Menor
        System.out.println(menor);
    }


}