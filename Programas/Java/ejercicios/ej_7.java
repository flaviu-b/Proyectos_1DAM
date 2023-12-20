package ejercicios;
public class ej_7 {
    public static void main(String[] args) {
        int max = 0;
        int num = funciones.Teclat.lligInt("Dame un numero");
        if (num > max) {
            max = num;
        }

        num = funciones.Teclat.lligInt("Dame otro numero");
        if (num > max) {
            max = num;
        }

        num = funciones.Teclat.lligInt("Dame otro numero");
        if (num > max) {
            max = num;
        }
        funciones.Pantalla.titol("El numero mas alto es : " + max);
    }
}
