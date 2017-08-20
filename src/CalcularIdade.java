
import java.util.Scanner;

public class CalcularIdade {

    public static void main(String[] args) {
        System.out.println("Insira seu ano de nascimento:");
        int anoDeNascimento = new Scanner(System.in).nextInt();
        System.out.println("Seu ano de nascimento: " + anoDeNascimento + ".");
        System.out.println("Insira o ano atual:");
        int anoAtual = new Scanner(System.in).nextInt();
        int idade = anoAtual - anoDeNascimento;
        System.out.println("Você tem " + idade + " anos.");
    }
   
}
