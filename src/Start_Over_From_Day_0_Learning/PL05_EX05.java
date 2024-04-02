package Start_Over_From_Day_0_Learning;
/*Escreva um programa que lê um array de tamanho 10 e calcula a média dos elementos.*/

import java.util.Scanner;

public class PL05_EX05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //variaveis
        int tamanhoVetor = 10;
        double maior = 0, media = 0, soma = 0;

        //vetor do tipo int com 10 posiçoes
        int[] numInteiros = new int[tamanhoVetor];

        // Ciclo para inserir numeros no array
        for (int i = 0; i < numInteiros.length; i++) {
            System.out.println("Insira um número no array[" + i + "]: ");

            //Valor inserido ocupa o indice na posição atual no vetor
            numInteiros[i] = input.nextInt();
            //Faz a soma com o indice atual do vetor
            soma += numInteiros[i];

        }
        //Calculo da média
        media = soma / tamanhoVetor;
        System.out.println("A média atirmética dos valores inseridos é :" + media);

    }
}