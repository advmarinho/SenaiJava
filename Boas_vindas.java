package senai_java;

import java.util.Scanner;

public class Boas_vindas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            // Cor verde
            System.out.println("\u001B[32mBem-Vindos Java Senai!\u001B[0m");

            // Solicitando o nome do usuário
            System.out.print("\u001B[33mQual é o seu nome? \u001B[0m");
            String nome = scanner.nextLine();

            // Cor verde
            System.out.println("\u001B[32mOlá, " + nome + "! Bem-vindo ao mundo Java.\u001B[0m");

            boolean respostaValida = false;
            do {
                // Cor azul
                System.out.print("\u001B[34mDeseja continuar? (S/N) \u001B[0m");
                resposta = scanner.nextLine();
                respostaValida = resposta.equalsIgnoreCase("S") || resposta.equalsIgnoreCase("N");

                if (!respostaValida) {
                    System.out.println();
                    System.out.println("Resposta inválida. Digite apenas 'S' ou 'N'.");
                }
            } while (!respostaValida);

        } while (resposta.equalsIgnoreCase("S"));

        scanner.close();

        // Cor amarela
        System.out.println("\u001B[33mPrograma encerrado. Continue estudando e se dedicando!\u001B[0m");
    }
}
