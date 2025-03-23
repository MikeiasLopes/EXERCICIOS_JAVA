import java.util.Scanner;

public class EXERCICIO_017_VelocidadeCarro {
    public static void main(String[] args) {

        //Escreva um programa que pergunte a velocidade de um carro.
        //Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário
        //foi multado. Nesse caso, exiba o valor da multa, cobrando R$5 por
        //cada Km acima da velocidade permitida.

        Scanner sc = new Scanner(System.in);

        //Usuário vai informar a velocidade do veículo.
        System.out.print("Velocidade do veículo em Km/h: ");
        double velocidade = sc.nextDouble();

        //Vai verificar se a velocidade está acima de 80 km/h.
        if (velocidade > 80) {

            //Excesso recebe a velocidade informada e subtrair por 80 (velocidade média).
            double excesso = velocidade - 80;
            //Multa recebe o excesso e multiplica por 5 (valor multa po km).
            double multa = excesso * 5;
            //Vai informar ao usuário caso tenha ultrapassado a velocidade máxima permitida.
            System.out.printf("Você foi multado! Valor da multa é R$ %.2f.", multa);

        //Vai verificar se a velocidade está igual ou menor que a mínima permitida.
        } else {
            //Vai informar ao usuário caso ele não tenha ultrapassado a velocidade máxima permitida.
            System.out.print("Velocidade no limite permitido.");
        }

        //Fecha o scanner
        sc.close();
    }
}

//Velocidade do veículo em Km/h: 80
//Velocidade no limite permitido.

//Velocidade do veículo em Km/h: 90
//Você foi multado! Valor da multa é R$ 50,00.