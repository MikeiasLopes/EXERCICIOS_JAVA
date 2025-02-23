import java.util.Scanner;

public class EXERCICIO_014_AluguelCarro {
    public static void main (String[] args ){

        // A locadora de carros precisa da sua ajuda para cobrar seus serviços.
        // Escreva um programa em Java que pergunte a quantidade de km percorridos
        // por um carro alugado e a quantidade de dias pelos quais ele foi alugado.
        // Calcule o preço total a pagar, sabendo  que o carro custa R$90,00 por dia
        // e R$0,20 por km rodado.

        Scanner sc = new Scanner(System.in);

        double precoDia = 90; // Preço por dia alugado
        double precoKm = 0.20;  // Preço por km rodado

        // solicita a quantidade km rodados.
        System.out.print("Informe a quantidade de quilômetros percorridos: ");
        double km = sc.nextDouble();

        // Solicita a quantidade de dia alugado.
        System.out.print("Informe a quantidade de dias que o carro foi alugado: ");
        double dias = sc.nextDouble();

        // Calcula o preço total.
        double precoTotal = (precoDia * dias) + (precoKm * km );

        // Exibe o resultado do preço final.
        System.out.printf("Você percorreu %.0f km por %.0f dias, o preço final fica em R$ %.2f\n", km, dias, precoTotal);

        // Fecha o scanner
        sc.close();

    }
}

// Informe a quantidade de quilômetros percorridos: 300
// Informe a quantidade de dias que o carro foi alugado: 5
// Você percorreu 300 km por 5 dias, o preço final fica em R$ 510,00