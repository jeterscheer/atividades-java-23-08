
import java.util.Scanner;

public class PorcentagemHomensMulheres {

    public static void main(String[] args) {
        System.out.println("Porcentagem de homens e mulheres em uma turma");
        System.out.println("Insira a quantidsde de homens:");
        int quantidadeHomens = new Scanner(System.in).nextInt();
        System.out.println("Insira a quantidade de mulheres:");
        int quantidadeMulheres = new Scanner(System.in).nextInt();
        int quantidadeAlunos = quantidadeHomens + quantidadeMulheres;
        // (double) é um cast da quantidade de homens para double. Se o cast não for feito o valor é 0.
        // O valor é 0 porque o Java entende que o resultado de uma divisão dois valores inteiros, é um 
        // valor inteiro.
        double porcentagemHomens = ((double) quantidadeHomens / quantidadeAlunos) * 100;
        double porcentagemMulheres = ((double) quantidadeMulheres / quantidadeAlunos) * 100;
        System.out.println("Porcentagem de homens: " + porcentagemHomens + "%.");
        System.out.println("Porcentagem de mulheres:  " + porcentagemMulheres + "%.");
    }

}
