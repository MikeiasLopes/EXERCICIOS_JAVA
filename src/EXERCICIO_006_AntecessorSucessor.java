import java.util.Scanner;

public class EXERCICIO_006_AntecessorSucessor {
    public static void main(String[] args) {

        //Faça um programa em Java que leia um número inteiro e mostre o seu antecessor e seu sucessor.

        Scanner sc = new Scanner(System.in);

        // Solicita um número inteiro.
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        // Calcula o antecessor e o sucessor.
        int antecessor = num - 1;
        int sucessor = num + 1;

        // Exibe o resultado.
        System.out.println("O antecessor de " +num+ " é " +antecessor+ "\nO sucessor de " +num+ " é " +sucessor);

        // Fecha o scanner.
        sc.close();

    }
}

// Digite um número: 9
// O antecessor de 9 é 8
// O sucessor de 9 é 10