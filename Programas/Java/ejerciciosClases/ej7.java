package ejerciciosClases;

class Color {
    int r;
    int g;
    int b;
}

class Cercle {
    int radi;
    Color colorVora = new Color();
    Color colorDins = new Color();
}


public class ej7 {
    public static void main(String[] args) {
        Cercle cercle1 = new Cercle();
        cercle1.radi = 5;
        cercle1.colorVora.r = 555;
        cercle1.colorVora.g = 564;
        cercle1.colorVora.b = 100;
        cercle1.colorDins.r = 001;
        cercle1.colorDins.g = 043;
        cercle1.colorDins.b = 349;
        System.out.printf("El circulo tiene radio %d, color del bode (%d,%d,%d) y color interno (%d,%d,%d)",cercle1.radi,cercle1.colorVora.r,cercle1.colorVora.g,cercle1.colorVora.b,cercle1.colorDins.r,cercle1.colorDins.g,cercle1.colorDins.b);
    }
}
