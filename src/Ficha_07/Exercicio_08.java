package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio_08 {
    /**
     * Metodo para Total de Vendas
     * @param path do ficheiro exercicio_08.csv
     * @return
     * @throws FileNotFoundException
     */
    public static double totalVendas(String path) throws FileNotFoundException {
        double valorTotal = 0;

        Scanner leitura = new Scanner(new File(path));

        String linha = leitura.nextLine();

        while (leitura.hasNextLine()) {
            linha = leitura.nextLine();

            String[] linhaDividida = linha.split(",");

            double totalLinhaAtual = Double.parseDouble(linhaDividida[2]) * Double.parseDouble(linhaDividida[3]);

            valorTotal += totalLinhaAtual;
        }

        return valorTotal;
    }

    public static void main(String[] args) throws FileNotFoundException {

        double valortotalVendas = totalVendas("Ficheiros/exercicio_08.csv");
        System.out.println("Total vendas: " + valortotalVendas);
    }
}
