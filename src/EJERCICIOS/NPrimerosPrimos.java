package Bucles;

import java.util.Scanner;

public class NPrimerosPrimos {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int contadorPrimos = 2;
        int num = scan.nextInt();
        int contadorNumeros = 3;


        System.out.print("1, 2, ");

        do {
            boolean esPrimo = true;

            for (int i = 3; i <= (contadorNumeros / 2); i += 2) {
                if (contadorNumeros % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                contadorPrimos++;
                System.out.print(contadorNumeros + ", ");
            }

            contadorNumeros = contadorNumeros + 2;

        } while (contadorPrimos < num);

        scan.close();
    }
}