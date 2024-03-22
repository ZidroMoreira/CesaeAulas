package Ficha_01;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pi=3.14, raio, area;


        System.out.println("Insira o valor do raio da circunferencia");
        raio = input.nextDouble();

        area=pi*(raio*raio);

        System.out.println("O Valor da Area é : "+area);

    }
}
