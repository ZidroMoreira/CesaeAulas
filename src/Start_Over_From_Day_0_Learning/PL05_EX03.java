package Start_Over_From_Day_0_Learning;

import java.util.Scanner;

/*3. Escreva um programa que lê um array de tamanho 10 e encontra o maior elemento. */
public class PL05_EX03 {
    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //variaveis
        int tamanhoVetor = 10,posicao=0;
        double maior=0;

        //vetor do tipo int com 10 posiçoes
        int[] numInteiros = new int[tamanhoVetor];

        // Ciclo para inserir numeros no array
        for (int i = 0; i < numInteiros.length; i++) {
            System.out.println("Insira um número no array[" + i + "]: ");

            numInteiros[i] = input.nextInt();

            if (numInteiros[i] > maior){

                maior=numInteiros[i];
                posicao=i;


            }

        }
        System.out.println("O maior elemento é :"+maior+"\nQue se Encontra na posição do vetor: "+posicao);
    }
}