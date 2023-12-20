package ejercicios;

import funciones.Teclat;

public class ejVec_2 {
    public static void main(String[] args) {
        int[] expedientes = new int[5];
        int[] notas = new int[5];
        int[] edades = new int[5];
        for (int i = 0; i < 5; i++) {
            expedientes[i] = Teclat.lligInt("Expediente " + (i + 1) + ": ");
            notas[i] = Teclat.lligInt("Nota " + (i + 1) + ": ");
            edades[i] = Teclat.lligInt("Edad " + (i + 1) + ": ");
        }
        System.out.println("Expediente    Nota    Edad");
        for (int i = 0; i < edades.length; i++) {
            System.out.printf("%d             %d       %d\n", expedientes[i], notas[i], edades[i]);
        }
        boolean encontrado = false;
        while (encontrado == false) {
            int busqueda = Teclat.lligInt("Dame el numero de expediente: ");
            for (int i : expedientes) {
                if (expedientes[i-1] == busqueda) {
                    System.out.println("Expediente    Nota    Edad");
                    System.out.printf("%d             %d        %d\n", expedientes[i-1], notas[i-1], edades[i-1]);
                    encontrado = true;
                    
                }
            }
            if (encontrado == false)
                System.out.println("No se ha encontrado el expediente.");
        }
    }
}
