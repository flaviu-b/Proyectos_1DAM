package ejercicios;

public class prueba4 {
    public static void main(String[] args) {
        String yellow = "\033[33m";
String a = "\u001B[31m";
String b = "\u001B[32m";
String c = "\u001B[33m";
String d = " \u001B[34m";
String e = " \u001B[35m";
String f = " \u001B[36m";
String g = " \u001B[37m";
        System.out.println(yellow + "Este texto saldrá en amarillo" + a + "f" + b + "f" + c + "f" + d + "f" + e + "f" + f + "f" + g + "f");

    }    
}
