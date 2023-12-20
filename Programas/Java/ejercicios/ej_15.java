package ejercicios;
public class ej_15 {
    public static void main(String[] args) {
        int num = funciones.Teclat.lligInt("Dame un numero: ");
        int i;
        for (i = 1; i <= 10; i++) {
            int sol = i * num;
            System.out.printf("%d x %d = %d \n", i, num, sol);
        }
    }
}
