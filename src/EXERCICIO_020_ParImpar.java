import java.util.Scanner;

public class EXERCICIO_020_ParImpar {
    public static void main(String[] args) {

        //Desenvolva um programa que leia um número inteiro e mostre se
        //ele é PAR ou ÍMPAR.

        Scanner sc = new Scanner(System.in);

        //Usuário vai digitar um número inteiro qualquer.
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        //Vai verificar se o número, dividido por 2, terá como resultado o resto igual a 2.
        if (num % 2 == 0) {
            //Vai informar ao usuário se o número é par.
            System.out.print("O número informado é PAR");
        }
        //Vai verificar se o número, dividido por 2, terá como resultado o resto diferente de 2.
        else {
            //Vai informar ao usuário que o número é par.
            System.out.print("O número informado é ÍMPAR");
        }

        //Fecha o scanner.
        sc.close();

    }
}

//Digite um número inteiro: 2
//O número informado é PAR

//Digite um número inteiro: 9
//O número informado é ÍMPAR