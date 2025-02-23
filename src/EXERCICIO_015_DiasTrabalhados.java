import java.util.Scanner;

public class EXERCICIO_015_DiasTrabalhados {
    public static void main(String[] args) {

        // Crie um programa Java que leia o número de dias trabalhados em
        // um mês e mostre o  salário de um funcionário, sabendo que ele
        // trabalha 8 horas por dia e ganha R$25 por  hora trabalhada.

        Scanner sc = new Scanner(System.in);

        // Informa a quantidade de dias trabalhados.
        System.out.print("Informe o quantitativo de dias trabalhados: ");
        double DiasTrabalhados = sc.nextDouble();

        // Calcula o salário (8 * 25 = 200)
        double salario = DiasTrabalhados * 200;

        // Exibe o resultado.
        System.out.printf("Seu salário do mês é R$%.2f", salario);

        // Fecha o scanner
        sc.close();

    }
}

// Informe o quantitativo de dias trabalhados: 16
// Seu salário do mês é R$3200,00