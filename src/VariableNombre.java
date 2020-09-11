import java.util.Scanner;

public class VariableNombre {
    public static void main(String[] args) {
        String nombre;
        String matricula;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el nombre del alumno: ");
        nombre = teclado.nextLine();


        Scanner teclado1 = new Scanner(System.in);
        System.out.print("Introduzca la matricula del alumno ");
        matricula = teclado1.nextLine();


        System.out.print("Alumno: " + nombre + " Matricula: " + matricula + "");

    }

}
