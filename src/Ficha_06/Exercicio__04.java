package Ficha_06;

import java.util.Scanner;

import static Ficha_06.Exercicio__03.par;

public class Exercicio__04 {
    public static void main(String[] args) {
        //Variaveis
        int num,opcao;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um numero: ");
        num= input.nextInt();


        do{
            //Apresentar opçoes
            System.out.println("1. Par ou Impar");
            System.out.println("2. Positivo ou Negativo");
            System.out.println("3. Primo ou Nao Primo ");
            System.out.println("4. Perfeito ou Nao Perfeito");
            System.out.println("5. Triangular ou Não Triangular" );
            System.out.println("6. Trocar de Numero");
            System.out.println("7. Sair");
            System.out.println("Insira a Opção com o numero da lista: ");
            opcao=input.nextInt();

            switch (opcao){
                case 1:// par ou impar
                    if (par(num)) {
                        System.out.println("Numero Par");
                    }else{
                        System.out.println("Impar");
                                            }
                    break;
                case 2:// positivo ou negativo

            }


        }while (opcao!=7);
    }

}
