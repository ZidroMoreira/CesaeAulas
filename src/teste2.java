import java.util.Scanner;

public class teste2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        do{
            do{
                System.out.println("1 Opção Um");
                System.out.println("2 Opção Dois");
                System.out.println("3 Sair");
                System.out.print("Escolha uma das opções: ");
                opcao=input.nextInt();
            }while(opcao>1 || opcao <3);
            switch(opcao) {
                case 1:
                    System.out.println("***** Escolheu Opção Um*****");
                    break;
                case 2:
                    System.out.println("***** Escolheu Opção Dois*****");
                    break;
                case 3:
                    System.out.println("Sair");
                    break;
            }

        }while(opcao==4);
    }
}
