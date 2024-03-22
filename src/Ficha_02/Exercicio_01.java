package Ficha_02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio_01 {


    public static void main(String[] args) {

        //Importar Scanner

        Scanner input = new Scanner(System.in);


        //Declarar Variaveis
        int num1, num2;

        //ler Num1
        System.out.print("Insira um número");
        num1 = input.nextInt();

        //Ler Num2
        System.out.print("INsira um número");
        num2 = input.nextInt();


        //Apresentar a maior
        if (num1 > num2) {
            System.out.println("Maior Num " + num1);

        } else {

            if (num2 > num1) {

                System.out.println("Maior Num " + num2);
            } else {

                System.out.println("São Iguais");
            }

        }
    }
}