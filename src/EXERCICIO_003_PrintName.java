import java.util.Scanner;
public class EXERCICIO_003_PrintName {
    public static void main(String[] args) {

        //Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Olá " +nome+ ", é um pazer de conhecer!");
    }
}
