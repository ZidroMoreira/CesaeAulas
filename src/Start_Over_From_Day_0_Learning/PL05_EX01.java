package Start_Over_From_Day_0_Learning;

import java.lang.management.MonitorInfo;
import java.util.Scanner;
/* Implemente um programa que permita adicionar 10 números inteiros a um array e que os imprima pela ordem
de inserção. Exemplo de execução: */
public class PL05_EX01 {
    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //variaveis
        int tamanhoVetor = 10;

        //vetor do tipo int com 10 posiçoes
        int []numInteiros = new int[tamanhoVetor];

        // Ciclo para inserir numeros no array
       for(int i =0;i <numInteiros.length;i++){
           System.out.println("Insira um número no array["+i+"]: ");

           numInteiros[i]= input.nextInt();


       }

        for(int i =0;i < numInteiros.length;i++){
            System.out.println("Os valores sao "+numInteiros[i]);




        }
    }
}
