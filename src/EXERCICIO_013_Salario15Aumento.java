import java.util.Scanner;

public class EXERCICIO_013_Salario15Aumento {
    public static void main(String[] args) {

        // Faça um programa em Java que leia o salário de um funcionário,
        // calcule e mostre o  seu novo salário, com 15% de aumento.

        Scanner sc = new Scanner(System.in);

        // Solicita o nome do funcionário.
        System.out.print("Digite o nome do funcionário: ");
        String funcionario = sc.nextLine();

        // Solicita o salário do funcionário.
        System.out.print("Informe o salário do funcionário: ");
        double salario = sc.nextDouble();

        // Calcula o aumento do salário em 15%.
        double aumento = salario * 1.15;

        // Exibe o resultado do aumento.
        System.out.printf("O salário antigo do funcionário %s era de R$ %.2f com o aumento de 15%% fica R$ %.2f"
                ,funcionario, salario, aumento);

        // Fecha o scanner
        sc.close();

    }
}

// Digite o nome do funcionário: Mikeias Lopes
// Informe o salário do funcionário: 2000
// O salário antigo do funcionário Mikeias Lopes era de R$ 2000,00 com o aumento de 15% fica R$ 2300,00