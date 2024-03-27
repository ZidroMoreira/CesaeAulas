package Projecto_GameStart_Rui.Funcoes.admin;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Projecto_GameStart_Rui.Funcoes.admin.FuncaoAdmin.*;


public class MenuAdmin {

    public static void menuAdministrador() throws FileNotFoundException {

        int opcao = 0;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("""
                                    
                    ************Menu Administrador************
                    1.Consulta de Ficheiros
                    2.Total de Vendas
                    3.Total de Lucro
                    4.Pesquisa de Cliente
                    5.Jogo mais Caro
                    6.Melhores Clientes 
                    7.Melhor Categoria
                    8.Pesquisa Vendas
                    9.Top 5 Jogos
                    10.Bottom 5 Jogos
                    11.Voltar ao Menu Principal
                                   
                    """);
            System.out.println("Escolha Uma Das Opções: ");
            opcao = input.nextInt();

            switch (opcao) {

                case 1: //1.Consulta de Ficheiros

                    consultarFicheiros();

                    break;


                case 2: //2.Total de Vendas
                    totalDeVendas("GameStart_Ficheiros/GameStart_Vendas.csv");

                    break;


                case 3: //2.Total de Lucro



                    break;



            }


        } while (opcao != 11);

    }
}
