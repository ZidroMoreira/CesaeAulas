package Projecto_GameStart_Rui.Funcoes.cliente;
import static Projecto_GameStart_Rui.Funcoes.cliente.ClienteFuncao.*;
import static Projecto_GameStart_Rui.Funcoes.cliente.imprimecatalogo3.*;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MenuCliente {

    public static void menuCliente() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        int opcao = 0;
        do {
            System.out.println();
            System.out.println("");
            System.out.println("""
                    ************Menu Cliente************
                    1. Inserir Novo Cliente
                    2. Procurar Estacionamento
                    3. Imprimir Catálogo de Jogos
                    4. Imprimir Catálogo Gráficos
                    5. Imprimir Catálogo Editora
                    6. Imprimir Catálogo Categoria
                    7. Imprimir Jogo Mais Recente
                    8. Voltar Menu Principal                                          
                    """);

            System.out.println("Insira Uma Opção :");

            opcao = input.nextInt();
            switch (opcao) {
                //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                //1.Inserir Novo Cliente
                case 1:
                    //Funcao CriarNovoCliente
                    criarNovoCliente();

                    //2. Procurar Estacionamento
                case 2:
                    procuraEstacionamento();
                    break;

                //3.Imprimir Catalogo de jogos
                case 3:
                    imprimeFicheiroConsola("GameStart_Ficheiros/GameStart_Vendas.csv");

                    break;

                //4.Imprimir Catálogo Gráficos
                case 4:
                    catalogoGrafico();
                    break;

                //5. Imprimir Catálogo Editora
                //case 5:
                //    catalogoEditora();

            }


        } while (opcao != 8);

    }
}

