package Projecto_GameStart_Rui.Funcoes.cliente;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Funcao_Cliente {
    public static void CriarNovoCliente() throws FileNotFoundException {

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



    }
