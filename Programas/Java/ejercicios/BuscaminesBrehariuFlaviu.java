package ejercicios;

import java.util.Random;

import funciones.Teclat;

public class BuscaminesBrehariuFlaviu {
    static char tapado = 'X';
    static char destapado = ' ';40
    static char bandera =  'P';
    static char bomba = '#';
    static String verde= "\033[32m";
    static String rosa= "\033[31m";
    static String reset = "\u001B[0m";
    public static void main(String[] args) {
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
                    tableroVisible[posicionF][posicionC] = bandera;
                    break;
                case 2:
                    tableroVisible[posicionF][posicionC] = tapado;
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
    //Crea la matriz tablero de caracteres que se mostrara al usuario con lados de un largo entre 5 y 15 casillas e inicializa todas las casillas ocultas, devuelve la matriz 
    private static char[][] creaTableroVisible() {

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
    //Crea una matriz oculta de booleanos que inicializa con false y cambia la cantidad de casillas que el usuario decida a true, devuelve la matriz 
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

    // calcula la cantidad de minas adyacentes, devuelve la cantidad
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
    //Compruba si una casilla del tableroVisible esta destapada o no, devuelve true si lo esta si no devuelve false
    private static boolean destapada(char tableroVisible[][], int posicionF, int posicionC) {

        if (tableroVisible[posicionF][posicionC] == destapado || tableroVisible[posicionF][posicionC] == '1' || tableroVisible[posicionF][posicionC] == '2'
        || tableroVisible[posicionF][posicionC] == '3' || tableroVisible[posicionF][posicionC] == '4' || tableroVisible[posicionF][posicionC] == '5'
        || tableroVisible[posicionF][posicionC] == '6' || tableroVisible[posicionF][posicionC] == '7' || tableroVisible[posicionF][posicionC] == '8')
            return true;
        else
            return false;
    }
    //Calcula la cantidad de casillas destapadas tiene el tableroVisible, devuelve la cantidad
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
    //Muestra el tableroVisible , las banderas se muestran de un color diferente al igual que las bombas
    private static void mostrarTablero(char tableroVisible[][], boolean tableroMinas[][], boolean explota) {
        int numVertical = 0;
        if (explota) {
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
                    if (tableroMinas[i][j]){
                        tableroVisible[i][j] = bomba;
                        System.out.print("[" + rosa + tableroVisible[i][j] + reset + "]");
                    }
                    else if (tableroVisible[i][j] == bandera){
                        System.out.print("[" + verde + tableroVisible[i][j] + reset + "]");
                    }else{
                        System.out.print("[" + tableroVisible[i][j] + "]");
                    } 
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
                    if (tableroVisible[i][j] == bandera){
                        System.out.print("[" + verde + tableroVisible[i][j] + reset + "]");
                    }else{
                        System.out.print("[" + tableroVisible[i][j] + "]");
                    }
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
    //Comprueba si una casilla tiene mina y devuelve true si lo esta, en caso contrario devuelve false
    private static boolean minada(boolean tableroMinas[][], int posicionF, int posicionC) {
        return tableroMinas[posicionF][posicionC];
    }
    //Si una casilla tiene mina llama a la funcion destapa y devuelve false si no devuelve true
    private static boolean pica(char tableroVisible[][], boolean tableroMinas[][], int posicionF, int posicionC) {
        if (!minada(tableroMinas, posicionF, posicionC)) {
            destapa(tableroVisible, tableroMinas, posicionF, posicionC);
            return false;
        } else {
            return true;
        }
    }
    /*Funcion recursiva que destapa las casillas, si la casilla tiene minas al rededor muestra un numero si no muestra un espacio
    y llama a la función destapa para cada casilla de su alrrededor en caso de que este dentro del tablero*/ 
    private static void destapa(char tableroVisible[][], boolean tableroMinas[][], int posicionF, int posicionC) {
        //mostrarTablero(tableroVisible, tableroMinas, false);
        //System.out.println("............................................................................................");
        if (tableroVisible[posicionF][posicionC] != destapado && tableroVisible[posicionF][posicionC] != bandera
                && tableroVisible[posicionF][posicionC] != '1' && tableroVisible[posicionF][posicionC] != '2'
                && tableroVisible[posicionF][posicionC] != '3' && tableroVisible[posicionF][posicionC] != '4'
                && tableroVisible[posicionF][posicionC] != '5' && tableroVisible[posicionF][posicionC] != '6'
                && tableroVisible[posicionF][posicionC] != '7' && tableroVisible[posicionF][posicionC] != '8') {
            int qma = qma(tableroMinas, posicionF, posicionC);
            if (qma == 0) {
                tableroVisible[posicionF][posicionC] = destapado;
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
