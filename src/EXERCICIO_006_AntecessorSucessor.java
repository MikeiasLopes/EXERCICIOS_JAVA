import java.util.Scanner;

public class EXERCICIO_006_AntecessorSucessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int antecessor = num - 1;
        int sucessor = num + 1;
        System.out.println("O antecessor de " +num+ " é: " +antecessor+ "\nO sucessor de " +num+ " é: " +sucessor);

    }
}