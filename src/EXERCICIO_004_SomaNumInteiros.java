import java.util.Scanner;

public class EXERCICIO_004_SomaNumInteiros {
    public static void main(String[] args) {

        //Desenvolva um programa em Java que leia dois números inteiros e mostre o somatório entre eles.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Digite um número inteiro: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma entre " + num1 + " e " + num2 + " é igual a " + soma);
    }
}

// Digite um número inteiro: 8
// Digite um número inteiro: 5
// A soma entre 8 e 5 é igual a 13
