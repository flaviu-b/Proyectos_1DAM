package ejerciciosClases;

class NombreCompleto {
    String nom;
    String ap1;
    String ap2;
}

class Domicilio {
    String calle;
    int num;
    int piso;
    int puerta;
    String comarca;
}

class TelFix {
    int pref;
    int num;
}

class Alumne {
    NombreCompleto nom_alu = new NombreCompleto();
    Domicilio dom_alu = new Domicilio();
    TelFix tel_padre = new TelFix();
    TelFix tel_madre = new TelFix();
}

class Ordenador {
    int num_serie;
    String cpu;
    int q_ram;
    int dd;
    Alumne alu;
}

public class ej8 {
    public static void main(String[] args) {
        Alumne alu1 = new Alumne();
        Alumne alu2 = new Alumne();
        alu1.nom_alu.nom = "Javi";
        alu1.nom_alu.ap1 = "Oliveira";
        alu1.nom_alu.ap2 = "Chamber";
        alu1.dom_alu.calle = "Metge Joan Garces";
        alu1.dom_alu.num = 56;
        alu1.dom_alu.piso = 6;
        alu1.dom_alu.puerta = 16;
        alu1.dom_alu.comarca = "Pueblo Paleta";
        alu1.tel_madre.pref = +34;
        alu1.tel_madre.num = 456454555;
        alu1.tel_padre.pref = +34;
        alu1.tel_padre.num = 696543328;
        
        alu2.nom_alu.nom = "Maria";
        alu2.nom_alu.ap1 = "Dolores";
        alu2.nom_alu.ap2 = "Galindo";
        alu2.dom_alu.calle = "Dr f";
        alu2.dom_alu.num = 12;
        alu2.dom_alu.piso = 1;
        alu2.dom_alu.puerta = 1;
        alu2.dom_alu.comarca = "Pueblo Paleta";
        alu2.tel_madre.pref = +34;
        alu2.tel_madre.num = 345683456;
        alu2.tel_padre.pref = +34;
        alu2.tel_padre.num = 346734956;

        Ordenador ord1 = new Ordenador();
        Ordenador ord2 = new Ordenador();
        Ordenador ord3 = new Ordenador();

        ord1.num_serie = 00001;
        ord1.cpu = "Intel i5 11gen";
        ord1.q_ram = 16;
        ord1.dd = 666;

        ord2.num_serie = 00002;
        ord2.cpu = "Intel i5 11gen";
        ord2.q_ram = 16;
        ord2.dd = 666;
        ord2.alu = new Alumne();
        ord2.alu.dom_alu.calle = "asdfa";
        ord2.alu.dom_alu.comarca = "dfsdfb";
        ord2.alu.dom_alu.num = 45;
        ord2.alu.dom_alu.piso = 4;
        ord2.alu.dom_alu.puerta = 5;
        ord2.alu.nom_alu.nom = "Roberto";
        ord2.alu.nom_alu.ap1 = "Totototo";
        ord2.alu.nom_alu.ap2 = "Tototototo";
        ord2.alu.tel_madre.num = 456456456;
        ord2.alu.tel_madre.pref = +34;
        ord2.alu.tel_padre.num = 234234234;
        ord2.alu.tel_padre.pref = +34;
        
        ord1.alu = alu2;
        alu2.tel_padre.num = 666666666;
        alu2.tel_padre.pref = +34;

        System.out.printf("El telefono es: +%d %d",ord1.alu.tel_padre.pref,ord1.alu.tel_padre.num);
    }
}
