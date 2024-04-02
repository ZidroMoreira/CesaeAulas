package Projecto_GameStart_Rui.Funcoes.admin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) throws FileNotFoundException {

        // Leitura do arquivo de categorias para obter as margens de lucro
        String ficheiroCategorias = "GameStart_Ficheiros/GameStart_Categorias.csv";
        double[] margens = obterMargensDeLucro(ficheiroCategorias);

        // Pesquisa pela categoria "RPG"
        String categoriaPesquisada = "RPG";
        int indiceCategoriaPesquisada = encontrarIndiceCategoria(categoriaPesquisada);
        if (indiceCategoriaPesquisada != -1) {
            System.out.println("Categoria: " + categoriaPesquisada + ", Margem de Lucro: " + margens[indiceCategoriaPesquisada]);
        } else {
            System.out.println("Categoria não encontrada.");
        }

        // Leitura do arquivo de vendas e cálculo do total de lucro
        String ficheiroVendas = "GameStart_Ficheiros/GameStart_Vendas.csv";
        double totalLucro = calcularTotalLucro(ficheiroVendas, margens);

        System.out.println("Total de Lucro: " + totalLucro);
    }

    // Método para obter as margens de lucro a partir do arquivo de categorias
    public static double[] obterMargensDeLucro(String arquivoCategorias) throws FileNotFoundException {
        double[] margens = new double[16]; // Assumindo que há 16 categorias
        Scanner scanner = new Scanner(new File(arquivoCategorias));
        scanner.nextLine(); // Ignora o cabeçalho
        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            String[] itensLinha = linha.split(";");
            String categoria = itensLinha[0];
            double margem = Double.parseDouble(itensLinha[1]);
            int indiceCategoria = encontrarIndiceCategoria(categoria);
            if (indiceCategoria != -1) {
                margens[indiceCategoria] = margem;
            }
        }
        scanner.close();
        return margens;
    }

    // Método para encontrar o índice da categoria no vetor de categorias
    public static int encontrarIndiceCategoria(String categoria) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("GameStart_Ficheiros/GameStart_Categorias.csv"));
        scanner.nextLine(); // Ignora o cabeçalho
        int indice = 0;
        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            String[] itensLinha = linha.split(";");
            if (itensLinha[0].equals(categoria)) {
                scanner.close();
                return indice;
            }
            indice++;
        }
        scanner.close();
        return -1;
    }

    // Método para calcular o total de lucro com base nas vendas e nas margens de lucro
    public static double calcularTotalLucro(String arquivoVendas, double[] margens) throws FileNotFoundException {
        double totalLucro = 0.0;
        Scanner scanner = new Scanner(new File(arquivoVendas));
        scanner.nextLine(); // Ignora o cabeçalho
        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            String[] itensLinha = linha.split(";");
            String categoria = itensLinha[0];
            double valorVenda = Double.parseDouble(itensLinha[1]);
            int indiceCategoria = encontrarIndiceCategoria(categoria);
            if (indiceCategoria != -1) {
                double margem = margens[indiceCategoria];
                double lucro = valorVenda * (margem / 100.0);
                totalLucro += lucro;
            }
        }
        scanner.close();
        return totalLucro;
    }
}
