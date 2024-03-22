package Ficha_07;
/*Escreva um programa que leia um ficheiro de texto contendo nomes e idades separados por vírgulas e imprima o nome da pessoa mais velha na consola.*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio_06 {

    /**
     * Metodo que avalia a idade da pessoa mais velha
     * @param path Caminho
     * @throws FileNotFoundException
     */
    public static void nomesIdades (String path) throws FileNotFoundException {

        Scanner leitor = new Scanner(new File(path));
        int idd,num = 0,iddMaior = 0;
        String nomeMaior = null,nome = null;

        //Enquanto Scanner tiver uma Proxima Linha,HasNextLine( Condição Booleana)
        while(leitor.hasNextLine()){


            // A linha é Guardada na Variavel String
            String linha = leitor.nextLine();

            //Cria Um Vetor que a linha lida do Scanner
            String[]itensDaLinha = linha.split(",");

            //A String da Linha atual[0]= que sao as idades que estao em string sao convertidos para inteiro
            idd = Integer.parseInt(itensDaLinha[1]);
            // Os Itens da Linha na posiçao zero passa a ser nome
            nome = (itensDaLinha[0]);

            //Se idd > idMaior=0
            //iddMaior toma o valor de idd
            if (idd > iddMaior){
                iddMaior= idd;
                nomeMaior=nome;
            }


        }
        leitor.close();
        System.out.println();
        System.out.println("A idade da  pessoa mais velha : " + iddMaior+" Anos\n Nome: "+nomeMaior);


    }

    public static void main(String[] args) throws FileNotFoundException {
        nomesIdades("Ficheiros/Exercicio_06.txt");


    }
}
