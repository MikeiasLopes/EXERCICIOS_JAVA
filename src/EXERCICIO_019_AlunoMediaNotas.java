import java.util.Scanner;

public class EXERCICIO_019_AlunoMediaNotas {
    public static void main(String[] args) {

        //Crie um algoritmo que leia o nome e as duas notas de um aluno,
        //calcule a sua média e mostre na tela. No final, analise a média e
        //mostre se o aluno teve ou não um bom aproveitamento (se ficou acima
        //da média 7.0).

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o  nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.printf("A média de " + nome + " é %.2f\nAproveitamento bom", media);
        }
        else {
            System.out.printf("A média de " + nome + " é %.2f\nAproveitamento baixo", media);
        }


        sc.close();

    }
}

//Digite o  nome do aluno: Kathiúsca
//Digite a primeira nota: 8,1
//Digite a segunda nota: 9,4
//A média de mano é 8,75
//Aproveitamento bom

//Digite o  nome do aluno: Kathiúsca
//Digite a primeira nota: 4,5
//Digite a segunda nota: 6
//A média de Mano é 5,25
//Aproveitamento baixo