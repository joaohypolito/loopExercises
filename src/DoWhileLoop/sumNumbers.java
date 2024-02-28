// Escreva um programa que solicite ao usuário números inteiros positivos e calcule a soma desses números.
// O programa deve parar quando o usuário digitar um número negativo.

package DoWhileLoop;

import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;

        System.out.println("Quantos números você deseja somar?");
        int quantity = scanner.nextInt();

        int i = 0;

        do {
            System.out.println("Digite um número positivo:");
            number = scanner.nextInt();
            if (number >= 0) {
                sum += number;
                i++;
                if (i == quantity) {
                    break;
                }
            } else {
                System.out.println("Você digitou um número negativo.");
            }
        } while (true);

        System.out.println("A soma dos " + quantity + " números positivos é: " + sum);

        scanner.close();
    }
}