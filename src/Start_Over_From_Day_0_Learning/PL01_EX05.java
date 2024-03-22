package Start_Over_From_Day_0_Learning;
/*Escreva um programa que determine a média aritmética de um conjunto de 3 valores introduzidos pelo
utilizador. Tendo em consideração os valores introduzidos, deverá também apresentar a média
ponderada considerando as seguintes ponderações: 20%, 30%, 50%*/
import java.util.Scanner;

public class PL01_EX05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declarar Variaveis

        int valor1,valor2,valor3,media;
        double mediaPond;

        //Escreve mensagem
        System.out.println("*********************Inicio********************\n");
        System.out.println("Insira 3 valores para calcular a Média Aritmética e a Média Ponderada\n");
        System.out.println("Insira os valores : ");
        valor1= input.nextInt();
        valor2= input.nextInt();
        valor3= input.nextInt();

        //Calculo da média Aritmética Soma de todos os valores dividindo pelo numero de vezes
        media=(valor1+valor2+valor3)/3;

        //Calculo da média Ponderada  Soma cada valor aplicando o pêso correspondente (20% = 0.2 | 30% = 0.3 | 50% = 0.5)

        mediaPond = ((valor1 * 0.2) + (valor2 * 0.3) + (valor3 * 0.5)) / (0.2 + 0.3 + 0.5);

        //Escreve Resultados

        System.out.println("O resultado da Média Aritemética : "+media+ "%\n O resultado da Média Ponderada é : "+ mediaPond+" %");

        System.out.println("*********************Fim********************");


    }
}
