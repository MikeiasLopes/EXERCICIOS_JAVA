import java.util.Scanner;

public class EXERCICIO_021_AnoBissexto {
    public static void main(String[] args) {

        //Faça um algoritmo que leia um determinado ano e mostre se
        //ele é ou não BISSEXTO.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        if (ano % 4 == 0) {
            System.out.print(ano + " é um ano bissexto!");
        }

        else {
            System.out.print(ano + " não é um ano bissexto.");

        }

        sc.close();

    }
}

//Digite um ano: 2025
//2025 não é um ano bissexto.

//Digite um ano: 2028
//2028 é um ano bissexto!