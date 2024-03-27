package Projecto_GameStart_Rui.Funcoes.cliente;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;

import static Projecto_GameStart_Rui.Funcoes.cliente.imprimecatalogo3.imprimeFicheiroConsola;

public class ClienteFuncao {

    public static void criarNovoCliente() {

        Scanner input = new Scanner(System.in);

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

        System.out.println("Cliente Inserido com Sucesso: " + nome + "|" + contacto + "|" + email);

    }

    public static void procuraEstacionamento() {

        System.out.println("************Procurar Estacionamento************");
        System.out.println();

        /*Ficha06Exercicio03 Numeros Triangulares
         Procurar estacionamento: Sabendo que os lugares de vago são todos os números triangulares múltiplos de 3 num
         limite de 121 lugares.*/

        //Var's da Opção lugares multiplos de 3

        int maxLugares = 121, lug = 0, contLugTriangulares = 0;

        for (int i = 1; i <= maxLugares; i++) {

            if (i % 3 == 0) {

                contLugTriangulares++;

            }

        }
        System.out.println("O numero de Lugares Disponiveis são : " + contLugTriangulares);


    }

    public static void catalogoGrafico() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("*************Imprimir Catálogo Gráficos**************");
            System.out.println("""
                    1.Call of Duty
                    2.Fifa
                    3.Hollow Knight
                    4.Mortal Kombat
                    5.Overcooked
                    6.Witcher 3: Wild Hunt
                    7.Minecraft
                    8.Voltar Menu Anterior
                    Escolhe uma das seguintes opções :
                    """);
            opcao = input.nextInt();

            switch (opcao) {
                case 1: //1.Call of Duty

                    imprimeFicheiroConsola("GameStart_Ficheiros/CatalogoGrafico/callOfDuty.txt");
                    break;

                case 2: //2.Fifa

                    imprimeFicheiroConsola("GameStart_Ficheiros/CatalogoGrafico/fifa.txt");
                    break;

                case 3: //3.hollow

                    imprimeFicheiroConsola("GameStart_Ficheiros/CatalogoGrafico/hollowKnight.txt");
                    break;

                case 4: //4.Mortal Kombat
                    imprimeFicheiroConsola("GameStart_Ficheiros/CatalogoGrafico/mortalKombat.txt");
                    break;

                case 5: //5.Overcooked
                    imprimeFicheiroConsola("GameStart_Ficheiros/CatalogoGrafico/overcooked.txt");
                    break;

                case 6: //6.Overcooked
                    imprimeFicheiroConsola("GameStart_Ficheiros/CatalogoGrafico/overcooked.txt");
                    break;


                case 7: //7.Witcher3
                    imprimeFicheiroConsola("GameStart_Ficheiros/CatalogoGrafico/witcher3.txt");
                    break;

                case 8: //8.Sair
                    break;

                default:
                    System.out.println("Opção Errada!");


            }


        } while (opcao != 8);
    }

//Imprimir Catálogo Editora: Dada uma Editora, imprima todas as categorias e os respetivos jogos.

//        public static void catalogoEditora(String Path){
//            String pesquisa;
//            do {
//                Scanner in = new Scanner(new File(path));
//
//                // Caminho para o ficheiro de vendas "GameStart_Ficheiros/GameStart_Vendas.csv";
//
//
//
//            }
//
//
//
//        }
//    }


}

