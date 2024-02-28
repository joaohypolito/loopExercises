// Implemente um programa que solicite ao usuário uma senha e continue pedindo até que a senha digitada seja correta.

package WhileLoop;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "";
        String passwordCheck = "";


        System.out.println("Digite sua senha:");
        password = scanner.nextLine();

        System.out.println("Confirme a senha:");
        passwordCheck = scanner.nextLine();

        while (!passwordCheck.equals(password)) {
            System.out.println("Confirmação incorreta. Digite novamente:");
            passwordCheck = scanner.nextLine();
        }

        System.out.println("Senha cadastrada!");
        scanner.close();
    }
}