package Projecto_GameStart_Rui;

public class joseStuff {

    import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

    public class MenuAdmin {
        static String ficheiroVendas = "GameStart/GameStart_Vendas.csv";
        static String ficheiroClientes = "GameStart/GameStart_Clientes.csv";
        static String ficheiroCategorias = "GameStart/GameStart_Categorias.csv";


        public static void main(String args[]) throws Exception {
            // _1printFicheiro();
            // _2printTotal();
            // _4cliente();
            _5jogomaiscaro();
        }

        public static void _5jogomaiscaro() throws Exception {
            String [][] matrizVendas = lerFicheiroParaMatriz(ficheiroVendas, 175, 6);
            String [][] matrizClientes = lerFicheiroParaMatriz(ficheiroClientes, 90, 4);

            double maisCaro = 0;
            for (int j = 0; j < matrizVendas.length; j++) {
                double valor = Double.parseDouble(matrizVendas[j][5]);
                if (valor > maisCaro) {
                    maisCaro = valor;
                }
            }
            System.out.println("Item mais caro: " + maisCaro);

            for (int j = 0; j < matrizVendas.length; j++) {
                double valor = Double.parseDouble(matrizVendas[j][5]);
                if (valor == maisCaro) {
                    String idClient = matrizVendas[j][1];
                    System.out.println("Cliente comprou item mais caro: " + getNomeCliente(matrizClientes, idClient));
                }
            }
        }

        public static String getNomeCliente(String[][]matrizClientes, String idClient) throws Exception {
            for (int i = 0; i < matrizClientes.length; i++) {
                if (idClient.equals(matrizClientes[i][0])) {
                    return matrizClientes[i][1];
                }
            }

            throw new Exception("id cliente nao encontrado: " + idClient);
        }

        public static String[][] lerFicheiroParaMatriz(String path, int linhas, int cols) throws Exception {
            String [][] matriz = new String[linhas][cols];

            Scanner sc = new Scanner(new File(path));
            // drop linha do cabeçalho
            sc.nextLine();

            int i = 0;
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                String[]linhaSplit = linha.split(";");
                for (int j = 0; j < linhaSplit.length; j++) {
                    matriz[i][j] = linhaSplit[j];
                }
                i++;
            }

            sc.close();
            return matriz;
        }


        public static void _4cliente() throws Exception {

            Scanner sc = new Scanner(new File(ficheiroClientes));

            String [][] matrizClientes = new String[90][4];

            // drop linha do cabeçalho
            sc.nextLine();

            int i=0;
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                String[] splitLinhas = linha.split(";");

                // 1
                // matrizClientes[i][0] = splitLinhas[0];
                // matrizClientes[i][1] = splitLinhas[1];
                // matrizClientes[i][2] = splitLinhas[2];
                // matrizClientes[i][3] = splitLinhas[3];

                // 2
                for (int j = 0; j < splitLinhas.length; j++) {
                    matrizClientes[i][j] = splitLinhas[j];
                }

                // 3
                // matrizClientes[i] = splitLinhas;

                i++;
            }

            Scanner scInput = new Scanner(System.in);

            String idClient = scInput.nextLine();

            boolean encontrado = false;
            for (i = 0; i < matrizClientes.length; i++) {
                if (idClient.equals(matrizClientes[i][0])) {
                    String [] cliente = matrizClientes[i];
                    System.out.println("Cliente encontrado:");
                    System.out.println("- ID: " + cliente[0]);
                    System.out.println("- Nome: " + cliente[1]);
                    System.out.println("- Telemovel: " + cliente[2]);
                    System.out.println("- Email: " + cliente[3]);
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("Cliente com ID " + idClient + " nao encontrado");
            }
        }


        public static void _2printTotal() throws Exception {
            int numCategorias = 16;

            String[] categorias = new String[numCategorias];
            double[] percentagens = new double[numCategorias];

            Scanner scCats = new Scanner(new File(ficheiroCategorias));
            // drop linha do cabeçalho
            scCats.nextLine();

            int i=0;
            while (scCats.hasNextLine()) {
                String linha = scCats.nextLine();

                String[]linhaSplit = linha.split(";");

                categorias[i] = linhaSplit[0];
                percentagens[i] = Double.parseDouble(linhaSplit[1]);

                i++;
            }

            scCats.close();


            Scanner scVendas = new Scanner(new File(ficheiroVendas));
            // drop linha do cabeçalho
            scVendas.nextLine();

            double total = 0;
            i=0;
            while (scVendas.hasNextLine()) {
                String linha = scVendas.nextLine();

                String[]linhaSplit = linha.split(";");

                String categoria = linhaSplit[3];
                double valor = Double.parseDouble(linhaSplit[5]);

                double percentagem = getPercentagem(categoria, categorias, percentagens);

                double lucro = valor * percentagem / 100;
                total += lucro;
                System.out.println("Item: " + linhaSplit[2] + ", "
                        + categoria + ", valor: " + valor + ", lucro: " + lucro + ", total:" + total);

                i++;
            }

            scVendas.close();

            System.out.println("VALOR TOTAL: " + total);
        }

        static double getPercentagem(String categoria, String[] categorias, double[] percentagens) throws Exception {
            for (int j = 0; j < categorias.length; j++) {
                if (categorias[j].equals(categoria)) {
                    return percentagens[j];
                }
            }
            throw new Exception("categoria nao encontrada: " + categoria);
        }

        static void _1printFicheiro() throws FileNotFoundException {
            Scanner sc = new Scanner(new File(ficheiroVendas));

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();
        }
    }

}
