
// 6. Leer un numero llamado base y otro exponente y calcular la potencia elevando la base al exponente.

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        System.out.println("Leer un numero llamado base y otro exponente y calcular la potencia elevando la base al exponente.\n");
        int base = leerNumero("Ingrese la base: ");
        int exponente = leerNumero("Ingrese el exponente: ");
        if (validarNumero(base) && validarNumero(exponente)) {
            int resultado = potencia(base, exponente);
            mostrarResultado(base, exponente, resultado);
        } else {
            System.out.println("Por favor, ingrese numeros enteros no negativos. mayores a cero.");
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

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }

    public static void mostrarResultado(int base, int exponente, int resultado) {
        System.out.println(base + " elevado a " + exponente + " es: " + resultado);
    }
}