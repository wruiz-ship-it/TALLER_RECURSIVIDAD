/*
13. La serie de Fibonacci puede definirse en terminos recursivos asi:
(1) Fib(1) = 1 ; Fib(0) = 0
(2) Fib(n) = Fib(n-1) + Fib(n-2) si n >= 2.
Lea un valor entero que representa el limite de la serie e imprima hasta el valor limite. 
*/

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        System.out.println("Lea un valor entero que representa el limite de la serie fibonacci e imprima hasta el valor limite.\n");
        int limite = leerNumero();
        if (validarNumero(limite)) {
            mostrarResultado(limite);
        } else {
            System.out.println("Por favor, ingrese un numero entero no negativo.");
        }
    }

    public static int leerNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el limite de la serie de Fibonacci: ");
        int n = scanner.nextInt();
        return n;
    }

    public static boolean validarNumero(int n) {
        return n >= 0;
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void mostrarResultado(int limite) {
        System.out.println("Serie de Fibonacci hasta el limite " + limite + ":");
        mostrarFibonacci(limite, 0);
    }

    public static void mostrarFibonacci(int limite, int n) {
        int fib = fibonacci(n);
        if (fib > limite) {
            return;
        }
        System.out.print(fib + " ");
        mostrarFibonacci(limite, n + 1);
    }

}