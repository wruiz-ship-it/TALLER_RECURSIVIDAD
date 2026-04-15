
//3.Leer un valor entero y calcular la sumatoria 1 + ½ +1/3+ ... 1/n.


import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        System.out.println("Leer un valor entero y calcular la sumatoria 1 + ½ +1/3+ ... 1/n.\n");
        int numero = leerNumero();
        if (validarNumero(numero)) {
            double resultado = sumatoria(numero);
            mostrarResultado(numero, resultado);
        } else {
            System.out.println("Por favor ingrese un numero entero no negativo y mayor a cero.");
        }
    }

    public static int leerNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int n = scanner.nextInt();
        return n;
    }

    public static boolean validarNumero(int n) {
        return n > 0;
    }

    public static double sumatoria(int n) {
        if (n == 0) {
            return 0;
        }
        return (1.0 / n) + sumatoria(n - 1);
    }

    public static void mostrarResultado(int n, double resultado) {
        String formula = construirFormula(n);
        System.out.println("La sumatoria de " + formula + " es: " + resultado);
    }

    public static String construirFormula(int n) {
        if (n == 1) {
            return "1";
        }
        return construirFormula(n - 1) + " + 1/" + n;
    }
}
