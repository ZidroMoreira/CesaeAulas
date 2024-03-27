package Projecto_GameStart_Rui.Funcoes.admin;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Projecto_GameStart_Rui.Funcoes.cliente.imprimecatalogo3.*;

public class FuncaoAdmin {

    public static void lerficheiroparaMatriz(){// Fazer função Para Imprimir Matriz
        //F07E09



    }


    public static void totalDeVendas(){//2. Total de Vendas: Imprima quantas vendas foram executadas e o seu valor total.



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
    }//Função para Consulta de Ficheiros

}


