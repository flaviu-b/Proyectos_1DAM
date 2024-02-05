package ejercicios;

public class ejPto_4 {
    public static void main(String[] args) {
        titulo("Dame tu cosita");
    }
    static void titulo(String titulo){
        for (int i = 0; i < titulo.length() + 4; i++) System.out.print("*");
        System.out.print("\n*");
        for (int i = 0; i < titulo.length() + 2; i++) System.out.print(" ");
        System.out.print("*");
        System.out.printf("\n* %s *",titulo);
        System.out.print("\n*");
        for (int i = 0; i < titulo.length() + 2; i++) System.out.print(" ");
        System.out.println("*");
        for (int i = 0; i < titulo.length() + 4; i++) System.out.print("*");

    }
}

