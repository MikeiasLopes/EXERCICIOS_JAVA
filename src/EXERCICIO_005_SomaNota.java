import java.util.Scanner;

public class EXERCICIO_005_SomaNota {
    public static void main(String[] args) {

        //Faça um programa em Java que leia as duas notas de um aluno em uma matéria e
        //mostre na tela a sua média na disciplina.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota do aluno(a): ");
        float nota1 = sc.nextFloat();

        System.out.print("Digite a nota do aluno(a): ");
        float nota2 = sc.nextFloat();

        float media = (nota1 + nota2) / 2;

        System.out.print("A média entre " +nota1+ " e " +nota2+ " é igual a " + media);
    }
}
