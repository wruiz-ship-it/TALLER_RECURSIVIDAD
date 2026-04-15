
//8. Realizar un programa que permita copiar una cadena en otra.


import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        System.out.println("programa que permita copiar una cadena en otra.\n");
        String cadenaOriginal = leerCadena();
        String cadenaCopiada = copiarCadena(cadenaOriginal);
        mostrarResultado(cadenaOriginal, cadenaCopiada);
    }

    public static String leerCadena() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();
        return cadena;
    }

    public static String copiarCadena(String cadena) {
        if (cadena.isEmpty()) {
            return "";
        }
        char primerCaracter = cadena.charAt(0);
        String restoCadena = cadena.substring(1);
        return primerCaracter + copiarCadena(restoCadena);
    }

    public static void mostrarResultado(String original, String copiada) {
        System.out.println("Cadena original: " + original);
        System.out.println("Cadena copiada: " + copiada);
    }
}