package Start_Over_From_Day_0_Learning;
/*Escreva um programa que calcule e apresente a área e o perímetro de um retângulo. As dimensões
devem ser requisitadas ao utilizador.*/

import java.util.Scanner;

public class PL01_EX03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar Variaveis

        int perimetro, altura, comprimento, area;


        System.out.println("*********************Inicio********************");
        //Escreve mensagem
        System.out.println("Insira os valores da Altura e do Comprimento para calcular o Perímetro e a Area \n");

        System.out.println("Altura: ");
        altura = input.nextInt();

        System.out.println("Comprimento: ");
        comprimento = input.nextInt();

        //Soma de todos os lados
        perimetro = (comprimento + altura) * 2;

        //Multiplicação do comprimento e a altura
        area = (comprimento * altura);

        //Imprime resultados

        System.out.println("O perimetro do retangulo : \n " + perimetro + "\n Area do Retangulo :\n" + area);

        System.out.println("*********************Fim********************");

    }
}
