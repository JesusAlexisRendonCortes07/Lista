package Ejercicio;

import java.util.*;

public class Libreria {
    private Stack<String> pilaLibros;
    private Queue<String> colaLectores;
    private List<String> listaLibros;

    public Libreria() {
        pilaLibros = new Stack<>();
        colaLectores = new LinkedList<>();
        listaLibros = new ArrayList<>();
    }

    public void agregarLibro(String libro) {
        pilaLibros.push(libro);
        listaLibros.add(libro);
        System.out.println("Libro agregado: " + libro);
    }

    public void eliminarLibro() {
        if (!pilaLibros.isEmpty()) {
            String libro = pilaLibros.pop();
            listaLibros.remove(libro);
            System.out.println("Libro eliminado: " + libro);
        } else {
            System.out.println("No hay libro que eliminar");
        }
    }

    public void agregarLector(String lector) {
        colaLectores.add(lector);
        System.out.println("Lector agregado: " + lector);
    }

    public void atenderLector() {
        if (!colaLectores.isEmpty()) {
            String lector = colaLectores.poll();
            System.out.println("Atendiendo: " + lector);
        } else {
            System.out.println("No hay nadie por atender");
        }
    }

    public void mostrarLibros() {
        if (listaLibros.isEmpty()) {
            System.out.println("No hay ningún libro en lista");
        } else {
            System.out.println("Libros en lista:");
            for (String libro : listaLibros) {
                System.out.println("- " + libro);
            }
        }
    }

    public void mostrarLectores() {
        if (colaLectores.isEmpty()) {
            System.out.println("No hay ningún lector en la cola");
        } else {
            System.out.println("Lectores en cola:");
            for (String lector : colaLectores) {
                System.out.println("- " + lector);
            }
        }
    }
}