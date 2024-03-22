package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Escreva um programa que leia um ficheiro de texto contendo números inteiros separados por espaço e
calcule a soma desses números.*/
public class Exercicio_05 {

    public static int calcularTotalnumInteiro(String path) throws FileNotFoundException {

        Scanner leitorNumeroInt = new Scanner(new File(path));
        int sum = 0;
        //Enquanto no Scanner tiver um proximo inteiro
        while (leitorNumeroInt.hasNextInt()) {

            //Numero inteiro guardado na var int
            int numAtual = leitorNumeroInt.nextInt();

            sum += numAtual;

        }

        //Retorna Valor da soma para fora da " Função"
        return sum;
    }

    public static void main(String[] args) throws FileNotFoundException {

        //Temos de Iniciar a variavel global para local

        int sum;


        sum = calcularTotalnumInteiro("Ficheiros/exercicio_05_31.txt");

        System.out.println("Total da Soma " + sum);


    }
}

