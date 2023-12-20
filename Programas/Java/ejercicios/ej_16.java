package ejercicios;

public class ej_16 {
    public static void main(String[] args) {
        int i;
        int max = 0;
        for (i = 1; i <= 10; i++) {
            int num = funciones.Teclat.lligInt("Dame un numero: ");
            if (num > max) {
                max = num;
                System.out.println("numero guardado");
            }

        }
        System.out.printf("el  numero mas alto es %d", max);
    }
}   