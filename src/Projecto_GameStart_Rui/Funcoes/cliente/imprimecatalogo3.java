package Projecto_GameStart_Rui.Funcoes.cliente;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class imprimecatalogo3 {

    public static void imprimeCatalogo(String path) throws FileNotFoundException {

        Scanner in = new Scanner(new File(path));

        String linha = in.nextLine(); // linha cabeçalho

        while (in.hasNextLine()) {
            linha = in.nextLine();
            System.out.println(linha);
        }

        in.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        imprimeCatalogo("GameStart_Vendas.csv");
    }
}