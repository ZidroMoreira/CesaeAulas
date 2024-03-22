package Start_Over_From_Day_0_Learning;
/*Escreva um programa que requisite dois valores. O programa deverá utilizá-los como operandos para
as seguintes operações aritméticas: soma, subtração, multiplicação e divisão. Apresente o resultado
das operações e teste os resultados obtidos com vários casos*/

import java.util.Scanner;

public class PL01_EX02 {
    public static void main(String[] args) {

        //Declarar Variaveis

        Double num1, num2, total;

        Scanner input = new Scanner(System.in);

        System.out.println("*******************Inicio*****************");

        //Ler valores introduzidos
        System.out.println("Introduza dois valores para realizar a operação :");

        num1 = input.nextDouble();
        num2 = input.nextDouble();


        //Imprime mensagem com os resultados
        System.out.println("O resultados das operaçoes são: ");

        //Soma
        total = num1 + num2;
        System.out.println("Soma : " + total);

        //Subtração
        total = num1 - num2;
        System.out.println("Subtração : " + total);

        //Multiplicaçao
        total = num1 * num2;
        System.out.println("Multiplicação : " + total);

        //Divisão
        total = num1 / num2;
        System.out.println("Divisão : " + total);


        System.out.println("*******************Fim*****************");


    }


}
