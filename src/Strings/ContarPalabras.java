package Strings;

import java.util.Scanner;

public class ContarPalabras {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese una frase");
        System.out.print(" y mostraré cuantas palabras tiene: ");
        String frase = leer.nextLine();

        frase = frase.trim();
        frase = frase.replaceAll("");



        leer.close();
    }

}
