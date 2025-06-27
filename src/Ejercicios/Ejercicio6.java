package Ejercicios;
/*Pedir al usuario que ingrese una frase. El programa debe mostrar la cantidad de palabras, la
cantidad de vocales y la palabra más larga de la frase. Realizar el procesamiento dentro de un
métod void analizarTexto(String frase).*/
import java.util.Scanner;
import java.lang.String;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase ");
        String frase = sc.nextLine();

        analizarTexto(frase);

    }

    public static void analizarTexto(String frase){
        char letra;
        String palabraActual = "", palabraMasLarga = "";
        int contador = 0;
        for (int i = 0; i < frase.length(); i++){
            letra = Character.toLowerCase(frase.charAt(i));
            if (letra == 'a' || letra == 'e' || letra == 'i'|| letra == 'o'|| letra == 'u'){
                contador++;
            }
            if (letra != ' '){
                palabraActual += letra;
            } else {
                if (palabraActual.length() > palabraMasLarga.length()){
                    palabraMasLarga = palabraActual;
                }
                palabraActual = "";

            }
        }
        if (palabraActual.length() > palabraMasLarga.length()) {
            palabraMasLarga = palabraActual;
        }
        System.out.println("La cantidad de vocales es: " + contador + "\nLa palabra mas larga es: " + palabraMasLarga);

    }

}
