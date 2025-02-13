import java.util.Scanner;

public class EXERCICIO_002_NomeSalario {
    public static void main(String[] args) {

        //Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas para ela:

        Scanner sc = new Scanner(System.in);
        System.out.print("Qual é o seu nome?: ");
        String nome = sc.nextLine();
        System.out.print("Salário: ");
        float salario = sc.nextFloat();

        System.out.print("O funcionário(a) " +nome+ " tem um salário de " +salario+ " em junho");
    }
}
