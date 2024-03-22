package Ficha_04;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Opção de menu desejada \n 1.Criar \n 2.Atualizar \n 3.Eliminar \n 4.Sair");
            opcao = input.nextInt();

            switch (opcao) {

                case (1):
                    System.out.println("***1.Criar***");
                    break;

                case (2):
                    System.out.println("***2.Atualizar***");
                    break;

                case (3):
                    System.out.println("***3.Eliminar***");
                    break;

                case (4):
                    System.out.println("***4.Sair***");
                    break;

                default:
                    System.out.println("Opção incorrecta \n coloque outra opção");
            }
        } while (opcao != 4);
    }
}
