package EntradaYsalidas;

import java.util.Scanner;

public class CalculadoraSimple {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("=== CALCULADORA SIMPLE ===");
        System.out.println("Elige una opción:");
        System.out.println("1. Con variables");
        System.out.println("2. Sin variables");
        System.out.print("Tu elección: ");

        int opcion = leer.nextInt();

        switch(opcion) {
            case 1:
                Variables();
                break;
            case 2:
                SinVariables();
                break;
            default:
                System.out.println("Opción no válida");
        }

        leer.close();

    }

    public static void Variables() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Dame dos numero y te dire el resultado de la suma, resta y multiplicacion");
        double num1 = leer.nextDouble();
        double num2 = leer.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;

        //uso de println y print

        //println es una sola linea
        System.out.println("la suma es: " + suma + " de " + num1 + " y " + num2 );

        //print es una sola linea hasta que se le de el cierre, se puede usar cuantas veces quiera el print
        // se usa "\n" al final de la linea
        System.out.print("la resta es: "  + resta);
        System.out.print(" de los numero: " + num1 + " y " + num2 + "\n");

        System.out.println("la multiplicacion es: " + multiplicacion);

        leer.close();

    }

    public static void SinVariables() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame dos numero y te dire el resultado de la suma, resta y multiplicacion");
        double num1 = leer.nextDouble();
        double num2 = leer.nextDouble();

        System.out.println("El resultado de la suma de: " + num1 + " y " + num2 + " es: " + (num1 + num2));

        leer.close();

    }
}
