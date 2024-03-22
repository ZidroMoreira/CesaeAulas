package Start_Over_From_Day_0_Learning;
/*Leia dois números inteiros e escreva na consola o maior deles.
 */

import java.util.Scanner;

public class PL02_EX01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Variaveis
        int num1, num2;

        //Ler num1,num2
        System.out.println("Introduza um numero");
        num1= input.nextInt();
        System.out.println("Introduza o segundo numero");
        num2= input.nextInt();

       // Mostrar o maior
        if (num1 > num2) {

            System.out.println("O numero maior é o : "+num1);

        }else {
            System.out.println("O numero maior é o : "+num2);

        }
    }
}
