package Arrays;

import java.util.Scanner;

/*
Programa que leia um vetor de 6 caracteres
e diga quantas consoantes foram lidas.
 */
public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantConsoantes = 0;

        int count = 0;

        do {
            System.out.println("Letra: ");
            String letra = scan.next();

                if(!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))){

                    consoantes[count] = letra;
                    quantConsoantes++;
                }
            count++;

        } while (count < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante: consoantes) {
            if ( consoante != null) //Utilizado para não mostra os locais que estão vazio no Arrays
                System.out.println(consoante);

        }

    }
}
