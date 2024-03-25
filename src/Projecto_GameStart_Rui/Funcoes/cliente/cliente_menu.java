package Projecto_GameStart_Rui.Funcoes.cliente;

import java.util.Scanner;

public class cliente_menu {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int opcao = 0;

        do {

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

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("************Novo Cliente************");
                    System.out.println("");
                    System.out.println("Insira Nome: ");

            }

        } while (opcao != 8);
    }
}


