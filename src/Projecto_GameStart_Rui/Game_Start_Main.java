package Projecto_GameStart_Rui;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Projecto_GameStart_Rui.Funcoes.cliente.MenuCliente.*;
import static Projecto_GameStart_Rui.Funcoes.admin.MenuAdmin.*;

public class Game_Start_Main {


    public static void main(String[] args) throws FileNotFoundException {


        Scanner input = new Scanner(System.in);
        int opcao = 0;

        //////////////////////////////////////////Menu Principal/////////////////////////////////////////////////////////

        System.out.println("**************GameStart***************");
        System.out.println("Inicie a Sessão:");
        System.out.println("1.Cliente");
        System.out.println("2.Administrador");
        System.out.println("3.Sair");

        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                //Função Menu Cliente
                menuCliente();
                break;
            case 2:
                //Função Menu Administrador
                menuAdministrador();
                break;

            case 3:
                //Sair
                break;

            default:
                System.out.println("Opção Invalida");

///////////////////////////////////////////////////////FIM MENU PRINCIPAL////////////////////////////////////////////////////

        }
    }
}


