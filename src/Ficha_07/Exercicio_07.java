package Ficha_07;
/*Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima o número de linhas e o
número de palavras presentes nesse ficheiro*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio_07 {
    /**
     * Função Que Conta Num Linhas / Palavras em Ficheiro .txt
     *
     * @param path Ficheiros/exercicio_07.txt
     */
    public static int contarLinhas(String path) throws FileNotFoundException {

        Scanner sc = new Scanner(new File(path));


        int contaLinhas = 0;


        while (sc.hasNextLine()) {

            String linha = sc.nextLine();
            contaLinhas++;        }

        return contaLinhas;
    }

    public static int contarPalavras(String path) throws FileNotFoundException {
        int contaPalavras = 0;

        Scanner sc = new Scanner(new File(path));
        while (sc.hasNext()) {
            String palavra = sc.next();

            contaPalavras++;

        }

        return contaPalavras;
    }


    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(contarPalavras("Ficheiros/exercicio_07.txt"));
        System.out.println(contarLinhas("Ficheiros/exercicio_07.txt"));




    }

}


