package Projecto_GameStart_Rui.Funcoes;

import java.util.Scanner;

public class cliente_menu {

    public static void menuCliente(){

        Scanner input = new Scanner(System.in);

        int opcao = 0;

        System.out.println("************Menu Cliente************");
        System.out.println("""
                1. Inserir Novo Cliente
                
                2. Procurar Estacionamento
                
                3. Imprimir Catálogo de Jogos
                
                4. Imprimir Catálogo Gráficos
                
                5. Imprimir Catálogo Editora
                
                6. Imprimir Catálogo Categoria
                
                7. Imprimir Jogo Mais Recente
                
                """);

        opcao = input.nextInt();

    } while(opcao!=5);
}

    }
}
