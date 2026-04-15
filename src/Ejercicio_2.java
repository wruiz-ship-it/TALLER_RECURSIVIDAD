
//2. Leer un numero entero e invertirlo. Por ejemplo: Entrada 123 y salida 321

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        System.out.println("Leer un numero entero e invertirlo. Por ejemplo: Entrada 123 y salida 321.\n");
        int numero = leerNumero();
        if (validarNumero(numero)) {
            int resultado = invertir(numero, 0);
            mostrarResultado(numero, resultado);
        } else {
            System.out.println("Por favor, ingrese un numero entero no negativo.");
        }
    }

    public static int leerNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int n = scanner.nextInt();
        return n;
    }

    public static boolean validarNumero(int n) {
        return n >= 0;
    }

    private static int invertir(int n, int resultado) {
        // System.out.println("Valor actual de n: " + n + ", resultado: " + resultado);
        if (n == 0) {
            return resultado;
        }
        int digito = n % 10;
        resultado = resultado * 10 + digito;
        return invertir(n / 10, resultado);
    }

    public static void mostrarResultado(int n, int resultado) {
        System.out.println("El numero invertido de " + n + " es: " + resultado);
    }
}