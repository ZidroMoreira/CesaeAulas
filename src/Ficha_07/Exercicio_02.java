package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
/*Escreva um programa que crie um ficheiro de texto e escreva nele uma mensagem.*/
public class Exercicio_02 {


    public static void criarFicheiroTexto(String path, String mensagem) throws FileNotFoundException {

        PrintWriter maquinaEscrever = new PrintWriter(new File(path));
        maquinaEscrever.println(mensagem);
        maquinaEscrever.close();
    }

    public static void main(String[] args) throws FileNotFoundException {


        try{
            criarFicheiroTexto("Ficheiros/exercicio_02.txt","Teste de Escrita em Ficheiro ");

        }catch(FileNotFoundException e ){

        }
    }
}


