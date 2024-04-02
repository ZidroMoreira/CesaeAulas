package Projecto_GameStart_Rui.Funcoes.admin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TotalPercentagemCategoriaFinal {
    public static void main(String[] args) throws FileNotFoundException {

        //Variaveis
        int opcao = 0;
        String linha = "";
        int i = 0, margemLucro = 0, numCategorias = 16, numVendas = 175;


        //Scanner
        Scanner input = new Scanner(System.in);

        //Importação do Ficheiro Categorias
        String ficheiroCategorias = "GameStart_Ficheiros/GameStart_Categorias.csv";
        //Scanner que vai ler o ficheiroCategorias
        Scanner sccategoria = new Scanner(new File(ficheiroCategorias));


        //Consome Linha Cabeçalho
        sccategoria.nextLine();

        //Vetor tipo String Categorias para ficheiro GameStart_Categorias.csv
        // para alvergar a posição 0 correspondente cabeçalho de titulo "nomeCategoria" do csv
        String[] categorias = new String[numCategorias];

        //Vetor para guardar a posição 1 correspondente ao cabeçalho de titulo " percentagemMargem"
        Double[] margem = new Double[numCategorias];

        //Print
        System.out.println("***************Total Lucro*****************");
        System.out.print("Categorias           ");
        System.out.print("Margem %       ");
        System.out.println("    Total Margem de Lucro Categoria");

        while (sccategoria.hasNextLine()) {
            //Consome a linha do cabeçalho
            linha = sccategoria.nextLine();

            //Divide a var linha pelo delimitador ";" para um vetor itensLinha
            String[] itensLinha = linha.split(";");

            //Atribui o conteudo do vetor "itens da linha" na posiçao atual [Ex:i=0]
            categorias[i] = itensLinha[0];

            //Atribui o conteudo itensLinha na posição 1(percentagemMargem) convertido de String para num real
            //Para o vetor categorias na posição [Ex:i=0]
            margem[i] = Double.parseDouble(itensLinha[1]);

            //System.out.print(+i + 1 + ".");
            System.out.println(categorias[i] + " " + margem[i] + "%");

            i++;

        }

        //Importação do ficheiro vendas
        String ficheiroVendas = "GameStart_Ficheiros/GameStart_Vendas.csv";

        Scanner scVendas = new Scanner(new File(ficheiroVendas));
        //Array para o ficheiro GameStart Vendas

        String[] vendas = new String[numVendas];

        while (scVendas.hasNextLine()) {
            //Consome a linha do cabeçalho
            linha = scVendas.nextLine();
            //Apos consumida a linha do cabeçalho,
            //Lê a proxima linha e divide pelo delimitador ";"
            //Preechendo o vetor
            String[] itensLinha = linha.split(";");

            vendas[i] = itensLinha[5];

            i++;


        }
        for (int j= 0; j < vendas.length; j++) {
            if(categorias[i].equals(vendas[i])){

                System.out.println(categorias[i]+vendas[i]);
            }


        }
    }


}