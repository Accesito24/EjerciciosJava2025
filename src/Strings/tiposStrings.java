package Strings;
import java.util.Scanner;

public class tiposStrings {

    public static void main(String[] args) {

        String a = "Hola";
        String b = " Mundo";

        // CONCATENACIÓN
        String HolaMundo = a + "" + b;
        System.out.println(HolaMundo);

        // USO DE String.format
        String holaMundo = String.format("¡%s,%s!", a, b);
        System.out.println(holaMundo);

        // LLAMAR AL METODO
        MinusculasMayusculas();
    }

    // =====================METODO SEPARADO=======================================
    public static void MinusculasMayusculas() {

        String a = "Hola";
        String b = "Mundo";

        // ===================LONGITUD DEL STRING b================================
        System.out.println(b.length());

        // ===================MAYÚSCULAS Y MINÚSCULAS==============================
        System.out.println(a.toLowerCase()); // hola
        System.out.println(a.toUpperCase()); // HOLA

        System.out.println(b.toLowerCase()); // mundo
        System.out.println(b.toUpperCase()); // MUNDO

    }
    public static void arrays() {

        // Un array es una estructura que guarda varios valores del mismo tipo.
        // Para declararlo se usa: tipo[] nombre = new tipo[tamaño];

        // Creamos un array de 6 posiciones para guardar datos de una fecha de nacimiento
        int[] fechaNac = new int[6];



    }

}
