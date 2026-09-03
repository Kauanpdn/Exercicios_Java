package LacosDeRepeticao;
import java.util.Scanner;


/*
    EXERCÍCIO 63
Enunciado: Escreva um programa que peça ao usuário para digitar uma senha. Continue
pedindo a senha até que a senha correta seja digitada.  
*/

public class SenhaCorretaDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String senhaCorreta = "1234";
        String senhaDigitada;
            do {
                System.out.print("Digite a senha: ");
                senhaDigitada = scanner.nextLine();
            
                if (!senhaDigitada.equals(senhaCorreta)) {
                            System.out.println("Senha incorreta. Tente novamente.");
                    }

            } while (!senhaDigitada.equals(senhaCorreta));
                    System.out.println("Senha correta! Acesso concedido.");
        
        scanner.close();
    }
}
