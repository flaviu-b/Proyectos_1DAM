package ejercicios;
import java.util.Random;

import funciones.Teclat;
public class BuscaminesBrehariuFlaviu {
    static char tapado = ' ';
    public static void main(String[] args) {
        char tableroVisible[][] = creaTableroVisible();
        int Qminas = Teclat.lligInt("Cuantas minas quieres que tenga el tablero?(3-25): ", 3, 25);
        boolean tableroMinas[][] = creaTableroMinas(tableroVisible, Qminas);
        boolean exit = false;
        int posicionC;
        int posicionF;
        while (exit = false) {
        posicionF = Teclat.lligInt("Dame la posición de la casilla con la que desea interactuar.\nFila",1,tableroVisible[0].length) - 1;
        posicionC = Teclat.lligInt("Columna",1,tableroVisible.length) - 1;

        }        
    }

    private static char[][] creaTableroVisible(){

        int filas = Teclat.lligInt("Dame el numero de filas del busaminas", 5, 15);
        int columnas = Teclat.lligInt("Dame el numero de columnas del busaminas", 5, 15);
        char tablero[][] = new char[filas][columnas];
        for (int i = 0; i < tablero[0].length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = tapado;
            }
        }
        return tablero;
    }

    private static boolean[][] creaTableroMinas(char tableroVisible[][] ,int Qminas){
        boolean tablero[][] = new boolean[tableroVisible[0].length][tableroVisible.length];
        int filaAleatoria;
        int columnaAleatoria;
        for (int i = 0; i < tablero[0].length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = false;
            }
        }
        Random random = new Random();
        for (int i = 0; i < Qminas; i++) {
            filaAleatoria = random.nextInt(tablero[0].length);
            columnaAleatoria = random.nextInt(tablero.length);
            tablero[filaAleatoria][columnaAleatoria] = true;
        }
        /* Esta parte solo muestra la matriz tableroMinas
        for (int i = 0; i < tablero[0].length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print("[" + tablero[i][j] + "]");
            }
            System.out.println();
        }
        */
        return tablero;
    }

    //cantidad de minas adyacentes
    private static int qma(boolean tableroMinas[][], int posicionF, int posicionC){
        int contador = 0;
        if (posicionF - 1 > 0 && tableroMinas[posicionF - 1][posicionC] == true) {
            contador ++;
        }
        if ( posicionF - 1 > 0 && posicionC + 1< tableroMinas.length && tableroMinas[posicionF - 1][posicionC + 1]) {
            contador ++;
        }
        if ( posicionC + 1< tableroMinas.length && tableroMinas[posicionF][posicionC + 1]) {
            contador ++;
        }
        if (posicionF + 1< tableroMinas[0].length && posicionC + 1< tableroMinas.length && tableroMinas[posicionF + 1][posicionC + 1]) {
            contador ++;
        }
        if (posicionF + 1< tableroMinas[0].length && tableroMinas[posicionF + 1][posicionC]) {
            contador ++;
        }
        if (posicionC - 1 > 0 && posicionF + 1 < tableroMinas[0].length && tableroMinas[posicionF + 1][posicionC - 1]) {
            contador ++;
        }
        if (posicionC - 1 > 0 && tableroMinas[posicionF][posicionC - 1]) {
            contador ++;
        }
        if (posicionC - 1 > 0 && posicionF - 1 > 0 && tableroMinas[posicionF - 1][posicionC - 1]) {
            contador ++;
        }
        
        return contador;
    }
    










}
