import java.util.Scanner;

public class EXERCICIO_009_QuantoDinheiroCompraDolar {
    public static void main(String[] args) {

        // Faça um programa em Java que leia quanto dinheiro uma pessoa tem na carteira (em R$)
        // e mostre quantos dólares ela pode comprar. Considere US$1,00 = (cotação em 16/02/2025).

        Scanner sc = new Scanner(System.in);

        double dolar = 5.70; // Cotação em 16/02/2025

        System.out.print("Quanto dinheiro tenho na carteira: ");
        double real = sc.nextDouble();

        double conversao = real / dolar;

        System.out.printf("Com %.2f reais, você pode comprar %.2f dólar americano", real, conversao);

    }
}

// Quanto dinheiro tenho na carteira: 100
// Com 100,00 reais, você pode comprar 17,54 dólar americano