package Projecto_GameStart_Rui.Funcoes.cliente;

import java.util.Scanner;

public class cliente_menu {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        //Var's da opção 1 "Inserir Novo Cliente"
        int opcao = 0;
        String nome, email;
        Double contacto;


        System.out.println();
        System.out.println("************Menu Cliente************");
        System.out.println("""
                                    
                1. Inserir Novo Cliente
                                
                2. Procurar Estacionamento
                                
                3. Imprimir Catálogo de Jogos
                                
                4. Imprimir Catálogo Gráficos
                                
                5. Imprimir Catálogo Editora
                                
                6. Imprimir Catálogo Categoria
                                
                7. Imprimir Jogo Mais Recente
                                    
                8. Voltar Menu Anterior
                                
                """);
        System.out.println("Escolha Uma Das Opções: ");

        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("************Novo Cliente************");
                System.out.println();

                System.out.println("Insira Nome: ");
                nome = input.next();

                System.out.println("Insira Contacto: ");
                contacto = input.nextDouble();

                System.out.println("Insira Email:");
                email = input.next();

                System.out.println("Cliente Inserido com Sucesso: " + nome + "|" + contacto + "|" + email);

                break;

            case 2:
                System.out.println("************Procurar Estacionamento************");
                System.out.println();

                    /*Ficha06Exercicio03 Numeros Triangulares
                    Procurar estacionamento: Sabendo que os lugares de vago são todos os números triangulares múltiplos de 5 num
                    limite de 121 lugares.*/

                //Var's da Opção lugares multiplos de 5

                int maxLugares = 121, lug = 0, contLugTriangulares = 0;

                for (int i = 1; i <= maxLugares; i++) {

                    if (i % 5 == 0) {

                        contLugTriangulares++;

                    }

                }
                System.out.println("O numero de Lugares Disponiveis são : " + contLugTriangulares);
                break;


                /*3. Imprimir Catálogo: Imprima todos os títulos de jogos (sem duplicados). */
            case 3:


        }
    }

}