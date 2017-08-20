
import java.util.Scanner;

public class CalcularBhaskara {

    public static void main(String[] args) {
        System.out.println("Insira o valor de A:");
        double valorA = new Scanner(System.in).nextDouble();
        System.out.println("Insira o valor de B:");
        double valorB = new Scanner(System.in).nextDouble();
        System.out.println("Insira o valor de C:");
        double valorC = new Scanner(System.in).nextDouble();
        double valorDelta = (valorB * valorB) - (4 * valorA * valorC);
        double raizDelta = Math.sqrt(valorDelta);
        double x1 = (-valorB + raizDelta) / (2 * valorA);
        double x2 = (-valorB - raizDelta) / (2 * valorA);
        System.out.println("Os valores de Bhaskara são: x1 = " + x1 + " e x2 = " + x2 + ".");
    }

}
