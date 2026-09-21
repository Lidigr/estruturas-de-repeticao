import java.util.Scanner;

public class EstruturasDoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para a tabuada: ");
        int numero = scanner.nextInt();

        int contador = 1;

        while (contador <= 10) {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;
        }
    int opcao;
        do {
            System.out.println();
            System.out.println("1-Continuar");
            System.out.println("2-Sair");
            System.out.println("Escolha uma opcao: ");

        opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1) {
            System.out.println("Digite um palavra ou uma frase: ");
            String palavraFrase = scanner.nextLine();

        } else if (opcao == 2) {
            System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
        }

        }while (opcao != 2);

       scanner.close();
        }
    }