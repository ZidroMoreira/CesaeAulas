package Start_Over_From_Day_0_Learning;

import java.util.Scanner;
/* Escreva um programa que lê um array de tamanho 10 e verifica se os elementos estão em ordem crescente. */
public class PL05_EX06 {
    public static void main(String[] args) {
        //variaveis
        int tamanhoVetor = 10, contador = 1;
        boolean crescente = true;

        Scanner input = new Scanner(System.in);
        double[] arrayNumeros = new double[tamanhoVetor];

        //Insere valores no Array
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.println("Insira o " + contador++ + "º valor no array: ");
            arrayNumeros[i] = input.nextDouble();
        }

        //Faz a leitura dos valores inseridos do Array
        for (int i = 1; i < arrayNumeros.length; i++) {

            //Compara o valor do indice atual com o anterior pergunta (se é menor que o anterior )
            if (arrayNumeros[i] < arrayNumeros[i - 1]) {
                //Nao crescente se a o valor do indice atual for MENOR que o valor do indice anterior
                crescente = false;

            }

        }

        //Se retorno da var booleana crescente for True
        if (crescente) {
            System.out.println("Valores estão Crescentes");

        //Se retorno da var booleana crescente for False
        } else {
            System.out.println("Nao Crescente");
        }

    }
}




