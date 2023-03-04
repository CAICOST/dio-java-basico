import java.util.Locale;
import java.util.Scanner;

public class TestScan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();


        System.out.println("Digite seu idade");
        String idade = scanner.next();

        System.out.println("Digite sua altura");
        String altura = scanner.next();

        System.out.println("Ola princesa, você é uma garota linda!!");
        System.out.println("Seu nome é " + nome + " " + sobrenome);
        System.out.println("Sua altura é " + altura);
        System.out.println("Sua idade é " + idade);
        System.out.println("Boa noite!!");
    }
}

