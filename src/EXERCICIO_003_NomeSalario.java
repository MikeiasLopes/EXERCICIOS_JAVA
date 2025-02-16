import java.util.Scanner;

public class EXERCICIO_003_NomeSalario {
    public static void main(String[] args) {

        //Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma
        //mensagem.

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do funcionário(a): ");
        String nome = sc.nextLine();

        System.out.print("Salário: ");
        float salario = sc.nextFloat();

        System.out.print("O funcionário(a) " + nome + " tem um salário de R$" + salario + " em junho");

    }
}

// Nome do funcionário(a): Mikeias
// Salário: 1850,45
// O funcionário(a) Mikeias tem um salário de R$1850.45 em junho