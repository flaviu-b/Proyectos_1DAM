package ejercicios;

public class funcionesAjedrez {

    public static void MoverTorre(int posicionMoverI, int posicionMoverJ, char tablero[][], int filas, int columnas) {
        int posicionMoverI_t = posicionMoverI;
        while (posicionMoverI_t > 0 && (tablero[posicionMoverI_t - 1][posicionMoverJ] == ' '
                || tablero[posicionMoverI_t - 1][posicionMoverJ] == '.')) {
            tablero[posicionMoverI_t - 1][posicionMoverJ] = '.';
            System.out.println(posicionMoverI_t);
            posicionMoverI_t--;
        }
        posicionMoverI_t = posicionMoverI;
        while (posicionMoverI_t < (filas - 1)
                && (tablero[posicionMoverI_t + 1][posicionMoverJ] == ' '
                        || tablero[posicionMoverI_t + 1][posicionMoverJ] == '.')) {
            tablero[posicionMoverI_t + 1][posicionMoverJ] = '.';
            System.out.println(posicionMoverI_t);
            posicionMoverI_t++;
        }
        int posicionMoverJ_t = posicionMoverJ;
        while (posicionMoverJ_t > 0 && (tablero[posicionMoverI][posicionMoverJ_t - 1] == ' '
                || tablero[posicionMoverI][posicionMoverJ_t - 1] == '.')) {
            tablero[posicionMoverI][posicionMoverJ_t - 1] = '.';
            System.out.println(posicionMoverI_t);
            posicionMoverJ_t--;
        }
        posicionMoverJ_t = posicionMoverJ;
        while (posicionMoverJ_t < (columnas - 1)
                && (tablero[posicionMoverI][posicionMoverJ_t + 1] == ' '
                        || tablero[posicionMoverI][posicionMoverJ_t + 1] == '.')) {
            tablero[posicionMoverI][posicionMoverJ_t + 1] = '.';
            System.out.println(posicionMoverJ_t);
            posicionMoverJ_t++;
        }
    }

    public static void MoverAlfil(int posicionMoverI, int posicionMoverJ, char tablero[][], int filas, int columnas) {
        int posicionMoverI_a = posicionMoverI;
        int posicionMoverJ_a = posicionMoverJ;
        while ((posicionMoverI_a > 0 && posicionMoverJ_a < (columnas - 1))
                && (tablero[posicionMoverI_a - 1][posicionMoverJ_a + 1] == ' '
                        || tablero[posicionMoverI_a - 1][posicionMoverJ_a + 1] == '.')) {
            tablero[posicionMoverI_a - 1][posicionMoverJ_a + 1] = '.';
            posicionMoverI_a--;
            posicionMoverJ_a++;
            System.out.println(posicionMoverI_a);
            System.out.println(posicionMoverJ_a);

        }
        posicionMoverI_a = posicionMoverI;
        posicionMoverJ_a = posicionMoverJ;
        while ((posicionMoverI_a < (filas - 1) && posicionMoverJ_a > 0)
                && (tablero[posicionMoverI_a + 1][posicionMoverJ_a - 1] == ' '
                        || tablero[posicionMoverI_a + 1][posicionMoverJ_a - 1] == '.')) {
            tablero[posicionMoverI_a + 1][posicionMoverJ_a - 1] = '.';
            System.out.println(posicionMoverI_a);
            System.out.println(posicionMoverJ_a);
            posicionMoverI_a++;
            posicionMoverJ_a--;
        }
        posicionMoverI_a = posicionMoverI;
        posicionMoverJ_a = posicionMoverJ;
        while ((posicionMoverI_a > 0 && posicionMoverJ_a > 0)
                && (tablero[posicionMoverI_a - 1][posicionMoverJ_a - 1] == ' '
                        || tablero[posicionMoverI_a - 1][posicionMoverJ_a - 1] == '.')) {
            tablero[posicionMoverI_a - 1][posicionMoverJ_a - 1] = '.';
            System.out.println(posicionMoverI_a);
            System.out.println(posicionMoverJ_a);
            posicionMoverI_a--;
            posicionMoverJ_a--;
        }
        posicionMoverI_a = posicionMoverI;
        posicionMoverJ_a = posicionMoverJ;
        while ((posicionMoverI_a < (filas - 1) && posicionMoverJ_a < (columnas - 1))
                && (tablero[posicionMoverI_a + 1][posicionMoverJ_a + 1] == ' '
                        || tablero[posicionMoverI_a + 1][posicionMoverJ_a + 1] == '.')) {
            tablero[posicionMoverI_a + 1][posicionMoverJ_a + 1] = '.';
            System.out.println(posicionMoverI_a);
            System.out.println(posicionMoverJ_a);
            posicionMoverI_a++;
            posicionMoverJ_a++;
        }
    }

    public static void MoverRey(int posicionMoverI, int posicionMoverJ, char tablero[][], int filas, int columnas) {
        if (posicionMoverI < (filas - 1)
                && posicionMoverJ < (columnas - 1)
                && (tablero[posicionMoverI + 1][posicionMoverJ + 1] == ' '
                        || tablero[posicionMoverI + 1][posicionMoverJ + 1] == '.'))
            tablero[posicionMoverI + 1][posicionMoverJ + 1] = '.';
        if (posicionMoverJ < (columnas - 1)
                && (tablero[posicionMoverI][posicionMoverJ + 1] == ' '
                        || tablero[posicionMoverI][posicionMoverJ + 1] == '.'))
            tablero[posicionMoverI][posicionMoverJ + 1] = '.';
        if (posicionMoverI > 0 &&
                posicionMoverJ < (columnas - 1)
                && (tablero[posicionMoverI - 1][posicionMoverJ + 1] == ' '
                        || tablero[posicionMoverI - 1][posicionMoverJ + 1] == '.'))
            tablero[posicionMoverI - 1][posicionMoverJ + 1] = '.';
        if (posicionMoverI > 0
                && (tablero[posicionMoverI - 1][posicionMoverJ] == ' '
                        || tablero[posicionMoverI - 1][posicionMoverJ] == '.'))
            tablero[posicionMoverI - 1][posicionMoverJ] = '.';
        if (posicionMoverI > 0 && posicionMoverJ > 0
                && (tablero[posicionMoverI - 1][posicionMoverJ - 1] == ' '
                        || tablero[posicionMoverI - 1][posicionMoverJ - 1] == '.'))
            tablero[posicionMoverI - 1][posicionMoverJ - 1] = '.';
        if (posicionMoverJ > 0
                && (tablero[posicionMoverI][posicionMoverJ - 1] == ' '
                        || tablero[posicionMoverI][posicionMoverJ - 1] == '.'))
            tablero[posicionMoverI][posicionMoverJ - 1] = '.';
        if (posicionMoverI < (filas - 1) &&
                posicionMoverJ > 0
                && (tablero[posicionMoverI + 1][posicionMoverJ - 1] == ' '
                        || tablero[posicionMoverI + 1][posicionMoverJ - 1] == '.'))
            tablero[posicionMoverI + 1][posicionMoverJ - 1] = '.';
        if (posicionMoverI < (filas - 1)
                && (tablero[posicionMoverI + 1][posicionMoverJ] == ' '
                        || tablero[posicionMoverI + 1][posicionMoverJ] == '.'))
            tablero[posicionMoverI + 1][posicionMoverJ] = '.';
    }

    public static void MoverCaballo(int posicionMoverI, int posicionMoverJ, char tablero[][], int filas, int columnas) {
        if (posicionMoverI > 0 && posicionMoverJ < (columnas - 1)
                && (tablero[posicionMoverI - 2][posicionMoverJ + 1] == ' '
                        || tablero[posicionMoverI - 2][posicionMoverJ + 1] == '.'))
            tablero[posicionMoverI - 2][posicionMoverJ + 1] = '.';
        if (posicionMoverI > 0 && posicionMoverJ < (columnas - 1)
                && (tablero[posicionMoverI - 1][posicionMoverJ + 2] == ' '
                        || tablero[posicionMoverI - 1][posicionMoverJ + 2] == '.'))
            tablero[posicionMoverI - 1][posicionMoverJ + 2] = '.';
        if (posicionMoverI < (filas - 1) && posicionMoverJ < (columnas - 1)
                && (tablero[posicionMoverI + 1][posicionMoverJ + 2] == ' '
                        || tablero[posicionMoverI + 1][posicionMoverJ + 2] == '.'))
            tablero[posicionMoverI + 1][posicionMoverJ + 2] = '.';
        if (posicionMoverI < (filas - 1) && posicionMoverJ < (columnas - 1)
                && (tablero[posicionMoverI + 2][posicionMoverJ + 1] == ' '
                        || tablero[posicionMoverI + 2][posicionMoverJ + 1] == '.'))
            tablero[posicionMoverI + 2][posicionMoverJ + 1] = '.';
        if (posicionMoverI < (filas - 1) && posicionMoverJ > 0
                && (tablero[posicionMoverI + 2][posicionMoverJ - 1] == ' '
                        || tablero[posicionMoverI + 2][posicionMoverJ - 1] == '.'))
            tablero[posicionMoverI + 2][posicionMoverJ - 1] = '.';
        if (posicionMoverI < (filas - 1) && posicionMoverJ > 0
                && (tablero[posicionMoverI + 1][posicionMoverJ - 2] == ' '
                        || tablero[posicionMoverI + 1][posicionMoverJ - 2] == '.'))
            tablero[posicionMoverI + 1][posicionMoverJ - 2] = '.';
        if (posicionMoverI > 0 && posicionMoverJ > 0
                && (tablero[posicionMoverI - 1][posicionMoverJ - 2] == ' '
                        || tablero[posicionMoverI - 1][posicionMoverJ - 2] == '.'))
            tablero[posicionMoverI - 1][posicionMoverJ - 2] = '.';
        if (posicionMoverI > 0 && posicionMoverJ > 0
                && (tablero[posicionMoverI - 2][posicionMoverJ - 1] == ' '
                        || tablero[posicionMoverI - 2][posicionMoverJ - 1] == '.'))
            tablero[posicionMoverI - 2][posicionMoverJ - 1] = '.';
    } 
    public static int ConvertChar(char letra){
        switch (letra) {
                case 'A': return 1;
                case 'B': return 2;
                case 'C': return 3;
                case 'D': return 4;
                case 'E': return 5;
                case 'F': return 6;
                case 'G': return 7;
                case 'H': return 8;
                case 'I': return 9;
                default: return -1;
        }
    }
}