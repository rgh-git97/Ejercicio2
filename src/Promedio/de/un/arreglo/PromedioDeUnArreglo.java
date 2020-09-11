package Promedio.de.un.arreglo;

import java.util.Scanner;
import java.util.stream.IntStream;


public class PromedioDeUnArreglo {
    public static void main(String[] args) {
        String nombre;
        String matricula;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el nombre completo del alumno: ");
        nombre = teclado.nextLine();


        Scanner teclado1 = new Scanner(System.in);
        System.out.print("Introduzca la matricula del alumno: ");
        matricula = teclado1.nextLine();


        Scanner s = new Scanner(System.in);
        int calif[] = new int[5];
        int suma = 0;
        float premeds;
        System.out.println("Calificaciones Finales");
        System.out.print("Calificacion Matematicas: ");
        calif[0] = s.nextInt();

        System.out.print("Calificacion Español: ");
        calif[1] = s.nextInt();

        System.out.print("Calificacion Computacion: ");
        calif[2] = s.nextInt();

        System.out.print("Calificacion Ingles: ");
        calif[3] = s.nextInt();

        System.out.print("Calificacion Fisica: ");
        calif[4] = s.nextInt();

        premeds = (IntStream.of(0, 1, 2, 3, 4).map(i -> calif[i]).sum()) / 5;


        System.out.println("Alumno: " + nombre + "");
        System.out.println("Matricula: " + matricula + "");
        System.out.println("El promedio del alumno es: " + premeds);
        if (premeds <= 50) {
            System.out.println("Calificacion: F");
        } else if (premeds <= 60) {
            System.out.println("Calificacion: E ");

        }else if (premeds <= 70) {
            System.out.println("Calificacion: D ");

        }else if (premeds <= 80) {
            System.out.println("Calificacion: C ");

        }else if (premeds <= 90) {
            System.out.println("Calificacion: B ");

        }else if (premeds <= 100) {
            System.out.println("Calificacion: A ");

        }else if (premeds >100) {
            System.out.println("Calificacion: Error, vuelve a calcular, introduciste un dato incorrecto ");

        }
    }
}