package ejercicios;

import java.util.Random;

import funciones.Teclat;

public class BuscaminesBrehariuFlaviu {
    static char tapado = 'X';
    static char destapado = ' ';
    static char bandera = 'P';
    static char bomba = '#';

    public static void main(String[] args) {
        boolean mostrarMinas;
        char tableroVisible[][] = creaTableroVisible();
        int minasMax = (tableroVisible.length * tableroVisible[0].length);
        int qMinas = Teclat.lligInt("Cuantas minas quieres que tenga el tablero?(3-" + minasMax + "): ", 3, minasMax);
        boolean tableroMinas[][] = creaTableroMinas(tableroVisible, qMinas);
        mostrarTablero(tableroVisible, tableroMinas, false);
        int posicionC = 0;
        int posicionF = 0;
        int opcion;
        boolean explota = false;
        int qdestapadas;
        while (true) {
            opcion = Teclat.lligInt("Que opcion desea realizar?\n1 --> Bandera\n2 --> Quitar bandera\n3 --> Picar\n", 1,
                    3);
            posicionF = Teclat.lligInt("Indique la posición sobre la que desea actur\n(Fila):", 1,
                    tableroVisible.length) - 1;
            posicionC = Teclat.lligInt("(Columnas)", 1, tableroVisible[0].length) - 1;
            switch (opcion) {
                case 1:
                    tableroVisible[posicionF][posicionC] = 'P';
                    break;
                case 2:
                    tableroVisible[posicionF][posicionC] = 'X';
                    break;
                case 3:
                    explota = pica(tableroVisible, tableroMinas, posicionF, posicionC);
                    break;
                default:
                    System.out.println("Debe introdicir una de las 2 opciones (1-2)");
                    break;
            }
            mostrarTablero(tableroVisible, tableroMinas, explota);
            if (explota) break;
            qdestapadas = qdestapadas(tableroVisible);
            if (qdestapadas == minasMax - qMinas) break;
        }
    }

    private static char[][] creaTableroVisible() {

        int filas = Teclat.lligInt("Dame el numero de filas del busaminas", 5, 15);
        int columnas = Teclat.lligInt("Dame el numero de columnas del busaminas", 5, 15);
        char tablero[][] = new char[filas][columnas];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 'X';
            }
        }
        return tablero;
    }

    private static boolean[][] creaTableroMinas(char tableroVisible[][], int Qminas) {
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
            if (tablero[filaAleatoria][columnaAleatoria] == false) {
                tablero[filaAleatoria][columnaAleatoria] = true;
            } else {
                i--;
            }
        }
        /*
         * Esta parte solo muestra la matriz tableroMinas
         * for (int i = 0; i < tablero.length; i++) {
         * for (int j = 0; j < tablero[i].length; j++) {
         * // System.out.print("[" + tablero[i][j] + "]");
         * if(tablero[i][j] == false) System.out.print("[F] ");
         * else System.out.print("[T] ");
         * }
         * System.out.println();
         * }
         */
        return tablero;
    }

    // cantidad de minas adyacentes
    private static int qma(boolean tableroMinas[][], int posicionF, int posicionC) {
        int contador = 0;
        if (posicionF - 1 >= 0 && tableroMinas[posicionF - 1][posicionC] == true) {
            contador++;
        }
        if (posicionF - 1 >= 0 && posicionC + 1 < tableroMinas.length && tableroMinas[posicionF - 1][posicionC + 1]) {
            contador++;
        }
        if (posicionC + 1 < tableroMinas.length && tableroMinas[posicionF][posicionC + 1]) {
            contador++;
        }
        if (posicionF + 1 < tableroMinas[0].length && posicionC + 1 < tableroMinas.length
                && tableroMinas[posicionF + 1][posicionC + 1]) {
            contador++;
        }
        if (posicionF + 1 < tableroMinas[0].length && tableroMinas[posicionF + 1][posicionC]) {
            contador++;
        }
        if (posicionC - 1 >= 0 && posicionF + 1 < tableroMinas[0].length && tableroMinas[posicionF + 1][posicionC - 1]) {
            contador++;
        }
        if (posicionC - 1 >= 0 && tableroMinas[posicionF][posicionC - 1]) {
            contador++;
        }
        if (posicionC - 1 >= 0 && posicionF - 1 >= 0 && tableroMinas[posicionF - 1][posicionC - 1]) {
            contador++;
        }

        return contador;
    }

    private static boolean destapada(char tableroVisible[][], int posicionF, int posicionC) {

        if (tableroVisible[posicionF][posicionC] == ' ' || tableroVisible[posicionF][posicionC] == '1' || tableroVisible[posicionF][posicionC] == '2'
        || tableroVisible[posicionF][posicionC] == '3' || tableroVisible[posicionF][posicionC] == '4' || tableroVisible[posicionF][posicionC] == '5'
        || tableroVisible[posicionF][posicionC] == '6' || tableroVisible[posicionF][posicionC] == '7' || tableroVisible[posicionF][posicionC] == '8')
            return true;
        else
            return false;
    }

    private static int qdestapadas(char tableroVisible[][]) {
        int contador = 0;
        for (int i = 0; i < tableroVisible.length; i++) {
            for (int j = 0; j < tableroVisible[i].length; j++) {
                if (destapada(tableroVisible, i, j) == true)
                    contador++;
            }
        }
        return contador;
    }

    private static void mostrarTablero(char tableroVisible[][], boolean tableroMinas[][], boolean mostrarMinas) {
        int numVertical = 0;
        if (mostrarMinas) {
            System.out.print("  ");
            for (int i = 0; i < tableroVisible[0].length; i++) {
                if (i < 9) System.out.print(" " + (i+1) + " ");
                else System.out.print(" " + (i+1));
            }
            System.out.println();
            for (int i = 0; i < tableroMinas.length; i++) {
                if (i < 9) System.out.print((numVertical+1) + " ");
                else System.out.print((numVertical+1));
                for (int j = 0; j < tableroMinas[i].length; j++) {
                    if (tableroMinas[i][j])
                        tableroVisible[i][j] = '#';
                    System.out.print("[" + tableroVisible[i][j] + "]");
                }
                System.out.print(" " + (numVertical+1));
                numVertical++;
                System.out.println();
            }
            System.out.print("  ");
            for (int i = 0; i < tableroVisible[0].length; i++) {
                if (i < 9) System.out.print(" " + (i+1) + " ");
                else System.out.print(" " + (i+1));
            }
            System.out.println();
        } else {
            System.out.print("  ");
            for (int i = 0; i < tableroVisible[0].length; i++) {
                if (i < 9) System.out.print(" " + (i+1) + " ");
                else System.out.print(" " + (i+1));
            }
            System.out.println();
            for (int i = 0; i < tableroMinas.length; i++) {
                if (i < 9) System.out.print((numVertical+1) + " ");
                else System.out.print((numVertical+1));
                for (int j = 0; j < tableroMinas[0].length; j++) {
                    System.out.print("[" + tableroVisible[i][j] + "]");
                }
                System.out.print(" " + (numVertical+1));
                numVertical++;
                System.out.println();
            }
            System.out.print("  ");
            for (int i = 0; i < tableroVisible[0].length; i++) {
                if (i < 9) System.out.print(" " + (i+1) + " ");
                else System.out.print(" " + (i+1));            
            }
            System.out.println();

        }

    }

    private static boolean minada(boolean tableroMinas[][], int posicionF, int posicionC) {
        return tableroMinas[posicionF][posicionC];
    }

    private static boolean pica(char tableroVisible[][], boolean tableroMinas[][], int posicionF, int posicionC) {
        if (!minada(tableroMinas, posicionF, posicionC)) {
            destapa(tableroVisible, tableroMinas, posicionF, posicionC);
            return false;
        } else {
            return true;
        }
    }

    private static void destapa(char tableroVisible[][], boolean tableroMinas[][], int posicionF, int posicionC) {
        //mostrarTablero(tableroVisible, tableroMinas, false);
        //System.out.println("............................................................................................");
        if (tableroVisible[posicionF][posicionC] != ' ' && tableroVisible[posicionF][posicionC] != 'P'
                && tableroVisible[posicionF][posicionC] != '1' && tableroVisible[posicionF][posicionC] != '2'
                && tableroVisible[posicionF][posicionC] != '3' && tableroVisible[posicionF][posicionC] != '4'
                && tableroVisible[posicionF][posicionC] != '5' && tableroVisible[posicionF][posicionC] != '6'
                && tableroVisible[posicionF][posicionC] != '7' && tableroVisible[posicionF][posicionC] != '8') {
            int qma = qma(tableroMinas, posicionF, posicionC);
            if (qma == 0) {
                tableroVisible[posicionF][posicionC] = ' ';
                if (posicionF - 1 >= 0)
                    destapa(tableroVisible, tableroMinas, posicionF - 1, posicionC);
                if (posicionF - 1 >= 0 && posicionC + 1 < tableroVisible[0].length)
                    destapa(tableroVisible, tableroMinas, posicionF - 1, posicionC + 1);
                if (posicionC + 1 < tableroVisible[0].length)
                    destapa(tableroVisible, tableroMinas, posicionF, posicionC + 1);
                if (posicionF + 1 < tableroVisible.length && posicionC + 1 < tableroVisible[0].length)
                    destapa(tableroVisible, tableroMinas, posicionF + 1, posicionC + 1);
                if (posicionF + 1 < tableroVisible.length)
                    destapa(tableroVisible, tableroMinas, posicionF + 1, posicionC);
                if (posicionF + 1 < tableroVisible.length && posicionC - 1 >= 0)
                    destapa(tableroVisible, tableroMinas, posicionF + 1, posicionC - 1);
                if (posicionC - 1 >= 0)
                    destapa(tableroVisible, tableroMinas, posicionF, posicionC - 1);
                if (posicionF - 1 >= 0 && posicionC - 1 >= 0)
                    destapa(tableroVisible, tableroMinas, posicionF - 1, posicionC - 1);
            } else {
                String qmaString = Integer.toString(qma);
                char qmaChar = qmaString.charAt(0);
                tableroVisible[posicionF][posicionC] = qmaChar;

            }
        }

    }

}
