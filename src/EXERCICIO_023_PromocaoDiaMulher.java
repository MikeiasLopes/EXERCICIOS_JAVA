import java.util.Scanner;

public class EXERCICIO_023_PromocaoDiaMulher {
    public static void main(String[] args) {

        //Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
        //para todos, mas especialmente para mulheres. Faça um programa que leia nome,
        //sexo e o valor das compras do cliente calcule o preço com desconto. Sabendo
        //que: Homens ganham 5% de desconto e Mulheres ganham 13% de desconto

        Scanner sc = new Scanner(System.in);

        //Usuário vai digitar o nome do cliente.
        System.out.print("Informe o nome do cliente: ");
        String nome = sc.nextLine();

        //Usuário vai informar se o(a) cliente é M == Masculino ou F == Feminino.
        System.out.print("Informe o sexo (M ou F): ");
        String sexo = sc.nextLine();

        //Usuário vai informar o valor da compra do cliente.
        System.out.print("Informe a valor de sua compra: ");
        double compra = sc.nextDouble();

        //Variável desconto sem valor (criada para uso posterior).
        double desconto;

        //Vai verificar se a cliente é do sexo Feminino == F ou == f.
        if (sexo.equals("F") || sexo.equals("f")) {
            //Desconto de 13% caso seja mulher.
            desconto = 0.13;
        }
        //Vai verificar se o cliente é do sexo Masculino == M ou == m.
        else if (sexo.equals("M") || sexo .equals("m")) {
            //Desconto de 05% caso seja homem.
            desconto = 0.05;
        }
        //Vai verificar caso o cliente não se identifique com nenhum dos sexos e deixá-lo em branco.
        else  {
            //Desconto de 00% caso o cliente não se identifique com nenhum dos sexos informado.
            desconto = 0;
        }

        //Variável valor irá calcular o desconto. Multiplica a compra com o desconto (determinando o valor
        //de desconto) e em seguida, subtrai pela compra (determinando o valor final com desconto).
        double valor = compra - (compra * desconto);
        //Variável criada para informar ao usuário o valor do desconto na tela final.
        double x = compra * desconto;

        //Vai informar ao usuário na tela final o: Nome do cliente; Valor da compra; Valor do desconto; Valor a pagar.
        System.out.printf(
                """
                        Nome do cliente: %s
                        Valor da compra:R$ %.2f
                        Valor do desconto:R$ %.2f
                        Valor a pagar:R$ %.2f""", nome , compra , x , valor);

        //Fecha o scanner.
        sc.close();

    }

}

//Informe o nome do cliente: Kathiúsca
//Informe o sexo (M ou F): F
//Informe a valor de sua compra: 10000
//Nome do cliente: Kathiúsca
//Valor da compra:R$ 10000,00
//Valor do desconto:R$ 1300,00
//Valor a pagar:R$ 8700,00

//Informe o nome do cliente: Bregogério
//Informe o sexo (M ou F): M
//Informe a valor de sua compra: 10000
//Nome do cliente: Bregogério
//Valor da compra:R$ 10000,00
//Valor do desconto:R$ 500,00
//Valor a pagar:R$ 9500,00

//Informe o nome do cliente: Bragantino
//Informe o sexo (M ou F):
//Informe a valor de sua compra: 10000
//Nome do cliente: Bragantino
//Valor da compra:R$ 10000,00
//Valor do desconto:R$ 0,00
//Valor a pagar:R$ 10000,00