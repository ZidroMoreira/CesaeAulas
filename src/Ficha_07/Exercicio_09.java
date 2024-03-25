package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* Escreva um programa que leia um ficheiro CSV contendo informações de músicas (nome, artista, género,
duração) para uma matriz.*/
public class Exercicio_09 {

    public static String genero_Musica(String path) throws FileNotFoundException {
        int genero;

        Scanner leitura = new Scanner(new File(path));

        String linha = leitura.nextLine();

        while (leitura.hasNextLine()) {
            String[] linhaDividida = linha.split(",");

            linha = leitura.nextLine();


            return linha;
        }


        return linha;
    }
}

