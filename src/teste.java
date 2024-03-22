import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduza um número inteiro positivo N: ");
        int N = input.nextInt();
        int soma = 0;
        for (int i = 0; i < N; i++) {


                soma += i;


            }
            System.out.println("" + N + "" + soma);
        }
    }