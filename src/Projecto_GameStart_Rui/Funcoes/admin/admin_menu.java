package Projecto_GameStart_Rui.Funcoes.admin;

import java.util.Scanner;

public class admin_menu {
    public static void main(String[] args) {

        int opcao;

        Scanner input = new Scanner(System.in);
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

    }
}
