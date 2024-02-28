// Faça um programa que peça ao usuário para adivinhar um número entre 1 e 100.
// O programa deve continuar pedindo até que o usuário acerte.

package DoWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int randomNumber = random.nextInt(100) + 1;
        int guess;
        
        do {
            System.out.println("Adivinhe o número (entre 1 e 100):");
            guess = scanner.nextInt();
            if (guess < randomNumber) {
                System.out.println("Tente um número maior.");
            } else if (guess > randomNumber) {
                System.out.println("Tente um número menor.");
            }
        } while (guess != randomNumber);
        
        System.out.println("Parabéns! Você acertou o número.");
    }
}