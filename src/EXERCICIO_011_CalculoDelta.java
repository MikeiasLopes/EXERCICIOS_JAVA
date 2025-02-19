import java.util.Scanner;

public class EXERCICIO_011_CalculoDelta {
    public static void main(String[] args) {

        // Desenvolva um programa em Java que leia
        // os valores de A, B e C de uma equação do segundo
        // grau e mostre o valor de Delta. (fórmula Δ = b2 – 4ac)

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = sc.nextDouble();

        double d = (b*b) - (4 * +a * +c);

        System.out.print("O valor de delta é " +d);
    }

}

// Digite o valor de A: 3
// Digite o valor de B: 4
// Digite o valor de C: 5
// O valor de delta é -44.0