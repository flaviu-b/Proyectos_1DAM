package ejercicios;

public class ejPto_3 {
    public static void main(String[] args) {
        rectangulo(4, 5);
        cuadrado(4, 't');
    }

    static void rectangulo(int fil, int col) {
        for (int i = 0; i < fil; i++) {
            System.out.println();
            for (int j = 0; j < col; j++) {
                System.out.print("X");
            }
        }
    }

    static void cuadrado(int lado, char caracter) {
        for (int i = 0; i < lado; i++) {
            System.out.println();
            for (int j = 0; j < lado; j++) {
                System.out.print(caracter);
            }
        }
    }
}
