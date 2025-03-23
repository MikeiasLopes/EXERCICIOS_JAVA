import java.util.Scanner;

public class EXERCICIO_024_PrecoPassagem {
    public static void main(String[] args) {

        //Faça um algoritmo que pergunte a distância que um  passageiro deseja percorrer em Km.
        //Calcule o preço da passagem, cobrando R$0.50 por Km para viagens até 200Km e  R$0.45
        //para viagens mais longas.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual distância deseja percorrer (em Km): ");
        double distancia = scanner.nextDouble();

        double precoPassagem;

        if (distancia <= 200) {
            precoPassagem = distancia * 0.50;
        } else {
            precoPassagem = distancia * 0.45;
        }

        System.out.printf("O preço da passagem é: R$ %.2f\n", precoPassagem);

        scanner.close();
    }
}