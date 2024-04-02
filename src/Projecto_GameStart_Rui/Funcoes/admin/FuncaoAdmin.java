package Projecto_GameStart_Rui.Funcoes.admin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static Projecto_GameStart_Rui.Funcoes.cliente.imprimecatalogo3.*;

public class FuncaoAdmin {

    public static void lerficheiroparaMatriz() {// Fazer função Para Imprimir Matriz
        //F07E09


    }

    /***
     * Função que Calcula o Total de vendas
     * @param path
     * @throws FileNotFoundException
     */
    public static void totalDeVendas(String path) throws FileNotFoundException {//2. Total de Vendas: Imprima quantas vendas foram executadas e o seu valor total.

        //Chama o Scanner e passa como argumento o file com um caminho
        Scanner sc = new Scanner(new File(path));

        //Variaveis
        double totalVendas = 0, valor = 0;
        String linha = "";

        //Consome a linha do cabeçalho
        sc.nextLine();

        //Enquanto Scanner tiver uma Proxima Linha,HasNextLine( Condição Booleana)
        while (sc.hasNextLine()) {

            linha = sc.nextLine();

            //Cria Um Vetor com a linha lida do Scanner
            String[] itensDaLinha = linha.split(";");

            //A String da linha na posiçao [5]= que sao os valores da venda que estao em string sao convertidos para inteiro
            valor = Double.parseDouble(itensDaLinha[5]);


            totalVendas += valor;

        }
        System.out.println("O Total das Vendas é : " + totalVendas + " Euros");


    }

    public static void totalLucro(String path) throws FileNotFoundException {

        //Variaveis
        String linha = "";
        double valor;

        //Chama Scanner em que é passado por um ficheiro por caminho
        Scanner fileCategorias = new Scanner(new File(path));

        //Avança a linha do cabeçalho
        fileCategorias.nextLine();

        //Enquanto Scanner (sc) tem uma proxima linha
        while (fileCategorias.hasNextLine()) {
            String[] itensDalinha = linha.split(";");
            String[] categoria = new String[]{itensDalinha[3]};


        }


    }


    public static void consultarFicheiros() throws FileNotFoundException {

        int opcao;
        Scanner input = new Scanner(System.in);


        do {
            System.out.println("""
                        ********************Consulta de Ficheiros *************
                        Escolha uma das Seguintes Opçoes:
                        1.Vendas
                        2.Clientes
                        3.Categorias
                        4.Voltar Menu Anterior
                    """);
            opcao = input.nextInt();
            switch (opcao) {

                case 1: //Vendas
                    imprimeFicheiroConsola("GameStart_Ficheiros/GameStart_Vendas.csv");
                    break;

                case 2://Clientes

                    imprimeFicheiroConsola("GameStart_Ficheiros/GameStart_Clientes.csv");

                    break;
                case 3://Categorias

                    imprimeFicheiroConsola("GameStart_Ficheiros/GameStart_Categorias.csv");

                    break;
                default:
                    System.out.println("Opção Invalida!");

            }

        } while (opcao != 4);
    }

}


