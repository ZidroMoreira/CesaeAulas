package Ficha_03;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar variaveis

        int num = 0, cont = 1;
        String msg;

        // Ler Valor 1
        System.out.println("Introduza um número: ");
        num = input.nextInt();

        //Limpeza do Buffer  - Apanhar o Enter

        input.nextLine();

        // Ler mensagem ( input.next = string )
        System.out.println("Introduza uma mensagem: ");
        msg = input.nextLine();

        // Enquanto contador < ou = que o valor num

            while (cont <= num) {

            //print mensagem e incrementa +1 no contador
            //repetindo até o contador <= que o num introduzido

            System.out.println(" " + msg);
            //cont = cont +1 ;

            cont++;


        }


    }
}
