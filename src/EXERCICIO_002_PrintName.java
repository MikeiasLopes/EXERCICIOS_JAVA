import java.util.Scanner;

public class EXERCICIO_002_PrintName {
    public static void main(String[] args) {

        // Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas
        // vindas para ela:

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Olá " +nome+ ", é um prazer de conhecer!");
    }
}

// Digite seu nome: Mikeias
// Olá Mikeias, é um prazer de conhecer!