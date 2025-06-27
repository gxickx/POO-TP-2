package Ejercicios;
/*Pedir al usuario que ingrese una cadena de texto. El programa debe comprimir la cadena usando
el métod Run-Length Encoding (RLE), que consiste en reemplazar secuencias de caracteres
repetidos por el carácter seguido de la cantidad de repeticiones. Por ejemplo, la cadena "aaabbbcc"
se comprime como "a3b3c2". El programa debe incluir una función estática para comprimir el texto
y otra función estática para descomprimirlo. La función comprimir debe recibir una cadena y
devolver su versión comprimida. La función descomprimir debe recibir una cadena comprimida y
devolver el texto original. */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto ");
        String texto = sc.nextLine();

        System.out.println("Su texto comprimido en RLE es: " + comprimirRLE(texto));
        System.out.println("Su texto descomprimido en RLE es: " + descomprimirRLE(texto));

    }

    public static String comprimirRLE(String texto) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            int contador = 1;
            while (i < texto.length() - 1 && texto.charAt(i) == texto.charAt(i + 1)) {
                contador++;
                i++;
            }
        sb.append(texto.charAt(i)).append(contador);
        }
        return sb.toString();
    }
    public static String descomprimirRLE(String texto) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                int contador = Character.getNumericValue(texto.charAt(i));
                while (contador-- != 1) sb.append(texto.charAt(i-1));
            } else {
                sb.append(texto.charAt(i));
            }
        }
        return sb.toString();
    }
}
