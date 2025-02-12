import java.util.Scanner;

public class EXERCICIO_002_NomeSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual é o seu nome?: ");
        String nome = sc.nextLine();
        System.out.print("Salário: ");
        String salario = sc.nextLine();

        System.out.print("O funcionário(a) " +nome+ " tem um salário de " +salario+ " em junho");
    }
}
