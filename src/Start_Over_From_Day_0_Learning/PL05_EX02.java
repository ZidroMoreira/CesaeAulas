package Start_Over_From_Day_0_Learning;

import java.util.Scanner;

public class PL05_EX02 {
    /* Implemente um programa que permita adicionar comissões mensais a um array de tamanho 12 (uma posição
para cada mês) e calcular o seu total anual. */

    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        //Variaveis numero de meses e contador para a mensagem apresentada
        int totalMeses = 12, contador = 1;

        double somaMeses = 0;
        //Vetor do tipo real ( casas decimais ) com o comprimento atribuido pela variavel totalMeses
        double[] meses = new double[totalMeses];

        for (int i = 0; i < meses.length; i++) {

            System.out.println("Insira as comissões mensais do " + contador++ + "ºMês: ");

            //Guarda o Valor de input na posição atual do indice do vetor
            meses[i] = input.nextInt();

            //Faz a soma da posiçao atual do indice e guarda na var somaMeses
            somaMeses += meses[i];


        }
        //Imprime resultado
        System.out.println("Total das Comissoes Mensais é : " + somaMeses + " Euros");
    }
}
