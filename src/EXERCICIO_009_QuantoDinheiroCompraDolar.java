import java.util.Scanner;

public class EXERCICIO_009_QuantoDinheiroCompraDolar {
    public static void main(String[] args) {

        // Faça um programa em Java que leia quanto dinheiro uma pessoa tem na carteira em reais
        // e mostre quantos dólares ela pode comprar. Considere US$1,00 = (cotação em 16/02/2025).

        Scanner sc = new Scanner(System.in);

        // Cotação em 16/02/2025
        double dolar = 5.70;

        // Informa a quantidade de dinheiro na carteira.
        System.out.print("Quanto dinheiro tenho na carteira: ");
        double real = sc.nextDouble();

        // Calcula a conversão.
        double conversao = real / dolar;

        // Exibe o resultado.
        System.out.printf("Com R$%.2f, você pode comprar USD%.2f", real, conversao);

    }
}

// Quanto dinheiro tenho na carteira: 100
// Com R$100,00, você pode comprar USD17,54