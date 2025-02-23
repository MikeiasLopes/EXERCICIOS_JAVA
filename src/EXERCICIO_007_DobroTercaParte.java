import java.util.Scanner;

public class EXERCICIO_007_DobroTercaParte {
    public static void main(String[] args) {

        //Crie um programa em Java que leia um número real e mostre na tela o seu dobro e a sua terça parte.

        Scanner sc = new Scanner(System.in);

        // Solicita um número real.
        System.out.print("Digite um numero: ");
        float numero = sc.nextFloat();

        // Calcula o dobro e a terça parte do número.
        float dobro = numero * 2;
        float TercaParte = numero / 3;

        // Exibe o resultado.
        System.out.print("O dobro de " +numero+ " é: " +dobro+ "\nA terça parte de " +numero+ " é: " +TercaParte);

        // Fecha o scanner.
        sc.close();

    }
}

// Digite um numero: 3,5
// O dobro de 3.5 é: 7.0
// A terça parte de 3.5 é: 1.1666666