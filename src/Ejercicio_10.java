
//10. Leer 2 numeros enteros y realizar la multiplicacion de los 2 numeros mediante sumas sucesivas.


import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {
        System.out.println("Leer 2 numeros enteros y realizar la multiplicacion de los 2 numeros.\n");
        int num1 = leerNumero("Ingrese el primer numero: ");
        int num2 = leerNumero("Ingrese el segundo numero: ");

        if (validar(num1, num2)) {
            int resultado = multiplicacion(num1, num2);
            mostrarResultado(num1, num2, resultado);
        } else {
            System.out.println("Datos invalidos (numeros deben ser mayores o iguales a 0).");
        }
    }

    public static int leerNumero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public static boolean validar(int num1, int num2) {
        return num1 >= 0 && num2 >= 0;
    }

    public static int multiplicacion(int num1, int num2) {
        // Caso base
        if (num2 == 0) {
            return 0;
        }

        // Caso recursivo
        return num1 + multiplicacion(num1, num2 - 1);
    }

    public static void mostrarResultado(int num1, int num2, int resultado) {
        System.out.println("La multiplicacion de " + num1 + " x " + num2 + " es: " + resultado);
    }

}