import java.util.Scanner;

public class EXERCICIO_003_NomeSalario {
    public static void main(String[] args) {

        //Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma
        //mensagem.

        Scanner sc = new Scanner(System.in);

        // Solicita o nome do funcionário
        System.out.print("Nome do funcionário(a): ");
        String nome = sc.nextLine();

        // Solicita o salário do funcionário
        System.out.print("Informe o salário do funcionário: ");
        float salario = sc.nextFloat();

        // Exibe a mensagem com o nome do funcionário e o salário.
        System.out.printf("O funcionário(a) %s tem um salário de R$ %.2f em junho.%n", nome, salario);

    }
}

// Nome do funcionário(a): Mikeias
// Informe o salário do funcionário: 1850,45
// O funcionário(a) Mikeias tem um salário de R$ 1850,45 em junho.