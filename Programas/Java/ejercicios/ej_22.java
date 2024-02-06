package ejercicios;

public class ej_22 {
    public static void main(String[] args) {
        int num = funciones.Teclat.lligInt("Dame un numero: ");

        int billete_500 = num / 500;
        num = num - billete_500 * 500;
        int billete_200 = num / 200;
        num = num - billete_200 * 200;
        int billete_100 = num / 100;
        num = num - billete_100 * 100;
        int billete_50 = num / 50;
        num = num - billete_50 * 50;
        int billete_20 = num / 20;
        num = num - billete_20 * 20;
        int billete_10 = num / 10;
        num = num - billete_10 * 10;
        int billete_5 = num / 5;
        num = num - billete_5 * 5;
        int moneda_1 = num / 1;

        System.out.printf("la vuelta quedaria:\n %d billetes de 500 eur\n%d billetes de 200 eur\n%d billetes de 100 eur\n%d billetes de 50 eur\n%d billetes de 20 eur\n%d billetes de 10 eur\n%d billetes de 5 eur\n%d monedas de 1 eur",billete_500,billete_200,billete_100,billete_50,billete_20,billete_10,billete_5,moneda_1);
    }

}
