import java.util.Scanner;

public class EXERCICIO_017_VelocidadeCarro {
    public static void main(String[] args) {

        //Escreva um programa que pergunte a velocidade de um carro.
        //Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário
        //foi multado. Nesse caso, exiba o valor da multa, cobrando R$5 por
        //cada Km acima da velocidade permitida.

        Scanner sc = new Scanner(System.in);

        System.out.print("Velocidade do veículo em Km/h: ");
        double velocidade = sc.nextDouble();

        if (velocidade > 80) {
            double excesso = velocidade - 80;
            double multa = excesso * 5;
            System.out.printf("Você foi multado! Valor da multa é R$ %.2f.", multa);
        } else {
            System.out.print("Velocidade no limite permitido.");
        }

        sc.close();
    }
}

//Velocidade do veículo em Km/h: 80
//Velocidade no limite permitido.

//Velocidade do veículo em Km/h: 90
//Você foi multado! Valor da multa é R$ 50,00.