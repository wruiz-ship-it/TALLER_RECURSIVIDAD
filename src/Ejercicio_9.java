
//9. Leer 2 numeros enteros y calcular el cociente de la division entera. (sugerencia: use restas sucesivas)
 

import java.util.Scanner;

public class Ejercicio_9 {

    public static void main(String[] args) {
        System.out.println("Leer 2 numeros enteros y calcular el cociente de la division entera.\n");
        int dividendo = leerNumero("Ingrese el dividendo: ");
        int divisor = leerNumero("Ingrese el divisor: ");

        if (validar(dividendo, divisor)) {
            int cociente = divisionEntera(dividendo, divisor);
            mostrarResultado(dividendo, divisor, cociente);
        } else {
            System.out.println("Datos invalidos (divisor debe ser mayor que 0).");
        }
    }

    public static int leerNumero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public static boolean validar(int dividendo, int divisor) {
        return divisor > 0 && dividendo >= 0;
    }

    public static int divisionEntera(int dividendo, int divisor) {
        // Caso base
        if (dividendo < divisor) {
            return 0;
        }

        // Caso recursivo
        return 1 + divisionEntera(dividendo - divisor, divisor);
    }

    public static void mostrarResultado(int dividendo, int divisor, int cociente) {
        System.out.println("El cociente de " + dividendo + " / " + divisor + " es: " + cociente);
    }
}