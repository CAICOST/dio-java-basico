import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int salarioMedio = 1500;

        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Digite seu salario");
        int salario = scanner.nextInt();

             System.out.println();

          if (salario<salarioMedio) {
            System.out.println("Receber auxilio");
        }
                else {
                    System.out.println("Não recebe");
        }

    }
}