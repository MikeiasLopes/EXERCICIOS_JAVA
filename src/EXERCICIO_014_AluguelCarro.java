import java.util.Scanner;

public class EXERCICIO_014_AluguelCarro {
    public static void main (String[] args ){

        // A locadora de carros precisa da sua ajuda para cobrar seus serviços.
        // Escreva um programa em Java que pergunte a quantidade de km percorridos
        // por um carro alugado e a quantidade de dias pelos quais ele foi alugado.
        // Calcule o preço total a pagar, sabendo  que o carro custa R$90,00 por dia
        // e R$0,20 por km rodado.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de quilômetros percorridos: ");
        double km = sc.nextDouble();

        System.out.print("Informe a quantidade de dias que o carro foi alugado: ");
        double dias = sc.nextDouble();

        System.out.print("Informe o valor por quilômetro rodado: ");
        double PrecoKm = sc.nextDouble();

        System.out.print("Informe o valor por dia alugado: ");
        double PrecoDia = sc.nextDouble();

        double PrecoTotal = (PrecoDia * dias) + (PrecoKm * km );

        System.out.printf("Você percorreu %.0f km por %.0f dias, o preço final fica em R$%.2f", km, dias, PrecoTotal);

    }
}

// Informe a quantidade de quilômetros percorridos: 1000
// Informe a quantidade de dias que o carro foi alugado: 30
// Informe o valor por quilômetro rodado: 0,20
// Informe o valor por dia alugado: 90
// Você percorreu 1000 km por 30 dias, o preço final fica em R$ 90006,00