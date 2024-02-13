package ejercicios;

public class ejFunMat16_17 {
    public static void main(String[] args) {
        int vector[] = new int[7];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i;
        }
        mostrarVector(vector);
        System.out.println("------------------------------------------------------------------------------------------");


        int matriz[][] = new int[7][7];
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = i;
            }
        }
        mostrarMatriz(matriz);
    }

    private static void mostrarVector(int vector[]) {
        for (int i = 0; i < vector.length - 1 ; i++) {
            System.out.print(vector[i] + ", ");
        }
        System.out.println(vector[vector.length - 1]);
    }

    private static void mostrarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            mostrarVector(matriz[i]);
        }
    }
}
