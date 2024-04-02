package Projecto_GameStart_Rui.Funcoes.admin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TotalLucroPercentagemCategoria {
    public static void main(String[] args) throws FileNotFoundException {

        //Variaveis
        int opcao = 0;
        String linha = "";
        int i = 0, margemLucro = 0, numCategorias = 16;


        //Scanner
        Scanner input = new Scanner(System.in);

        String path = "GameStart_Ficheiros/GameStart_Categorias.csv";
        Scanner sc = new Scanner(new File(path));
        //Consome Linha Cabeçalho
        sc.nextLine();

        String[] categorias = new String[numCategorias];
        Double[] margem = new Double[numCategorias];


        while (sc.hasNextLine()) {

            linha = sc.nextLine();

            String[] itensLinha = linha.split(";");

            categorias[i] = itensLinha[0];
            margem[i] = Double.parseDouble(itensLinha[1]);

            System.out.print(+i + 1 + ".");
            System.out.println(categorias[i]);
            i++;

        }
        System.out.println(+i + 1 + ".Voltar ao menu anterior");
        System.out.println("Insira uma Opção: ");

        opcao = input.nextInt();

        if (opcao > 0 && opcao < numCategorias + 1) {

            System.out.println(categorias[opcao-1]);
            System.out.println(margem[opcao-1]);

        } else if (opcao==numCategorias+1) {


        }


    }
}