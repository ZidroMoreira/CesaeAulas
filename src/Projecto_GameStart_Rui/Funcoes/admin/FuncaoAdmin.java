package Projecto_GameStart_Rui.Funcoes.admin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static Projecto_GameStart_Rui.Funcoes.cliente.imprimecatalogo3.*;

public class FuncaoAdmin {

    public static void lerficheiroparaMatriz(){// Fazer função Para Imprimir Matriz
        //F07E09



    }


    public static void totalDeVendas(String path) throws FileNotFoundException {//2. Total de Vendas: Imprima quantas vendas foram executadas e o seu valor total.

        //Chama o Scanner e passa como argumento o file com um caminho
        Scanner totalVendas = new Scanner(new File(path));

        //Variaveis
        double total = 0,valor=0;

        //Enquanto Scanner tiver uma Proxima Linha,HasNextLine( Condição Booleana)
        while(totalVendas.hasNextLine()){

            // A linha é Guardada na Variavel Linha que é o cabeçalho
            String linha = totalVendas.nextLine();

            //Cria Um Vetor que a linha lida do Scanner
            String[]itensDaLinha = linha.split(";");

            //A String da linha na posiçao [5]= que sao os valores da venda que estao em string sao convertidos para inteiro
            valor = Double.parseDouble(itensDaLinha[5]);


            total+=valor;

        }
        System.out.println("O total das Vendas é : "+valor);


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


