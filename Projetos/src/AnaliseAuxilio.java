import java.util.Locale;
import java.util.Scanner;

public class AnaliseAuxilio {
    public static void main(String[] args) {
        int salarioMedio = 1500;
        int filhosFamilia = 2;

        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

            System.out.println("Olá, seja bem-vindo(a).É um prazer recebe-lo(a) aqui. Favor preencher as Informacoes solicitadas abaixo");

        System.out.println("Digite seu salario");
         int salario = scanner.nextInt();

        System.out.println("Digite quantos filhos tem");
         int filhos = scanner.nextInt();

            System.out.println("Após análise, vimos que você tem " + filhos + " filhos com salario de R$" + salario + " neste caso voce:");

        if (salario<=salarioMedio && filhos<=filhosFamilia){
            System.out.println("Receber auxilio");
        }
        else {
            System.out.println("Não recebe o auxilio");
        }

    }
}

