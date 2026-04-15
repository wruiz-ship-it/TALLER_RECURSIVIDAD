
// 4. Leer un numero y sumar los di­gitos de un numero. Ejemplo: Entrada: 123 Resultado:6


import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        System.out.println("Leer un numero y sumar los di­gitos de un numero. Ejemplo: Entrada: 123 Resultado:6\n");
        int numero = leerNumero();
        if (validarNumero(numero)) {
            int resultado = sumarDigitos(numero);
            mostrarResultado(numero, resultado);
        } else {
            System.out.println("Por favor ingrese un numero entero no negativo.");
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

    public static int sumarDigitos(int n) {
        if (n == 0) {
            return 0;
        }
        int digito = n % 10;
        return digito + sumarDigitos(n / 10);
    }

    public static void mostrarResultado(int n, int resultado) {
        System.out.println("La suma de los digitos de " + n + " es: " + resultado);
    }
}