package Listas;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        menuLista();
    }
    public static void menuLista() {
        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista();
        lista.registrarElementos();

        int opcion;
        do {
            System.out.println("1. Agregar un elemneto a la lista\n" +
                    "2. Ver tamaño de la lista\n" +
                    "3. Verifiar si la lista esta vacia\n" +
                    "4. Buscar elemento en la lista\n" +
                    "5. Eliminar elemento de la lista\n" +
                    "Seleccione una opción\n");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    lista.crearLista();
                    break;
                case 2:
                    lista.tamanioLista();
                    break;
                case 3:
                    lista.estaVacia();
                    break;
                case 4:
                    lista.buscarElemento();
                    break;
                case 5:
                    lista.eliminar();
                    break;
                case 6:
                    lista.compararListas();
                    System.out.println("Comparar listas");
                default:
                    System.out.println("Ingrese una opción valida");
            }
        }
        while (opcion != 7);
        scanner.close();
    }
}