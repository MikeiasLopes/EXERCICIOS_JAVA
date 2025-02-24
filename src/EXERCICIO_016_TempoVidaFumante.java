import java.util.Scanner;

public class EXERCICIO_016_TempoVidaFumante {
    public static void main(String[] args) {

        // Escreva um programa em Java para calcular a redução do tempo de vida de
        // fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele já
        // fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule quantos
        // dias de vida um fumante perderá e exiba o total em dias.

        Scanner sc = new Scanner(System.in);

        // Quer saber quantos cigarros fuma por dia.
        System.out.println("Quantos cigarros fuma por dia?");
        int quantidade = sc.nextInt();

        // Quer saber quantos anos já fumou.
        System.out.println("Quantos anos fumando?");
        int anos = sc.nextInt();

        int minutosPorCigarro = 10; // A cada cigarro fumado, perde 10 min de vida.
        int minutosPorDia = quantidade * minutosPorCigarro; // Total de minutos perdidos por dia.
        int minutosPorAno = minutosPorDia * 365; // Total de minutos perdidos por ano.
        int minutosPerdidos = minutosPorAno * anos; // Calcula os minutos perdidos por ano de fumo.
        int diasPerdidos = minutosPerdidos / 1440; //Converte de minuto para dia.
        int anoPerdidos = diasPerdidos / 365; // Converte de dia para ano.

        // Exibe o resultado.
        System.out.println("Você já perdeu " + diasPerdidos + " dias de vida, o que equivale a cerca de " +
                anoPerdidos + " ano(s).");

        // Fecha o scanner.
        sc.close();

    }
}

// Quantos cigarros fuma por dia?
// 12
// Quantos anos fumando?
// 30
// Você já perdeu aproximadamente 912 dias de vida, o que equivale a cerca de 2 ano(s)