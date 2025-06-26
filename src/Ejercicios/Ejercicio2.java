package Ejercicios;

/* Desarrolle un programa que solicite al usuario una frase y determine si es un palíndromo,
ignorando espacios, signos y mayúsculas. Para ello defina un métod static boolean
esPalindromo(String frase). */

import java.util.Scanner;

public class Ejercicio2 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("\nIngrese una frase: ");
            String frase = sc.nextLine();

            if (esPalindromo(frase)){

                System.out.println("Es un palíndromo!");

            } else{
                System.out.println("No es un palindromo :(");
            }

    }

    public static boolean esPalindromo(String frase) {

        frase = frase.toLowerCase().replaceAll("[^a-z0-9áéíóúüñ]", "");
        System.out.println(frase);
        for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) != frase.charAt(frase.length() - 1 - i)) {
                    return false;
                }
            }

            return true;
    }
}
