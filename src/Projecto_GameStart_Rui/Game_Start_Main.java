package Projecto_GameStart_Rui;

import java.util.Scanner;

public class Game_Start_Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao=0;

        System.out.println("**************GameStart***************");

        do {
            System.out.println("Inicie a Sessão:");
            System.out.println("1.Cliente");
            System.out.println("2.Administrador");
            System.out.println("3.Sair");

            opcao= input.nextInt();



            switch(opcao){
                case 1:

            }


        } while(opcao!=3);

        }
    }