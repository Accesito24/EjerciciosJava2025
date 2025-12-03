package arrays;
import java.util.Scanner;

public class SumarArrays {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //Programa que declare tres Arrayes ‘Array1’, ‘Array2’ y ‘Array3’ de cinco enteros cada uno, pida valores para ‘Array1’ y ‘Array2’ y calcule Array3=Array1+Array2.

        int[] Array1 = new int[5];
        int[] Array2 = new int[5];
        int[] Array3 = new int[5];

        System.out.println("Introduce 5 números para el Array1:");

        for (int i = 0; i < Array1.length; i++) {
            Array1 [i]= leer.nextInt();
            
        }
        }
    }


