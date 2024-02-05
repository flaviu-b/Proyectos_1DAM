package ejercicios;

public class ejPto_5 {
    public static void main(String[] args) {
        tablaMultiplicar(10, 'C');
    }
    static void tablaMultiplicar(int tabla,char orden){
        switch (orden) {
            case 'C':
                for (int i = 1; i <= tabla; i++) {
                    System.out.println(i + " X " + tabla + " = " + (i*tabla));
                }
                break;
            case 'D':
                for (int i = tabla; i >= 1; i--) {
                    System.out.println(i + " X " + tabla + " = " + (i*tabla));                    
                }
                break;
            default:
                System.out.println("error: No se ha introducido correctamente el caracter(C/D)");
                break;
        }
        
    }
    
}
