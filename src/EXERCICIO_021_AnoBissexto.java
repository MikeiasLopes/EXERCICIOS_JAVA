import java.util.Scanner;

public class EXERCICIO_021_AnoBissexto {
    public static void main(String[] args) {

        //Faça um algoritmo que leia um determinado ano e mostre se
        //ele é ou não BISSEXTO.

        Scanner sc = new Scanner(System.in);

        //Usuário vai digitar um ano qualquer.
        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        //Vai verificar se o ano informado, dividido por 4, terá com resultado o resto igual a 0.
        if (ano % 4 == 0) {
            //Vai informar ao usuário que o ano é bissexto.
            System.out.print(ano + " é um ano bissexto!");
        }

        //Vai verificar se o ano informado, dividido por 4, terá com resultado o resto diferente a 0.
        else {
            //Vai informar ao usuário que o ano não é bissexto.
            System.out.print(ano + " não é um ano bissexto.");

        }

        //Fecha o scanner.
        sc.close();

    }
}

//Digite um ano: 2025
//2025 não é um ano bissexto.

//Digite um ano: 2028
//2028 é um ano bissexto!