
import java.util.Scanner;

public class NumeroSalariosMinimos {

    public static void main(String[] args) {
        System.out.println("Quantidade de sálarios mínimos");
        System.out.println("Insira o valor do seu salário: ");
        double salarioEmpregado = new Scanner(System.in).nextDouble();
        System.out.println("Seu salário: " + salarioEmpregado);
        System.out.println("Insira o valor do salário minímo:");
        double salarioMinimo = new Scanner(System.in).nextDouble();
        System.out.println("Salário minímo: " + salarioMinimo);
        double salariosMinimos = salarioEmpregado / salarioMinimo;
        System.out.println("O empregado recebe " + salariosMinimos + " salários mínimos por mês.");

    }

}
