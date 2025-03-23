import java.util.Scanner;

public class EXERCICIO_018_IdadeVotoSimNao {
    public static void main(String[] args) {

        //Faça um programa que leia o ano de nascimento de uma pessoa,
        //calcule a idade dela e depois mostre se ela pode ou não votar.

        Scanner sc = new Scanner(System.in);

        //Usuário vai informar o ano de nascimento.
        System.out.print("Informe o ano de nascimento: ");
        int AnoNasc = sc.nextInt();

        //Atualizar o ano conforme necessidade.
        int AnoAtual = 2025;

        //Realiza a subtração do ano atual com o ano de nascimento.
        int idade = AnoAtual - AnoNasc;

        //Vai verificar se à idade for superior a 130 anos.
        if (idade > 130) {
            //Vai informar ao usuário que é uma idade improvável.
            System.out.print("Idade improvável, verifique o ano de nascimento.");

        //Vai verificar se à idade é maior ou igual a 16 anos.
        } else if (idade >= 16) {
            //Vai informar ao usuário que já possui idade para votar.
            System.out.print("Você pode votar!");

        //Se o usuário não se enquadrar nos Ifs acima, será enquadrado pelo else.
        } else {
            //Vai informar ao usuário que ele não possui idade para votar.
            System.out.print("Você ainda não pode votar.");

        }

        //Fecha o scanner.
        sc.close();

    }
}

//Informe seu ano de nascimento? 2000
//Você pode votar!

//Informe seu ano de nascimento? 2010
//Você ainda não pode votar.

//Informe o ano de nascimento: 1888
//Idade improvável, verifique o ano de nascimento.