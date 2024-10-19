package Ejercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("LIBRERIA: ");
            System.out.println("1. Agregar libro" +
                    "\n2. Eliminar libro" +
                    "\n3. Agregar un lector" +
                    "\n4. Atender lector" +
                    "\n5. Mostrar libros" +
                    "\n6. Mostrar lectores" +
                    "\n7. Salir");
            int opcion = sc.nextInt();


            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el título de un libro: ");
                    String libro = sc.nextLine();
                    libreria.agregarLibro(libro);
                    break;
                case 2:
                    libreria.eliminarLibro();
                    break;
                case 3:
                    System.out.println("Ingrese nombre del lector:");
                    String lector = sc.nextLine();
                    libreria.agregarLector(lector);
                    break;
                case 4:
                    libreria.atenderLector();
                    break;
                case 5:
                    libreria.mostrarLibros();
                    break;
                case 6:
                    libreria.mostrarLectores();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
