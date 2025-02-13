import java.util.Scanner;

public class EXERCICIO_004_SomaNumInteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num1 = sc.nextInt();
        System.out.print("Digite um número inteiro: ");
        int num2 = sc.nextInt();
        int soma = num1 + num2;
        System.out.println("Soma: " + soma);
    }
}
