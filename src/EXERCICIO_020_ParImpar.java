import java.util.Scanner;

public class EXERCICIO_020_ParImpar {
    public static void main(String[] args) {

        //Desenvolva um programa que leia um número inteiro e mostre se
        //ele é PAR ou ÍMPAR.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.print("O número informado é PAR");
        }
        else {
            System.out.print("O número informado é ÍMPAR");
        }

        sc.close();

    }
}

//Digite um número inteiro: 2
//O número informado é PAR

//Digite um número inteiro: 9
//O número informado é ÍMPAR