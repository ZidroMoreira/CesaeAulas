package Ficha_06;


public class Exercicio__03 {
    /**
     * Função verifica se é par/impar
     *
     * @param num Número Inteiro
     * @return true se par ; falso se impar
     */

    //palavra reservada boleano nome função *par* parametro var *int num*
    public static boolean par(int num) {
        if (num % 2 == 0) { // é par
            return true;
        } else {            //é impar
            return false;
        }
    }

    /**
     * Função verifica se é positivo/nao positivo
     *
     * @param num Numero Inteiro
     * @return True se positivo / False se negativo
     */
    public static boolean positivo(int num) {
        if (num >= 0) { //positivo
            return true;
        } else {          //Falso
            return false;
        }
    }

    /**
     * Função verifica numero é primo
     *
     * @param num numero inteiro
     * @return true se primo / false nao primo
     */
    public static boolean primo(int num) {
        for (int divisor = 2; divisor < num; divisor++) {
            if (num % divisor == 0) { //conseguiu dividir por um numero que nao 1 e ele mesmo

                //Retorna um numero que nao é primo
                return false;
            }
        }
        return true;
    }

}