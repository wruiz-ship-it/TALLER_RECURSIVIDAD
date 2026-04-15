
//1.Leer un numero entero y n calcular la factorial de dicho numero. 


import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero para calcular su factorial:.\n");
        int numero = leerNumero();
        if (validarNumero(numero)) {
            int resultado = factorial(numero);
            mostrarResultado(numero, resultado);
        } else {
            System.out.println("Por favor ingrese un numero entero no negativo");
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

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void mostrarResultado(int n, int resultado) {
        System.out.println("El factorial de " + n + " es: " + resultado);
    }
}