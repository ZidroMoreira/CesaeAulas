package Ficha_03;
//Faça um programa que imprima os números inteiros de 1 a 100 inclusive, e no final imprima também o valor do
//seu somatório. (Não necessita de Scanner ou input do utilizador)
public class Exercicio_07 {
    public static void main(String[] args) {


        // Declarar variaveis
        int num = 0, soma = 0;
        while (num < 100) {
            //
            num++;
            // += faz a soma a cada ciclo while e atribui a variavel soma
            soma += num;

            System.out.println(+num);

        }
        // Se num = 100 faz sout
        if (num == 100) {

            System.out.println("Somatório: " + soma);
        }

    }
}
