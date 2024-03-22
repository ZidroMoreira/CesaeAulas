package Ficha_01;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int base, altura, area, perimetro;

        System.out.println("Insira o comprimento: ");
        base = input.nextInt();

        System.out.println("Insira a Altura: ");
        altura = input.nextInt();

        area = base * altura;
        perimetro = 2 * (base + altura);

        System.out.println(" O resultado da area é :" + area + ". O resultado de Perimetro é :" + perimetro);


    }
}
