package ejerciciosClases;

class Fecha {
    int dia;
    int mes;
    int year;
    
}

class Tiempo {
    int horas;
    int minutos;
    int segundos;
    int centesimas;

}

class Rectangulo {
    int x1;
    int x2;
    int y1;
    int y2;   

}


public class Ej1_9 {
    public static void main(String[] args) {
        Fecha nacimiento = new Fecha();
        nacimiento.dia = 19;
        nacimiento.mes = 9;
        nacimiento.year = 2004;

        Tiempo clase = new Tiempo();
        clase.horas = 0;
        clase.minutos = 55;
        clase.segundos = 0;
        clase.centesimas = 0;

       Rectangulo r1 = new Rectangulo();
       r1.x1 = 10;
       r1.y1 = 7; 

    }
    private static rellenarFecha(){
        
    }
}
