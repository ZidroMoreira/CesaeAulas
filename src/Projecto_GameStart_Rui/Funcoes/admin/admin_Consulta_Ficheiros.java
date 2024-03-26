/*package Projecto_GameStart_Rui.Funcoes.admin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class admin_Consulta_Ficheiros {

    //Função para Imprimir na consola Ficheiro de Vendas
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

            switch(opcao){
                case 1:
                    // vendas

                    Scanner leitorFicheiro = new Scanner(new File();


                    //Instanciar um Scanner para o Ficheiro que foi passado por parametro
                    while (leitorFicheiro.hasNextLine()){
                        String linha = leitorFicheiro.nextLine();

                        System.out.println(linha);
                    }
                    leitorFicheiro.close(); // Verificar Se está a funcionar

            }
        }
    }
}


*/
