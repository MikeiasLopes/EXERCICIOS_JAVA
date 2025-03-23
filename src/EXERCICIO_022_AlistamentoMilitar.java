import java.util.Scanner;
import java.time.Year;

public class EXERCICIO_022_AlistamentoMilitar {
    public static void main(String[] args) {

        //Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
        //situação em relação ao alistamento militar. • Se estiver antes dos 18 anos,
        //mostra em quantos anos faltam para o alistamento.
        //Se já tiver depois dos 18 anos, mostra quantos anos já se passaram do alistamento.

        Scanner sc = new Scanner(System.in);

        //Usuário vai digitar a data de seu nascimento.
        System.out.print("Digite seu ano de nascimento: ");
        int AnoNasc = sc.nextInt();

        //Vai sempre determinar o ano atual.
        int AnoAtual = Year.now().getValue();
        //Vai realizar a subtração do ano atual com o ano de nascimento do usuário.
        int idade = AnoAtual - AnoNasc;

        //Vai verificar se a idade do usuário será maior ou igual a 18 anos.
        if (idade >= 18) {
            //Vai informar ao usuário quantos anos de passaram da data prevista para o alistamento militar.
            //Vai usar a variável idade e subtrair com a idade padrão para o alistamento (18).
            System.out.printf("Já se passaram %d anos da data prevista para seu alistamento militar.", idade - 18);
        }
        //Vai verificar se a idade do usuário é menor que 18 anos.
        else {
            //Vai informar ao usuário quantos anos faltam para o alistamento militar.
            //Vai usar a variável idade e subtrair com a idade padrão para o alistamento (18).
            System.out.printf("Faltam %d anos para seu alistamento militar.", 18 - idade);
        }

        //fecha o scanner.
        sc.close();
    }
}

//Digite seu ano de nascimento: 2010
//Faltam 3 anos para seu alistamento militar.

//Digite seu ano de nascimento: 2001
//Já se passaram 6 anos da data prevista para seu alistamento militar.