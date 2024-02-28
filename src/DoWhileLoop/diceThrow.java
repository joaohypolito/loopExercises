// Crie um programa que simule o lançamento de um dado até que o usuário decida parar.
// O programa deve imprimir os resultados de cada lançamento e a soma total dos valores.

package DoWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class diceThrow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int sum = 0;
        int diceThrow;

        char option;

        do {
            diceThrow = random.nextInt(6) + 1;

            sum += diceThrow;

            System.out.println("Lançamento: " + diceThrow);
            System.out.println("Deseja lançar o dado novamente? (s/n):");

            option = scanner.next().charAt(0);
        } while (option == 's' || option == 'S');

        System.out.println("Soma total dos valores lançados: " + sum);
    }
}