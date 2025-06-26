package Ejercicios;

/* Pedir al usuario que indique una longitud para una contraseña. Generar una contraseña aleatoria
de esa longitud, utilizando letras minúsculas, mayúsculas y números. Implementar la generación de
la contraseña dentro de un métod static String generarPassword(int longitud).*/

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("\nIngrese una longitud para una contraseña ");
    int longitud = sc.nextInt();

    System.out.println("Contraseña generada: " + generarPassword(longitud));

    }

    static String generarPassword(int longitud){

        String contrasena = "";
        String c = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random r = new Random();

        for (int i = 0; i < longitud; i++) {
            int indice = r.nextInt(c.length());
            contrasena += c.charAt(indice);

        }
        return contrasena;
    }
}
