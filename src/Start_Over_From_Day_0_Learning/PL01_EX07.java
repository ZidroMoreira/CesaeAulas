package Start_Over_From_Day_0_Learning;
/*Escreva um programa que requisite ao utilizador o preço de 3 produtos adquiridos. Apresente o valor
a pagar, considerando que deverá ter um desconto de 10% sobre o total dos produtos.
*/
import java.util.Scanner;

public class PL01_EX07 {
    public static void main(String[] args) {
        int preco_1,preco_2,preco_3,total;
        double desconto;
        Scanner input = new Scanner(System.in);

        System.out.println("Insere o preço de 3 produtos adquiridos : ");
        preco_1= input.nextInt();
        preco_2= input.nextInt();
        preco_3= input.nextInt();
        desconto = (preco_1+preco_2+preco_3)*0.10;
        total= preco_1+preco_2+preco_3;

        System.out.println("O valor total dos produtos é : " +total+ " Euros \n E  um desconto de 10 % que é : "+desconto+" Euros");



    }
}
