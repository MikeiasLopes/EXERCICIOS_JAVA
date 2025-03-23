import java.util.Scanner;

public class EXERCICIO_018_IdadeVotoSimNao {
    public static void main(String[] args) {

        //Faça um programa que leia o ano de nascimento de uma pessoa,
        //calcule a idade dela e depois mostre se ela pode ou não votar.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o ano de nascimento: ");
        int AnoNasc = sc.nextInt();

        int AnoAtual = 2025; //Atualizar o ano conforme necessidade

        int idade = AnoAtual - AnoNasc;

        if (idade > 130) {
            System.out.print("Idade improvável, verifique o ano de nascimento.");

        } else if (idade >= 16) {
            System.out.print("Você pode votar!");

        } else {
            System.out.print("Você ainda não pode votar.");

        }

        sc.close();
    }
}

//Informe seu ano de nascimento? 2000
//Você pode votar!

//Informe seu ano de nascimento? 2010
//Você ainda não pode votar.

//Informe o ano de nascimento: 1888
//Idade improvável, verifique o ano de nascimento.