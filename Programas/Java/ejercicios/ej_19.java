package ejercicios;

public class ej_19 {
    public static void main(String[] args) {
        int num = funciones.Teclat.lligInt("Dame un numero: ");
        int factorial = 1;
        if (num == 0 || num == 1) {
            factorial = 1;
        }
        else{
            for (int i = num; i > 0 ; i--) {
                factorial *= i; 
            }
        }
        System.out.printf("El factorial es %d",factorial);
    }
}
