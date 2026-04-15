
//11. Leer n valores enteros, almacenarlos en un arreglo y realizar la suma de los elementos del vector.


import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        System.out.println("Leer n valores enteros, almacenarlos en un arreglo y realizar la suma de los elementos del vector.\n");
        int n = leerNumero("Ingrese la cantidad de numeros enteros: ");
        if (validarNumero(n)) {
            int[] arreglo = leerArreglo(n);
            int resultado = sumarArreglo(arreglo, n);
            mostrarResultado(resultado);
        } else {
            System.out.println("Por favor, ingrese un numero entero no negativo y mayor a cero.");
        }
    }

    public static int leerNumero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        int n = scanner.nextInt();
        return n;
    }

    public static boolean validarNumero(int n) {
        return n > 0;
    }

    public static int[] leerArreglo(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            arreglo[i] = sc.nextInt();
        }
        return arreglo;
    }

    public static int sumarArreglo(int[] arreglo, int n) {
        if (n == 0) {
            return 0;
        }
        return arreglo[n - 1] + sumarArreglo(arreglo, n - 1);
    }

    public static void mostrarResultado(int resultado) {
        System.out.println("La suma de los elementos del arreglo es: " + resultado);
    }

}