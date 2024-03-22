package Ficha_01;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double preCo1, preCo2, preCo3, total, totalSoma, calculoDesconto, desconto = 0.1;

        System.out.println("Introduz os preços de 3 artigos");
        preCo1 = input.nextDouble();
        preCo2 = input.nextDouble();
        preCo3 = input.nextDouble();

        //Total da soma do valor dos artigos, guardado na variavel totalSoma
        totalSoma = preCo1 + preCo2 + preCo3;

        //Total da soma multiplicando por desconto de 0.1 (10%), guardado na variavel calculoDesconto
        calculoDesconto = totalSoma * desconto;

        // Total com o desconto , guardado na variavel total
        total = totalSoma - calculoDesconto;


        //Chama o valor da variavel total

        System.out.println("O preço total com 10 % de desconto é " + total);


    }
}
