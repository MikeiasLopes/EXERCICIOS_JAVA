import java.util.Scanner;

public class EXERCICIO_013_Salario15Aumento {
    public static void main(String[] args) {

        // Faça um programa em Java que leia o salário de um funcionário,
        // calcule e mostre o  seu novo salário, com 15% de aumento.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String funcionario = sc.nextLine();

        System.out.print("Informe o salário do funcionário: ");
        double salario = sc.nextDouble();

        double aumento = salario * 1.15;

        System.out.printf("O salário antigo do funcionário %s era de R$ %.2f com o aumento de 15%% fica R$ %.2f" ,funcionario, salario, aumento);
    }
}

// Digite o nome do funcionário: Mikeias Lopes
// Informe o salário do funcionário: 2000
// O salário antigo do funcionário Mikeias Lopes era de R$ 2000,00 com o aumento de 15% fica R$ 2300,00