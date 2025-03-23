import java.util.Scanner;

public class EXERCICIO_024_PrecoPassagem {
    public static void main(String[] args) {

        //Faça um algoritmo que pergunte a distância que um  passageiro deseja percorrer em Km.
        //Calcule o preço da passagem, cobrando R$0.50 por Km para viagens até 200Km e  R$0.45
        //para viagens mais longas.

        Scanner scanner = new Scanner(System.in);

        //Usuário vai informar a distância que quer percorrer me quilômetros.
        System.out.print("Qual distância deseja percorrer (em Km): ");
        double distancia = scanner.nextDouble();

        //Variável preco sem valor (para uso posterior).
        double preco;

        //Vai verificar se a distância será menor ou igual a 200km.
        if (distancia <= 200) {
            //Determina o preço multiplicando a distância com 0,50.
            preco = distancia * 0.50;
            //Vai verificar se a distância for maior que 200km.
        } else {
            //Determina o preço multiplicando a distância com 0,45.
            preco = distancia * 0.45;
        }

        //Vai informar ao usuário o preço da passagem final.
        System.out.printf("O preço da passagem é: R$ %.2f", preco);

        //Fecha o scanner.
        scanner.close();

    }
}

//Qual distância deseja percorrer (em Km): 200
//O preço da passagem é: R$ 100,00

//Qual distância deseja percorrer (em Km): 400
//O preço da passagem é: R$ 180,00

//Qual distância deseja percorrer (em Km): 0,1
//O preço da passagem é: R$ 0,05