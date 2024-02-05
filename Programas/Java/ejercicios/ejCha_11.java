package ejercicios;

import java.util.ArrayList;
import java.util.Collections;

import funciones.Teclat;
public class ejCha_11 {
    public static void main(String[] args) {
        ArrayList<String> amigos = new ArrayList();
        System.out.println("---------AGENDA AMIGOS---------");
        boolean exit = false;
        int posicion;
        String nombre;
        char inicial;
        char confirmacion;
        while (exit == false){
            int opcion = Teclat.lligInt("1. Introducir amigo nuevo\n 2. Borrara amigo\n 3. Mostrar amigos\n 4. Filtrar por inicial\n 5. Modificar amigo\n 6. Borrar agenda\n 7. Salir\n-->>");
            switch (opcion) {
                case 1:
                    nombre = Teclat.lligString("Dame el nombre: ");
                    if (amigos.contains(nombre)) System.out.println("Ya existe un amigo con ese nombre!");
                    else amigos.add(nombre);
                    break;
                case 2:
                    nombre = Teclat.lligString("Dame el nombre: ");
                    if (amigos.contains(nombre)) amigos.remove(nombre);
                    else System.out.println("No se ha encontrado ningun amigo con ese nombre!");
                    break;
                case 3:
                    for (int i = 0; i < amigos.size(); i++) System.out.println("-" + amigos.get(i));
                    break;
                case 4:
                    inicial = Teclat.lligChar("Dame la inicial: ");
                    for (int i = 0; i < amigos.size(); i++) { 
                        if (inicial == amigos.get(i).charAt(0)) {
                            System.out.println(amigos.get(i));
                        }
                    }
                    break;
                case 5:
                    posicion = Teclat.lligInt("Dame el nombre a cambiar: ");
                    if (posicion <= amigos.size()) {
                        nombre = Teclat.lligString("Dame el nombre nuevo: ");
                        amigos.set(posicion, nombre);
                        System.out.println("Amigo modificado con exito");
                    }
                    else{
                        System.out.println("No se ha encontrado ningun amigo en esa posición!");
                    }
                break;
                case 6:
                    Collections.sort(amigos);
                    System.out.println("Lista ordenada con exito");
                    break;
                case 7:
                    confirmacion = Teclat.lligChar("Estas seguro de que quieres todos los amigos (S/n)");
                    if (confirmacion == 'S' || confirmacion == 's') {
                        amigos.clear();
                    }                    
                    break;
                default:
                    exit = true;
                    break;
            }
        }
    }
}
