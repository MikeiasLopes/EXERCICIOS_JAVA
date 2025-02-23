import java.util.Scanner;

public class EXERCICIO_005_SomaNota {
    public static void main(String[] args) {

        //Faça um programa em Java que leia as duas notas de um aluno em uma matéria e
        //mostre na tela a sua média na disciplina.

        Scanner sc = new Scanner(System.in);

        // Solicita a primeira nota do aluno.
        System.out.print("Digite a nota do aluno(a): ");
        float nota1 = sc.nextFloat();

        // Solicita a segunda nota do aluno.
        System.out.print("Digite a nota do aluno(a): ");
        float nota2 = sc.nextFloat();

        // Exibe a média das notas dos inputs.
        float media = (nota1 + nota2) / 2;

        System.out.print("A média entre " +nota1+ " e " +nota2+ " é igual a " + media);

        // Fecha o scanner.
        sc.close();

    }
}

// Digite a nota do aluno(a): 4,5
// Digite a nota do aluno(a): 8,5
// A média entre 4.5 e 8.5 é igual a 6.5