package Start_Over_From_Day_0_Learning;

import java.util.Scanner;

/*Escreva um programa que leia dois valores inteiros e os armazene na variáveis valor1 e valor2. Permute
o valor das variáveis e apresente o resultado. De seguida, verifique se consegue efetuar esta troca sem
criar variáveis adicionais
*/
public class PL01_EX06 {
    public static void main(String[] args) {

        //Importar Scanner
        Scanner input = new Scanner(System.in);

        int valor1,valor2;

        System.out.println("Insira dois valores: ");
        valor1= input.nextInt();//1
        valor2= input.nextInt();//2
        valor1=valor1+valor2;  //3 = 1 + 2
        valor2=valor1-valor2; // 1 = 3 - 2
        valor1=valor1-valor2;  //2 = 3 - 1

        System.out.println("O numeros invertidos da ordem sao: " + valor1+" e "+valor2);

    }

}
