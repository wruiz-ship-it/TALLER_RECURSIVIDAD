
//12. Cree una matriz de tama�o mXn y sume  los elementos de la matriz.


import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        System.out.println("Cree una matriz de tama�o mXn y sume  los elementos de la matriz.\n");
        int m = leerNumero("Ingrese el numero de filas (m): ");
        int n = leerNumero("Ingrese el numero de columnas (n): ");
        if (validarNumero(m) && validarNumero(n)) {
            int[][] matriz = leerMatriz(m, n);
            int resultado = sumarMatriz(matriz, m, n);
            mostrarResultado(resultado);
        } else {
            System.out.println("Por favor, ingrese numeros enteros no negativos y mayores a cero.");
        }
    }

    public static int leerNumero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        int numero = scanner.nextInt();
        return numero;
    }

    public static boolean validarNumero(int n) {
        return n > 0;
    }

    public static int[][] leerMatriz(int m, int n) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }

    public static int sumarMatriz(int[][] matriz, int m, int n) {
        if (m == 0) {
            return 0;
        }
        if (n == 0) {
            return sumarMatriz(matriz, m - 1, matriz[0].length);
        }
        return matriz[m - 1][n - 1] + sumarMatriz(matriz, m, n - 1);
    }

    public static void mostrarResultado(int resultado) {
        System.out.println("La suma de los elementos de la matriz es: " + resultado);
    }

}