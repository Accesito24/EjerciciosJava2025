package arrays;
import java.util.Scanner;

public class ArrayMaximoMinimo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe números separados por comas: ");
        String entrada = scanner.nextLine();

        // Convertir el texto en un array de Strings
        String[] partes = entrada.split(",");

        // Crear un array de enteros
        int[] numeros = new int[partes.length];

        // Convertir cada parte a número
        for (int i = 0; i < partes.length; i++) {
            numeros[i] = Integer.parseInt(partes[i].trim());
        }

        // Tomar el primer número como base
        int max = numeros[0];
        int min = numeros[0];

        // Buscar máximo y mínimo
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
            }
                }

        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);

        scanner.close();
    }
}
