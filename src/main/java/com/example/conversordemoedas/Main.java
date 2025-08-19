package com.example.conversordemoedas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário no console.
        Scanner scanner = new Scanner(System.in);
        // Cria uma instância do nosso conversor para usarmos no loop.
        CurrencyConverter converter = new CurrencyConverter();

        // Loop infinito para manter o programa rodando até que o usuário decida sair.
        while (true) {
            System.out.println("=================================================");
            System.out.println("Seja bem-vindo(a) ao Conversor de Moedas!");
            System.out.println("\n1) Dólar (USD) -> Real Brasileiro (BRL)");
            System.out.println("2) Real Brasileiro (BRL) -> Dólar (USD)");
            System.out.println("3) Dólar (USD) -> Peso Argentino (ARS)");
            System.out.println("4) Peso Argentino (ARS) -> Dólar (USD)");
            System.out.println("5) Dólar (USD) -> Peso Colombiano (COP)");
            System.out.println("6) Peso Colombiano (COP) -> Dólar (USD)");
            System.out.println("7) Sair");
            System.out.println("=================================================");
            System.out.print("Escolha uma opção válida: ");

            // Bloco try-catch para tratar possíveis erros de entrada do usuário.
            try {
                int option = scanner.nextInt();

                // Condição para encerrar o loop e o programa.
                if (option == 7) {
                    System.out.println("Aplicação encerrada. Obrigado!");
                    break;
                }

                String base = "", target = "";

                // Estrutura switch para definir as moedas de origem e destino com base na opção.
                switch (option) {
                    case 1: base = "USD"; target = "BRL"; break;
                    case 2: base = "BRL"; target = "USD"; break;
                    case 3: base = "USD"; target = "ARS"; break;
                    case 4: base = "ARS"; target = "USD"; break;
                    case 5: base = "USD"; target = "COP"; break;
                    case 6: base = "COP"; target = "USD"; break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                        continue; // Volta para o início do loop.
                }

                System.out.print("Digite o valor a ser convertido: ");
                double amount = scanner.nextDouble();

                System.out.println("\nConvertendo...");
                // Chama o metodo de conversão e armazena o resultado.
                double result = converter.convert(base, target, amount);

                // Exibe o resultado formatado para o usuário.
                System.out.printf("O valor de %.2f %s corresponde ao valor final de =>> %.2f %s\n\n",
                        amount, base, result, target);

            } catch (InputMismatchException e) {
                // Captura o erro caso o usuário digite texto em vez de um número.
                System.out.println("\nErro: Entrada inválida. Por favor, digite apenas números.");
                scanner.next(); // Limpa o buffer do scanner para evitar um loop infinito de erro.
            } catch (Exception e) {
                // Captura qualquer outro erro inesperado que possa acontecer durante a conversão.
                System.out.println("\nOcorreu um erro inesperado: " + e.getMessage());
            }
        }
        // Fecha o scanner para liberar os recursos.
        scanner.close();
    }
}