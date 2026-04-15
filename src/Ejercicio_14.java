/*
14.La funcion de Ackerman se define como:
Ackerman (m, n) = n + 1						 si m = 0
Ackerman (m, n) = Ackerman (m - 1, 1) 				si m > 0 y n = 0
Ackerman (m, n) = Ackerman (m - 1, Ackerman (m, n - 1)) 	si m > 0 y n > 0
Ej.  Si se tiene Ackermann (1, 2) = 4;	 Ackermann (3, 2) = 29
Realice un programa para encontrar el valor de la funcion de Ackerman, para dos valores enteros m, n.
*/



import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        System.out.println("programa para encontrar el valor de la funcion de Ackerman, para dos valores enteros m, n.\n");
        int m = leerNumero("Ingrese el valor de m: ");
        int n = leerNumero("Ingrese el valor de n: ");
        if (validarNumero(m) && validarNumero(n)) {
            int resultado = ackerman(m, n);
            mostrarResultado(m, n, resultado);
        } else {
            System.out.println("Por favor, ingrese numeros enteros no negativos.");
        }
    }

    public static int leerNumero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        int n = scanner.nextInt();
        return n;
    }

    public static boolean validarNumero(int n) {
        return n >= 0;
    }

    public static int ackerman(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ackerman(m - 1, 1);
        } else {
            return ackerman(m - 1, ackerman(m, n - 1));
        }
    }

    public static void mostrarResultado(int m, int n, int resultado) {
        System.out.println("Ackerman(" + m + ", " + n + ") = " + resultado);
    }

}