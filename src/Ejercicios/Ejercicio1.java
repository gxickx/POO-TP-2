package Ejercicios;
/* TP 2 - POO - Punto 1
    Programa que solicite la carga de las notas de un alumno, hasta q se ingrese 0.
    Notas en tipo entero, No pueden ser nros negativos ni mayores a 10 al final calcular el promedio*/

    // d

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        int nota;
        ArrayList<Integer> listaNotas = new ArrayList<>();

        do {
            //carga una nota
            System.out.println(" \nIngrese una nota:");
            Scanner sc = new Scanner(System.in);


            if (sc.hasNextInt()) {
                nota = sc.nextInt();
                if (nota == 0) {
                    break;
                }
                if ((nota < 11 && nota > 0 )) {

                    // agregar nota a lista de notas
                    listaNotas.add(nota);

                } else  {
                    System.out.println("\nIngrese una nota válida entre 1 y 10.");
                }

            } else {
                System.out.println("La nota debe ser un entero.");
            }


            }
            while (true);

            double prom;
            int cont= 0;

        for (int num : listaNotas) {

            cont = cont + num;

        }

        prom = (double) cont/listaNotas.size();
        System.out.println("El promedio de las notas es: " + prom);

    }
}