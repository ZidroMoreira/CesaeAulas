package Ficha_04;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int player1 = 0, palpite = 0, tentativas = 0;

        System.out.println("|Jogador 1| Insira um valor de 0 a 100\n");
        player1 = input.nextInt();

        do {

            System.out.println("|Jogador 2 | Insira o seu palpite\n");
            palpite = input.nextInt();
            tentativas++;

            if (palpite > player1) {
                System.out.println("Está Muito Alto!");
            }
            if (palpite < player1) {
                System.out.println("Está muito Baixo");
            }


        } while (palpite != player1);

        System.out.println("Adivinhaste parabens tiveste que tentar " + tentativas + " vezes para acertar!!");

    }


}
