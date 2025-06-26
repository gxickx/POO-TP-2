package Ejercicios;
/* Solicitar al usuario que ingrese las coordenadas de dos puntos en el plano cartesiano (x1, y1) y
(x2, y2). Calcular e imprimir la distancia entre ambos puntos utilizando la fórmula de distancia
euclidiana. Implementar el cálculo dentro de un métod static double distancia(double x1, double
y1, double x2, double y2).*/

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngrese las coordenadas del eje x, separadas por espacio:");
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        System.out.println("x1 = " + x1 + ", x2 = " + x2);

        System.out.println("\nAhora ingrese las coordenadas del eje y, separadas por espacio:");
        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.println("y1 = " + y1 + ", y2 = " + y2);

        double distanciaPuntos = distancia(x1, y1, x2, y2);

        System.out.println("La distancia entre ambos puntos es: " + distanciaPuntos);


    }
    static double distancia(double x1, double y1, double x2, double y2){

        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

    }

}
