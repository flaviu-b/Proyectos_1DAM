package ejercicios;

import java.util.ArrayList;
import java.util.List;
import funciones.Teclat;

public class ajedrez_limpio {
    public static void main(String[] args) {
        int filas = 0;
        int columnas = 0;
        int posicionColocarI;
        int posicionColocarJ;
        int posicionMoverI;
        int posicionMoverJ;
        char posicionMoverJ_letra;
        char posicionColocarJ_letra;
        char letraColumnas = 'o';
        boolean exit = false;
        boolean sustituir = false;
        char piezaColocar = 'O';
        char letras[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I' };
        List<Character> letrasNecesarias = new ArrayList<>();
        while ((filas <= 2 || filas > 9) || (columnas <= 2 || columnas > 9)) {
            filas = Teclat.lligInt("Dame el numero de filas que tendra el tablero");
            columnas = Teclat.lligInt("Dame el numero de columnas que tendra el tablero");
            letraColumnas = letras[columnas - 1];
        }
        for (int i = 0; i < columnas; i++) {
            letrasNecesarias.add(letras[i]);
        }
        // Relleno el tablero con espacios
        char tablero[][] = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = ' ';
            }
        }
        // Bucle principal
        while (exit == false) {
            System.out.print(" ");
            for (char letra : letrasNecesarias) {
                System.out.print(" " + letra + " ");
            }
            System.out.println();
            for (int i = 0; i < filas; i++) {
                System.out.print(i + 1);
                for (int j = 0; j < columnas; j++) {
                    System.out.print("[" + tablero[i][j] + "]");
                }
                System.out.println();
            }
            int opcion = Teclat.lligInt(
                    "1. Colocar una pieza\n2. Mostrar movimientos de una pieza\n3. Borrar movimientos\n4. Borrar tablero\n5. Salir\n");
            switch (opcion) {
                case 1:
                    piezaColocar = 'O';
                    while (piezaColocar != 'T' && piezaColocar != 'R' && piezaColocar != 'D' && piezaColocar != 'C'
                            && piezaColocar != 'A') {
                        piezaColocar = Teclat
                                .lligChar("Que pieza desea colocar?(D->dama|R->rey|T->torre|C->caballo|A->alfil)");
                    }
                    do {
                        posicionColocarI = Teclat.lligInt("Dime la posición\nFila (numero [1-"+filas+"])") - 1;
                        posicionColocarJ_letra = Teclat.lligChar("Columna (letra [A-"+letraColumnas+"])");
                        posicionColocarJ = funcionesAjedrez.ConvertChar(posicionColocarJ_letra) - 1;
                    } while ((posicionColocarI >= filas || posicionColocarI < 0)
                            || (posicionColocarJ >= columnas || posicionColocarJ < 0));

                    if (tablero[posicionColocarI][posicionColocarJ] == 'D'
                            || tablero[posicionColocarI][posicionColocarJ] == 'R'
                            || tablero[posicionColocarI][posicionColocarJ] == 'T'
                            || tablero[posicionColocarI][posicionColocarJ] == 'C'
                            || tablero[posicionColocarI][posicionColocarJ] == 'A') {
                        sustituir = Teclat.lligBoolean(
                                "Esta casilla esta ocupada por otra pieza, deseas sustituirla por la nueva pieza? ");
                        if (sustituir) {
                            tablero[posicionColocarI][posicionColocarJ] = piezaColocar;
                        }
                    } else
                        tablero[posicionColocarI][posicionColocarJ] = piezaColocar;
                    break;
                case 2:
                    do {
                        posicionMoverI = Teclat.lligInt("Dame la posición\nFila (numero [1-" +filas+ "]):") - 1;
                        posicionMoverJ_letra = Teclat.lligChar("Columno (letra [A-"+letraColumnas+"]):");
                        posicionMoverJ = funcionesAjedrez.ConvertChar(posicionMoverJ_letra) - 1;
                    } while ((posicionMoverI >= filas || posicionMoverI < 0)
                            || (posicionMoverJ >= columnas || posicionMoverJ < 0));

                    System.out.println(tablero[posicionMoverI][posicionMoverJ]);
                    switch (tablero[posicionMoverI][posicionMoverJ]) {
                        case 'T':
                            funcionesAjedrez.MoverTorre(posicionMoverI, posicionMoverJ, tablero, filas, columnas);
                            break;
                        case 'A':
                            funcionesAjedrez.MoverAlfil(posicionMoverI, posicionMoverJ, tablero, filas, columnas);
                            break;
                        case 'D':
                            funcionesAjedrez.MoverTorre(posicionMoverI, posicionMoverJ, tablero, filas, columnas);
                            funcionesAjedrez.MoverAlfil(posicionMoverI, posicionMoverJ, tablero, filas, columnas);
                            break;
                        case 'R':
                            funcionesAjedrez.MoverRey(posicionMoverI, posicionMoverJ, tablero, filas, columnas);
                            break;
                        case 'C':
                            funcionesAjedrez.MoverCaballo(posicionMoverI, posicionMoverJ, tablero, filas, columnas);
                            break;
                        default:
                            System.out.println("Esta casilla esta vacia.");
                            break;
                    }
                    break;
                case 3:
                    int marcas_eliminadas = 0;
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            if (tablero[i][j] == '.') {
                                tablero[i][j] = ' ';
                                marcas_eliminadas++;
                            }
                        }
                    }
                    System.out.println("Se han borrado con exito {" + marcas_eliminadas + "} marcas");
                    break;
                case 4:
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            tablero[i][j] = ' ';
                        }
                    }
                    System.out.println("Se han borrado todas las marcas y fichas del tablero con exito!");
                    break;
                case 5:
                    char confirmacion;
                    confirmacion = Teclat.lligChar("Estas seguro de que quieres salir del programa?(S/n)");
                    if (confirmacion == 'S' || confirmacion == 's') {
                        System.out.println("Saliendo...");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println(
                            "Debes elegir una de las 5 opciones introduciendo, [1-5]");
                    break;
            }
        }
    }
}