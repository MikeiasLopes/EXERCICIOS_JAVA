import java.util.Scanner;
public class EXERCICIO_003_PrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Olá " +nome+ ", é um pazer de conhecer!");
    }
}
