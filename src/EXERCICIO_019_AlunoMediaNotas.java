import java.util.Scanner;

public class EXERCICIO_019_AlunoMediaNotas {
    public static void main(String[] args) {

        //Crie um algoritmo que leia o nome e as duas notas de um aluno,
        //calcule a sua média e mostre na tela. No final, analise a média e
        //mostre se o aluno teve ou não um bom aproveitamento (se ficou acima
        //da média 7.0).

        Scanner sc = new Scanner(System.in);

        //Usuário vai digitar o nome do aluno.
        System.out.print("Digite o  nome do aluno: ");
        String nome = sc.nextLine();

        //Usuário vai digitar a primeira nota do aluno.
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        //Usuário vai digitar a segunda nota do aluno.
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        //Vai calcular a média, somando as duas notas e dividindo por 2.
        double media = (nota1 + nota2) / 2;

        //Vai verificar se a nota for igual ou maior que 7.
        if (media >= 7) {
            //Vai informar ao usuário a média do aluno e se teve um bom aproveitamento de nota.
            System.out.printf("A média de " + nome + " é %.2f\nAproveitamento bom", media);
        }
        //Vai verificar se a nota for inferior a 7.
        else {
            //Vai informar ao usuário a média do aluno e se teve um baixo aproveitamento de nota.
            System.out.printf("A média de " + nome + " é %.2f\nAproveitamento baixo", media);
        }

        //fecha o scanner.
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