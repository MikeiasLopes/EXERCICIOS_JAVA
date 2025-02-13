import java.util.Scanner;

public class EXERCICIO_008_Distancias {
    public static void main(String[] args) {

        //8 Desenvolva um programa em Java que leia uma distância em metros e mostre os
        //valores relativos em outras medidas.


        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma distância em metros: ");
        float metros = sc.nextFloat();

        float km = metros / 1000;
        float hm = metros / 100;
        float dam = metros / 10;
        float dm = metros * 10;
        float cm = metros * 100;
        float mm = metros * 1000;

        System.out.println("Distância de "+km+ " km");
        System.out.println("Distância de "+hm+ " hm");
        System.out.println("Distância de "+dam+ " dam");
        System.out.println("Distância de "+dm+ " dm");
        System.out.println("Distância de "+cm+ " cm");
        System.out.println("Distância de "+mm+ " mm");

    }
}
