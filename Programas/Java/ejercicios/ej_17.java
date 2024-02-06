package ejercicios;

public class ej_17 {
    public static void main(String[] args) {
        int i;
        int max = 0;
        int min = 0;
        int suma = 0;
        for (i = 1; i <= 10; i++) {
            int num = funciones.Teclat.lligInt("Dame un numero: ");
            suma += num;
            if (i == 1)
                min = num;
            if (num > max) {
                max = num;
                System.out.println("numero mas alto actual guardado");
            }
            if (num <= min) {
                min = num;
                System.out.println("numero mas bajo actual guardado");
            }

        }

        System.out.printf("el  numero mas alto es %d, l numero mas bajo es %d y la media total es %d", max, min,
                suma / 10);
    }

}