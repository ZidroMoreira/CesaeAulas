package Projecto_GameStart_Rui;

import Projecto_GameStart_Rui.Funcoes.cliente.Funcao_Cliente;


import java.io.FileNotFoundException;
import java.util.Scanner;

import static Projecto_GameStart_Rui.Funcoes.cliente.imprimecatalogo3.imprimeFicheiroConsola;

public class Game_Start_Main  {


    public static void main(String[] args) throws FileNotFoundException {


        Scanner input = new Scanner(System.in);
        int opcao = 0;

        System.out.println("**************GameStart***************");


        System.out.println("Inicie a Sessão:");
        System.out.println("1.Cliente");
        System.out.println("2.Administrador");
        System.out.println("3.Sair");

        opcao = input.nextInt();

        ///////////////////////////////////////////////////////////////////////////

        //Se opcao == 1 Menu Cliente
        if (opcao == 1) {

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
        }
        System.out.println("Insira Uma Opção :");

        opcao = input.nextInt();
        switch (opcao) {
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //1.Inserir Novo Cliente
            case 1:
                //Funcao CriarNovoCliente

                String nome, email;
                Double contacto;

                System.out.println("************Novo Cliente************");
                System.out.println();

                System.out.println("Insira Nome: ");
                nome = input.next();

                System.out.println("Insira Contacto: ");
                contacto = input.nextDouble();

                System.out.println("Insira Email:");
                email = input.next();

                System.out.println("Cliente Inserido com Sucesso: \nNome: \n"+ nome +"\nContacto: \n" + contacto + "\nEmail:\n" + email);

                break;
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


            //2. Procurar Estacionamento
            case 2:
                System.out.println("************Procurar Estacionamento************");
                System.out.println();

                    /*Ficha06Exercicio03 Numeros Triangulares
                    Procurar estacionamento: Sabendo que os lugares de vago são todos os números triangulares múltiplos de 5 num
                    limite de 121 lugares.*/

                //Var's da Opção lugares multiplos de 3

                int maxLugares = 121, lug = 0, contLugTriangulares = 0;

                for (int i = 1; i <= maxLugares; i++) {

                    if (i % 3 == 0) {

                        contLugTriangulares++;

                    }

                }
                System.out.println("O numero de Lugares Disponiveis são : " + contLugTriangulares);
                break;
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            //3. Imprimir Catálogo de Jogos
            case 3:
                System.out.println("""
                        Escolha Uma Das Seguintes Opções:
                                       
                        1.Vendas
                        2.Clientes
                        3.Categorias
                        4.Voltar ao Menu Anterior""");

                        opcao = input.nextInt();

                         switch (opcao) {

                            case 1:
                                imprimeFicheiroConsola("GameStart_Ficheiros\\GameStart_Vendas.csv");
                                break;
                            case 2:
                                imprimeFicheiroConsola("GameStart_Ficheiros\\GameStart_Clientes.csv");
                                break;
                            case 3:
                                imprimeFicheiroConsola("GameStart_Ficheiros\\GameStart_Categorias.csv");
                                break;

                            case 4:
                                //TO DO - VOLTAR AO MENU ANTERIOR
                                break;
                        }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//              4. Imprimir Catálogo Gráficos
            case 4:


                System.out.println("*************Imprimir Catálogo Gráficos**************");
                System.out.println("""
                1.Call of Duty
                2.Fifa
                3.Hollow Knight
                4.Mortal Kombat
                5.Overcooked
                6.Witcher 3: Wild Hunt
                7.Minecraft
                Escolhe uma das seguintes opções :
                """);
                opcao= input.nextInt();

                switch (opcao){
                    case 1:
                        imprimeFicheiroConsola("GameStart_Ficheiros/CatalogoGrafico/callOfDuty.txt");
                        break;

                
                



                }
        }
    }
}







/*
                System.out.println("""
                                        
                        ************Menu Administrador************
                        1.Consulta de Ficheiros
                        2.Total de Vendas
                        3.Total de Lucro
                        4.Pesquisa de Cliente
                        5.Jogo mais caro
                        6.Melhores Clientes 
                        7.Melhor Categoria
                        8.Pesquisa Vendas
                        9.Top 5 Jogos
                        10. Bottom 5 Jogos
                        11.Voltar ao Menu Principal
                                       
                        """);
                System.out.println("Escolha Uma Das Opções: ");
                opcao = input.nextInt();
                //Colocar o "admin_menu


        }
*/
