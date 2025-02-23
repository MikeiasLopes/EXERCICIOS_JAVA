import java.util.Scanner;

public class EXERCICIO_012_PrecoPromocional {
    public static void main (String[] args) {

        // Crie um programa em Java que leia o preço
        // de um produto, calcule e mostre o seu  PREÇO PROMOCIONAL,
        // com 5% de desconto.

        Scanner sc = new Scanner(System.in);

        // Solicita o valor do produto.
        System.out.print("Informe o valor do produto: ");
        double preco = sc.nextDouble();

        // Calcula o desconto de 5%.
        double promocao = preco - (preco * 0.05);

        // Exibe o resultado.
        System.out.printf("Preço promocional com 5%% de desconto é R$%.2f", promocao);

        // Fecha o scanner
        sc.close();

    }
}

// Informe o valor do produto: 100
// Preço promocional com 5% de desconto é R$ 95.0