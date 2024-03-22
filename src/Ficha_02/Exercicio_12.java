package Ficha_02;

import java.util.Scanner;

public class Exercicio_12 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        //Declarar Variaveis
        int horas, minutos;

        //Ler Horas
        System.out.println("Insira as horas de 00-23");

        horas = input.nextInt();

        //Ler Minutos
        System.out.println("Insira os Minutos de (00 - 59");
        minutos = input.nextInt();

        //

        if (horas <= 11) { // AM
            System.out.println(horas + minutos + "AM");

        } else {
            //PM
        if (horas!=12) {

        }
            horas = horas - 12;
            System.out.println(horas+ ":"+minutos + "PM" );
        }


    }
}
