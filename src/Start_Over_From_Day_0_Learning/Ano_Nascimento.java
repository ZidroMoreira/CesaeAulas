package Start_Over_From_Day_0_Learning;

import java.util.Scanner;

/*Escreva um programa que leia o ano de nascimento de
uma pessoa e imprima a idade que ela terá em 2026*/
public class Ano_Nascimento {

    public static void main(String[] args) {
        int ano_Nascimento=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduz o Ano de nascimento ");
        ano_Nascimento=input.nextInt();

        ano_Nascimento= 2026 - ano_Nascimento;

        System.out.println("A Idade em 2026 será:\t"+ano_Nascimento+" Anos");

    }
}
