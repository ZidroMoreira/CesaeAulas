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
    public static void imprimeFicheiroConsola(String path) throws FileNotFoundException {

        //Scanner  que os dados do arquivo file é passado como argumento
        Scanner in = new Scanner(new File(path));
        while (in.hasNextLine()) {

            String linha = in.nextLine();

            System.out.println(linha);
        }
        in.close();

        //Fecho do Scanner de " Leitura " nao obrigatório

    }
//APAGAR MAIN
    public static void main(String[] args) throws FileNotFoundException {
        String catalogo=null;

        imprimeFicheiroConsola("GameStart_Ficheiros/GameStart_Vendas.csv");



    }


}