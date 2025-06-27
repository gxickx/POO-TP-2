package Ejercicios;
/* Solicitar al usuario su fecha de nacimiento (año, mes y día) y calcular su edad actual. Tener en
cuenta si ya cumplió años en el año en curso. Implementar el cálculo en un métod static int
calcularEdad(int anio, int mes, int dia).*/
import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento, separando el día, mes y año con espacios.\nEl formato deseado sería: dd mm aaaa: ");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int anio = sc.nextInt();

        System.out.println("\nSu edad es: " + calcularEdad(anio, mes, dia));

    }

    static int calcularEdad(int anio, int mes, int dia) {

        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.between(fechaNacimiento, fechaActual);

        if (fechaNacimiento.getMonth() == fechaActual.getMonth()) {
            System.out.println("\n¡¡FELIZ CUMPLEAÑOS!!");
        }
        return periodo.getYears();
    }
}
