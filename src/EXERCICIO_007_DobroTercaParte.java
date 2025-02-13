import java.util.Scanner;

public class EXERCICIO_007_DobroTercaParte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        float numero = sc.nextFloat();
        float dobro = numero * 2;
        float TercaParte = numero / 3;
        System.out.print("O dobro de " +numero+ " é: " +dobro+ "\nA terça parte de " +numero+ " é: " +TercaParte);

    }
}
