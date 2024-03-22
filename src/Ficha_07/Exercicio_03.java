package Ficha_07;

import java.io.*;

/*3. Escreva um programa que leia o conteúdo de um ficheiro de texto e grave-o num outro ficheiro.*/
public class Exercicio_03 {

    public static void main(String[] args) {
        String arquivoOrigem = "Ficheiros/Exercicio_03.txt"; // caminho do  arquivo de origem
        String arquivoDestino = "Ficheiros/Exercicio_03_escrito.txt"; // caminho do  arquivo de destino

        try {
            // Abrir o arquivo de origem para leitura , Scannner
            BufferedReader leitor = new BufferedReader(new FileReader(arquivoOrigem));

            // Abrir o arquivo de destino para escrita , PrintWriter
            PrintWriter escritor = new PrintWriter(new FileWriter(arquivoDestino));

            String linha;
            while ((linha = leitor.readLine()) != null) {
                // Escrever cada linha no arquivo de destino
                escritor.println(linha);
            }

            // Fechar os arquivos
            leitor.close();
            escritor.close();

            System.out.println("Conteúdo copiado com sucesso para o destino.");
        } catch (IOException e) {
            System.err.println("Erro ao copiar");
        }
    }

}
