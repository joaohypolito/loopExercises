// Crie um programa que solicite ao usuário um número e imprima a tabuada desse número usando um loop while.

package WhileLoop;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para a tabuada:");

        int number = scanner.nextInt();
        int i = 1;

        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }
    }
}