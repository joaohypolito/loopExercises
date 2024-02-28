// Implemente um programa que receba uma frase do usuário e conte o número de vogais presentes nessa frase usando um loop for.

package ForLoop;

import java.util.Scanner;

public class VogalsPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String phrase = scanner.nextLine().toLowerCase();

        int vogalsCounter = 0;
        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vogalsCounter++;
            }
        }

        System.out.println("Número de vogais na frase: " + vogalsCounter);
    }
}