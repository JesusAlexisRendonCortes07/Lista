package Listas;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    List<String>lista=new ArrayList<>();
    public void crearLista(){
       for(String item: lista){
           System.out.println(""+item);
       }


    }
    public void registrarElementos(){
        lista.add("México");
        lista.add("U.S.A");
        lista.add("Canadá");
    }


        //Método para devolver la cantidad de elementos de la lista
    public void tamanioLista(){
        System.out.println("El tamaño de la lista es de "+lista.size()+"elementos");
    }
    public void estaVacia(){
        if(lista.isEmpty()){
            System.out.println("La lista está vacía");
        }else{
            System.out.println("La lista NO está vacía");
        }
    }


    public void buscarElemento() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el elemento que desea buscar en la lista: ");
        String elemento= scanner.next();

        if (lista.contains(elemento)){
            System.out.println("El elemento "+ elemento+ "sí se encuentra el elemento en la lista:)");
        }else{
            System.out.println("El elemento "+elemento+ "NO se encuenta en la lista:)");
        }
    }
    public void eliminar(){
        Scanner scanner=new Scanner(System.in);
    System.out.println("¿Qué desea eliminar?\n" +
            "1. Un elemento de la lista\n "+
            "2. Toda la lista\n ");
    int opcion = scanner.nextInt();
    switch (opcion){
        case 1:
            System.out.print("Ingrese la palabra que desea eliminar: ");
            String elemneto= scanner.next();

            if (lista.remove(elemneto)){
                System.out.println("El elmento "+ elemneto+ "fue eliminado de la lista ");
            }else{
                System.out.println("El elemento no se encuentra dentro de la lista, por lo tanto no es posible eliminarlo:(");
            }
            break;
        case 2:
            lista.clear();
            System.out.println("Los elementos de la lista fueron eliminados");
            break;
    }
    }

    public void compararListas() {
        List<String> lista2=new ArrayList<>();
        List<String> lista3=new ArrayList<>();

        lista2.add("Peter");
        lista3.add("Peter");

        if (lista2.equals(lista3)){
            System.out.println("Las listas son identicas");
        }else{
            System.out.println("Las listas son distintas");
        }
    }
}
