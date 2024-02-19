package ejercicios;
import java.util.Random;

import funciones.Teclat;
public class BuscaminesBrehariuFlaviu {
    static char tapado = ' ';
    public static void main(String[] args) {
        char tableroVisible[][] = creaTableroVisible();
        int minasMax = (tableroVisible.length * tableroVisible[0].length);
        int Qminas = Teclat.lligInt("Cuantas minas quieres que tenga el tablero?(3-"+minasMax+"): ", 3, minasMax);
        boolean tableroMinas[][] = creaTableroMinas(tableroVisible, Qminas);
        boolean exit = false;
        int posicionC = 0;
        int posicionF = 0;
        do{
            posicionF = Teclat.lligInt("Dame la posición de la casilla con la que desea interactuar.\nFila",1,tableroVisible[0].length) - 1;
            posicionC = Teclat.lligInt("Columna",1,tableroVisible.length) - 1;
        }while(posicionF > 0 && posicionC > 0 && posicionF < tableroVisible.length && posicionC < tableroVisible.length);        
        int qma = qma(tableroMinas, posicionF, posicionC);
        System.out.println(qma);
    }

    private static char[][] creaTableroVisible(){

        int filas = Teclat.lligInt("Dame el numero de filas del busaminas", 5, 15);
        int columnas = Teclat.lligInt("Dame el numero de columnas del busaminas", 5, 15);
        char tablero[][] = new char[filas][columnas];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = tapado;
            }
        }
        return tablero;
    }

    private static boolean[][] creaTableroMinas(char tableroVisible[][] ,int Qminas){
        boolean tablero[][] = new boolean[tableroVisible.length][tableroVisible[0].length];
        int filaAleatoria;
        int columnaAleatoria;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = false;
            }
        }
        Random random = new Random();
        for (int i = 0; i < Qminas; i++) {
            filaAleatoria = random.nextInt(tablero.length);
            columnaAleatoria = random.nextInt(tablero[0].length);
            if (tablero[filaAleatoria][columnaAleatoria] == false){
            tablero[filaAleatoria][columnaAleatoria] = true;
            }else{
                i--;
            }
        }
        // Esta parte solo muestra la matriz tableroMinas
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
            //    System.out.print("[" + tablero[i][j] + "]");
                if(tablero[i][j] == false) System.out.print("[F] ");
                else System.out.print("[T] ");
            }
            System.out.println();
        }
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
