package Ficha_06;

import java.util.Scanner;

public class Exercicio__02 {

    /*2º
    Palavra reservada *public static* sem retorno de valores usar o void , com o nome da função *imprimirAsteriscos* com o
    parametro ( cria variavel inteiro = quantidadAsteriscos) */

    /**
     * Imprime * na consola
     * @param quantidadeAsteriscos quantidade asteriscos a serem impressos
     */
    public static void imprimirAsteriscos(int quantidadeAsteriscos) {

        //for enquanto i < quantidadeAsteriscos incrementa o i, imprimindo *
        //for inicialização var;  Condição;   Incrementador;
        for (int i = 0; i < quantidadeAsteriscos; i++) {
            System.out.println("*");
        }
    }

    /*1º criar função para ler numero inteiro positivo
    Palavra reservada *public static* tipo de retorno var *inteiro* com parametros ()*/

    /** Função ler numeros inteiros positivos
     * @return numero inteiro positivo
     */
    public static int lerInteiroPositivo() {


        //Importar Scanner
        Scanner input = new Scanner(System.in);
        // variavel num inteiro
        int num;

        // Faz
        do {
            System.out.println("insira um numero inteiro positivo ");
            num = input.nextInt();

            //Enquanto num < 0
        } while (num < 0);

        /*Ciclo while (Enquanto) num<0 faz sout "insira um num inteiro positivo"
        até ser num inteiro positivo se verdade , retorna num*/
        return num;

    }

    /*3º
    Criar Variavel x = InteiroPositivo
    imprimirAsteriscos com x

    */

    public static void main(String[] args) {
        int x;
        x = lerInteiroPositivo();
        imprimirAsteriscos(x);
    }

}
