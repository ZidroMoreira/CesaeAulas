package Start_Over_From_Day_0_Learning;

import java.util.Scanner;

public class PL02_EX04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao;

        System.out.println("Introduza o lugar na corrida ");
        opcao= input.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("Ganhou 10 pontos");
                break;
            case 2:
                System.out.println("Ganhou 8 pontos");
                break;

            case 3:
                System.out.println("ganhou 6 pontos ");
                break;

            case 4:
                System.out.println("ganhou 5 pontos ");
                break;

            case 5:
                System.out.println("ganhou 4 pontos ");
                break;
            case 6:
                System.out.println("ganhou 3 pontos ");
                break;
            case 7:
                System.out.println("ganhou 2 pontos ");
                break;
            case 8:
                System.out.println("ganhou 1 pontos ");
                break;

           default:
               System.out.println("Não ganhou pontos");
        }

    }
}
