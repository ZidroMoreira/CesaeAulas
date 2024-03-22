package Start_Over_From_Day_0_Learning;
/*Escreva um programa que faça a soma de dois números
introduzidos pelo utilizador e apresente o resultado
dessa soma*/
import java.util.Scanner;

public class Subtraia_dois_numeros_pelo_utilizador_e_multiplique_resultado_pelo_1º_numero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // Declarar variaveis

        int num1,num2,total;

        System.out.println("Insira valores para executar uma subtração ");
        num1=input.nextInt();
        num2=input.nextInt();

        // Subtração

        total=num1-num2;

        //Usa do Total da Subtração e multiplica pelo num1

        total=total*num1;


        System.out.println(" O resultado da operação é : "+ total);


    }
}
