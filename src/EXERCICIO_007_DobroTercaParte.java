import java.util.Scanner;

public class EXERCICIO_007_DobroTercaParte {
    public static void main(String[] args) {

        //Crie um programa em Java que leia um número real e mostre na tela o seu dobro e a sua terça parte.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        float numero = sc.nextFloat();

        float dobro = numero * 2;
        float TercaParte = numero / 3;

        System.out.print("O dobro de " +numero+ " é: " +dobro+ "\nA terça parte de " +numero+ " é: " +TercaParte);
    }
}

// Digite um numero: 3,5
// O dobro de 3.5 é: 7.0
// A terça parte de 3.5 é: 1.1666666