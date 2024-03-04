package examenes;

public class examen2ava {
    public static void main(String[] args) {
        // Ejercicio 1
        int venteros[] = { 1, 3, 45, 66, 435, -645, 67, 7 };
        int vector[] = minimax(venteros);
        System.out.println("El menor es el " + vector[0] + " i el mayor es el " + vector[1]);
        // Ejercicio 2
        int venteros2[] = { 2, 5, 7, 3, 9, 4 };
        int pInicial = 2;
        int tam = 6;
        int vector2[] = subVector(venteros2, pInicial, tam);
        try {
            for (int i = 0; i < vector2.length; i++) {
                System.out.print(vector2[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        //ejercicio 6
        mostraVector(venteros2, 0);
        //ejercicio 3
        wasap("este ejercicio no sabia hacerlo exactamente asi que he hecho otro que no devuelve nada pero muestra la cadena sin la vocales");
    }

    private static int[] minimax(int[] venteros) {
        int vmaximin[] = new int[2];
        vmaximin[0] = venteros[0];
        vmaximin[1] = venteros[0];
        for (int i = 0; i < venteros.length; i++) {
            if (venteros[i] > vmaximin[1])
                vmaximin[1] = venteros[i];
            else if (venteros[i] < vmaximin[0])
                vmaximin[0] = venteros[i];
        }

        return vmaximin;
    }

    private static int[] subVector(int[] venteros, int pInicial, int tam) {
        try {
            int subVector[] = new int[tam];
            int contSV = 0;
            for (int i = pInicial; contSV < tam; i++) {
                subVector[contSV] = venteros[i];
                contSV++;
            }
            return subVector;
        } catch (Exception e) {
            return null;
        }
    }

    // ejercicio 4
    private static void posaMarc(char mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == 0 || i == mat[0].length - 1 || j == 0 || j == mat.length - 1)
                    mat[i][j] = '*';
            }
        }
    }

    private static void wasap(String conVocal){
    char sinVocal[] = new char[conVocal.length()];
    for (int i = 0; i < sinVocal.length; i++) {
        if (conVocal.charAt(i) == 'a' ||conVocal.charAt(i) == 'e' ||conVocal.charAt(i) == 'i' ||conVocal.charAt(i) == 'o' ||conVocal.charAt(i) == 'u') sinVocal[i] = '#';
        else sinVocal[i] = conVocal.charAt(i);
    }
    for (int i = 0; i < sinVocal.length; i++) {
        if (sinVocal[i] != '#') System.out.print(sinVocal[i]);
    }
    }
    private static Boolean esVocal(String vocal) {
        if (vocal == "a" || vocal == "e" || vocal == "i" || vocal == "o" || vocal == "u")
            return true;
        else
            return false;
    }

    private static void mostraVector(int vector[], int posi) { 
        if (posi < 0 || posi >= vector.length)
            System.out.print("error");
        else if (posi == 0) {
            System.out.print("{" + vector[posi] + ",");
            mostraVector(vector, posi + 1);
        } else if (posi < vector.length - 1) {
            System.out.print(vector[posi] + ",");
            mostraVector(vector, posi + 1);
        } else 
            System.out.print(vector[posi] + "}");

    }

}
