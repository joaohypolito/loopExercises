// Faça um programa que calcule e imprima o fatorial de um número fornecido pelo usuário usando um loop for.

package ForLoop;

import java.util.Scanner;

public class factorialPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular seu fatorial:");

        int number = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("O fatorial de " + number + " é: " + factorial);
    }
}