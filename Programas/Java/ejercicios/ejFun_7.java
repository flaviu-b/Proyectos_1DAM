package ejercicios;

import funciones.Teclat;

public class ejFun_7 {
    public static void main(String[] args) {
        int year = Teclat.lligInt("Dame un año: ");
        System.out.println(esBisiesto(year));
    }
    static boolean esBisiesto(int year){
        boolean res = ((year%4 == 0 && year%100 != 0) || year%400 == 0);
        return res;
    }
}
