package Start_Over_From_Day_0_Learning;

import java.util.Scanner;

/* Implemente um programa que, após pedir ao utilizador o saldo da conta bancária e montante a creditar/debitar
(montante positivo ou negativo, respetivamente), apresente se a operação é válida, ou seja, se o saldo final se
mantém positivo depois da operação. Finalmente, mostre o novo saldo.
*/
public class PL02_EX11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declarar variaveis

        int saldo, movimento, saldoAposMovimento;

        //Ler Saldo
        System.out.println("Introduza saldo da conta bancaria : ");
        saldo = input.nextInt();

        //Ler Movimento
        System.out.println("Introduza o saldo a movimentar : ");
        movimento = input.nextInt();


        saldoAposMovimento = saldo + movimento;

        if (saldoAposMovimento >= 0) {

            saldo = saldoAposMovimento;

        } else
System.out.println("Saldo Insuficiente");

        System.out.println("\n Saldo Atual " +saldo);

    }
}
