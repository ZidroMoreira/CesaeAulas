package Projecto_GameStart_Rui.Funcoes.admin;

import java.util.Scanner;

public class admin_Consulta_Ficheiros {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao =0;

        System.out.println("*******************Consulta de Ficheiros*****************");
        do {
            System.out.println("Escolha uma das opções: ");
            System.out.println("""
                    
                    1.Vendas
                                    
                    2.Clientes
                                    
                    3.Categorias
                                    
                    4.Voltar
                                    
                    5.Sair
                    
                    """);
            opcao= input.nextInt();

        } while (opcao!=5);
    }

}
