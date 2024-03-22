package Ficha_01;

import java.util.Scanner;

public class Exercicio_08 {

    public static void main(String[] args) {

        int minuto = 0, totalMinutos=0, segundos = 0, totalSegundos=0, totalHoras=0, restantesMinutos=0, restanteSegundos=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduza minutos da musica 1 ");
        totalMinutos += input.nextInt();

        System.out.println("Introduza segundos da musica 1 ");
        totalSegundos += input.nextInt();

        System.out.println("Introduza minutos da musica 2");
        totalMinutos += input.nextInt();

        System.out.println("Introduza segundos da musica 2");
        totalSegundos += input.nextInt();

        System.out.println("Introduza minutos da musica 3");
        totalMinutos += input.nextInt();

        System.out.println("Introduza segundos da musica 3");
        totalSegundos += input.nextInt();

        System.out.println("Introduza minutos da musica 4");
        totalMinutos += input.nextInt();

        System.out.println("Introduza segundos da musica 4");
        totalSegundos += input.nextInt();

        System.out.println("Introduza minutos da musica 5");
        totalMinutos += input.nextInt();

        System.out.println("Introduza segundos da musica 5");
        totalSegundos += input.nextInt();



        System.out.println("O album contem : " +totalHoras+" Horas "+restantesMinutos+" Minutos " +restanteSegundos+" Segundos " );

    }


}
