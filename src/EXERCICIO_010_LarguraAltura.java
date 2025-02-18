import java.util.Scanner;

public class EXERCICIO_010_LarguraAltura {
    public static void main(String[] args) {

        // Faça um programa em Java que leia a largura e altura de uma parede, calcule e
        // mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
        // sabendo que  cada litro de tinta pinta uma área de 2 metros quadrados.

        Scanner sc = new Scanner(System.in);

        System.out.print("Comprimento da parede em metro: ");
        double comprimento = sc.nextDouble();

        System.out.print("Altura da parede em metro: ");
        double altura = sc.nextDouble();
        double area = altura * comprimento;
        double tinta = altura * comprimento;

        System.out.print("Area a ser pintada é " + area + " metros\nTinta necessária é de " + tinta / 2 + " litros");

    }
}

// Comprimento da parede: 25,6
// Altura da parede: 23,1
// Area a ser pintada é 591.36
// Tinta necessária é de 295.68