import java.util.Scanner;

public class EXERCICIO_010_LarguraAltura {
    public static void main(String[] args) {

        // Faça um programa em Java que leia a largura e altura de uma parede, calcule e
        // mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
        // sabendo que  cada litro de tinta pinta uma área de 2 metros quadrados.

        Scanner sc = new Scanner(System.in);

        // Pede o comprimento da parede.
        System.out.print("Comprimento da parede em metro: ");
        double comprimento = sc.nextDouble();

        // Pede a altura da parede.
        System.out.print("Altura da parede em metro: ");
        double altura = sc.nextDouble();

        // Calcula a area que será pintada.
        double area = altura * comprimento;

        //Calcula a tinta necessária, 1 l pinta 2 m²).
        double tinta = area / 2;


        // Exibe o resultado.
        System.out.print("Area a ser pintada é " + area + " metros\nTinta necessária é de " + tinta / 2 + " litros");

        // Fecha o scanner
        sc.close();

    }
}

// Comprimento da parede em metro: 30
// Altura da parede em metro: 3
// Area a ser pintada é 90.0 metros
// Tinta necessária é de 22.5 litros