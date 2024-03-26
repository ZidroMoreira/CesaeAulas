package Projecto_GameStart_Rui.Funcoes.cliente;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class imprimecatalogo3 {
    /**
     * Função Ler Ficheiro Imprimir titulos dos jogos
     *
     * @param path ficheiro catalogo GameStart_Vendas.csv
     * @return
     * @throws FileNotFoundException
     */

    // Metodo Public sem retorno ( void ) nome do metodo ( imprimeCatalogo) e o String path é passado por parametro
    public static String imprimeCatalogo(String path) throws FileNotFoundException {

        //Scanner Input que os dados do arquivo file é passado como argumento
        Scanner in = new Scanner(new File(path));

        String linha = in.nextLine(); // linha cabeçalho levando o " Cursor | " para o fim da linha do cabeçalho

        String titulosJogo = null;
        while (in.hasNextLine()) {
            linha = in.nextLine();

            //Vetor para Dividir a linha por colunas usando o Split com o delimitador ;
            String[] colunas = linha.split(";");

            //Identificar a coluna a imprimir contando da coluna 0 é na posição 4 id cabeçalho (Jogo) no ficheiro .csv

            titulosJogo = colunas[4];


            //EM VEZ DE VETOR PASSAR PARA MATRIZ
        }
        //Fecho do Scanner de " Leitura " nao obrigatório

        return titulosJogo;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String catalogo=null;

        catalogo = imprimeCatalogo("GameStart_Ficheiros/GameStart_Vendas.csv");

        System.out.println(catalogo);


    }


}