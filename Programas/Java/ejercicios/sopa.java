package ejercicios;

public class sopa {
    public static void main(String[] args) {
        System.out.println("-----SOPA DE LLETRES-----");
        char tablero[][];
        int puntos_t = 0;
        int puntos_j = 0;
        boolean exit;
        tablero = creaSopa();
        mostrarSopa(tablero);
        while (true) {
            puntos_j = ferJugada(tablero);
            puntos_t += ferJugada(tablero);
            mostrarSopa(tablero);
            System.out.printf("Punts obtinguts: %d",puntos_j);
            System.out.printf("Punts totals: %d",puntos_t);
            exit = fiPartida();
            if (exit) break;
        }
    }
}
