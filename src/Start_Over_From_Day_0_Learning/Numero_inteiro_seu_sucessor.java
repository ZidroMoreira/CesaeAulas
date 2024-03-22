package Start_Over_From_Day_0_Learning;
/*Escreva um programa que leia um número inteiro e
imprima o seu antecessor e o seu sucessor*/

import java.util.Scanner;

public class Numero_inteiro_seu_sucessor {
    public static void main(String[] args) {

        int valor = 0, sucessor = 0;

        Scanner input = new Scanner(System.in);

        //Ler valor inteiro
        System.out.println("Insira um Numero Inteiro ");

        //Guarda o valor inserido na var valor
        valor = input.nextInt();

        //soma + 1
        sucessor = (valor + 1);

        //Escreve o valor inserido e o sucessor
        System.out.println("O valor inserido é : " + valor + " e o seu sucessor é : " + sucessor);

    }
}
