package funciones;

import static funciones.Pantalla.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Teclat {
    // ======== FUNCIONS PER A L'ENTRADA DE DADES PER TECLAT ========

    static Scanner sc = new Scanner(System.in);

    /**
     * Aconseguix un caràcter de teclat.
     * Exemple d'ús: 
     *     char lletra = Teclat.lligChar();
     * @return El caràcter introduït
     */
    public static char lligChar() {
        String resposta;

        do {
            resposta = sc.nextLine();
        } while (resposta.length() == 0);

        return resposta.charAt(0);
    }

    /**
     * Aconseguix un caràcter de teclat mostrant missatge.
     * Exemple d'ús: 
     *     char lletra = Teclat.lligChar("Dis-me lletra del DNI");
     * @param missatge Text per a fer la pregunta per teclat.
     * @return El caràcter introduït
     */
    public static char lligChar(String missatge) {
        demana(missatge);
        return Teclat.lligChar();
    }

    /**
     * Aconseguix un caràcter de teclat entre uns possibles valors. Nota:
     * retorna el caràcter en majúscula.
     * Exemple d'ús: 
     *     char lletra = Teclat.lligChar("Dis-me peça d'escacs", "ctadr");
     * @param missatge Text per a fer la pregunta per teclat.
     * @param possibles Cadena amb els possibles caràcters de resposta.
     * @return El caràcter introduït per teclat entre els possibles.
     */
    public static char lligChar(String missatge, String possibles) {
        char c;
        String resposta;
        possibles = possibles.toUpperCase();

        do {
            do {
                demana(missatge + separa(possibles));
                resposta = sc.nextLine();
            } while (resposta.length() == 0);
            c = resposta.toUpperCase().charAt(0);
        } while (!possibles.contains(c + ""));

        return c;
    }

    /**
     * Separa les lletres d'una cadena (posant comes, etc). És usada, entre
     * altres, per lligChar, per a mostrar els possibles valors.
     *
     * @param cadena Cadena que conté les lletres a separa.
     * @return Cadena amb els caràcters separats per comes i entre parèntesis.
     */
    public static String separa(String cadena) {
        int l = cadena.length();
        if (l == 0) {
            return "";
        }
        String cadenaSep = " (";
        for (int i = 0; i < l - 1; i++) {
            cadenaSep = cadenaSep + cadena.charAt(i) + ", ";
        }
        cadenaSep = cadenaSep + cadena.charAt(l - 1) + ")";
        return cadenaSep;
    }

    /**
     * Demana una cadena de teclat.
     *
     * @return la cadena llegida.
     */
    public static String lligString() {
        return sc.nextLine();
    }

    /**
     * Demana una cadena de teclat mostrant primer què es demana.
     *
     * @param missatge el text a mostrar.
     * @return la cadena llegida.
     */
    public static String lligString(String missatge) {
        demana(missatge);
        return sc.nextLine();
    }

    /**
     * Demana una cadena de teclat que tinga una grandària concreta.
     *
     * @param qLletres Grandària que cal que tinga la cadena a llegir.
     * @return la cadena llegida.
     */
    public static String lligString(int qLletres) {
        String cadena;
        cadena = sc.nextLine();
        while (cadena.length() != qLletres) {
            cadena = lligString("Ha de tindre " + qLletres + " caràcters");
        }
        return cadena;
    }

    /**
     * Demana una cadena de teclat que tinga una grandària concreta, mostrant
     * primer què es demana.
     *
     * @param missatge el text a mostrar.
     * @param qLletres Grandària que cal que tinga la cadena a llegir.
     * @return la cadena llegida.
     */
    public static String lligString(String missatge, int qLletres) {
        String cadena;
        cadena = lligString(missatge);
        while (cadena.length() != qLletres) {
            cadena = lligString(missatge + " (" + qLletres + " caràcters)");
        }
        return cadena;
    }

    /**
     * Demana per teclat una llista de cadenes Sol ser invocat per a demanar
     * noms d'actors, directors, artistes...
     *
     * @param missatge Missatge a mostrar per a demanar cada cadena.
     * @return llista de cadenes.
     */
    public static ArrayList<String> lligStrings(String missatge) {
        ArrayList<String> strings = new ArrayList();
        String element;
        element = Teclat.lligString(missatge);
        while (element.length() > 0) {
            strings.add(element);
            element = Teclat.lligString(missatge);
        }
        return strings;
    }

    /**
     * Mostra un missatge per a demanar dades per teclat. Si no acaba en ':',
     * '=' o en '?', posa ':' al final del missatge.
     *
     * @param missatge Missatge que volem preparar.
     */
    public static void demana(String missatge) {
        if (missatge.length() > 0) {
            if (!missatge.endsWith(":") && !missatge.endsWith(": ")
                    && !missatge.endsWith("=") && !missatge.endsWith("= ")
                    && !missatge.endsWith("?") && !missatge.endsWith("? ")) {

                missatge = missatge + ": ";
            }
            System.out.print(missatge);
        }
    }

    /**
     * Demana un booleà per teclat, mostrant primer què es demana. Es fa la
     * pregunta i no para fins respondre s/S/n/N
     *
     * @param missatge el text a mostrar.
     * @return true o false
     */
    public static boolean lligBoolean(String missatge) {
        String resposta = "";
        char c;
        do {
            do {
                demana(missatge + " (s/n)? ");
                resposta = sc.nextLine();
            } while (resposta.length() == 0);
            c = resposta.toLowerCase().charAt(0);
        } while (c != 's' && c != 'n');
        return (c == 's');
    }

    /**
     * Demana un enter per teclat. S'assegura que no s'han introduït lletres,
     * etc.
     *
     * @return l'enter llegit.
     */
    public static int lligInt() {
        int numero = -1;
        boolean error = false;

        do {
            try {
                numero = sc.nextInt();
                error = false;
            } catch (Exception e) {
                System.out.print("Ha de ser un número enter:");
                sc.nextLine(); // buida buffer de lletres, etc
                error = true;
            }
        } while (error);

        sc.nextLine(); // buida "intro" per a poder llegir cadenes després
        return numero;
    }

    /**
     * Mostra un missatge per pantalla per a demanar un enter per teclat
     *
     * @param missatge Text a mostrar.
     * @return el número introduït
     */
    public static int lligInt(String missatge) {
        demana(missatge);
        return Teclat.lligInt();
    }

    /**
     * Mostra un missatge per pantalla per a demanar un enter per teclat que
     * estiga en un rang de possibles valors.
     *
     * @param missatge Text a mostrar.
     * @param min Valor mínim (inclòs).
     * @param max Valor màxim (inclòs).
     * @return el número introduït
     */
    public static int lligInt(String missatge, int min, int max) {
        int numero;
        do {
            demana(missatge + " (" + min + " a " + max + ")");
            numero = Teclat.lligInt();

        } while (numero < min || numero > max);

        return numero;
    }

    /**
     * Mostra un missatge per pantalla per a demanar un enter per teclat que
     * tinga un límit inferior.
     *
     * @param missatge Text a mostrar.
     * @param min Valor mínim (inclòs).
     * @return el número introduït
     */
    public static int lligInt(String missatge, int min) {
        int numero;
        demana(missatge);
        numero = Teclat.lligInt();
        while (numero < min) {
            demana(missatge + " (mínim " + min + ")");
            numero = Teclat.lligInt();
        }
        return numero;
    }

    /**
     * Demana un float per teclat. S'assegura que no s'han introduït lletres,
     * etc
     *
     * @return el float llegit.
     */
    public static float lligFloat() {
        float numero = -1;
        boolean error = false;

        do {
            try {
                numero = sc.nextFloat();
                error = false;
            } catch (Exception e) {
                System.out.print("Ha de ser un número:");
                sc.nextLine(); // buida buffer de lletres, etc
                error = true;
            }
        } while (error);

        sc.nextLine(); // buida "intro" per a poder llegir cadenes després
        return numero;
    }

    /**
     * Mostra un missatge per pantalla per a demanar un float per teclat
     *
     * @param missatge Text a mostrar.
     * @return el número introduït
     */
    public static float lligFloat(String missatge) {
        float numero;
        demana(missatge);
        numero = Teclat.lligFloat();

        return numero;
    }

    /**
     * Mostra un missatge per pantalla per a demanar un float per teclat que
     * tinga un límit inferior.
     *
     * @param missatge Text a mostrar.
     * @param min Valor mínim (inclòs).
     * @return el número introduït
     */
    public static float lligFloat(String missatge, float min) {
        float numero;
        demana(missatge);
        numero = Teclat.lligFloat();
        while (numero < min) {
            demana(missatge + " (mínim " + min + ")");
            numero = Teclat.lligFloat();
        }
        return numero;
    }

    /**
     * Mostra menú d'opcions i torna el número de l'opció triada per teclat.
     * Exemple d'ús: 
     *   int opcio = lligOpcio("AGENDA", "Altes", "Baixes", "Consultes");
     * @param titol Títol del menú
     * @param opcions Textos de les distintes opcions (en format d'arguments
     * variables). No es passarà opció d'eixir, ja que s'afegirà l'opció 0.
     * @return El número de l'opció triada (1, 2, 3... o 0 per a eixir)
     */
    public static int lligOpcio(String titol, String... opcions) {
        // Càlcul amplària del menú (per a les ratlletes)
        int lonMax = titol.length();
        for (String opcio : opcions) {
            if (opcio.length() > lonMax) {
                lonMax = opcio.length();
            }
        }
        lonMax += 5;

        // Títol del menú
        String trosset = repetix('=', (lonMax - (titol.length() + 2)) / 2);
        System.out.println(trosset + " " + titol + " " + trosset);

        // Mostrem les opcions
        for (int i = 0; i < opcions.length; i++) {
            System.out.println(" " + (i + 1) + ". " + opcions[i]);
        }
        System.out.println(repetix('-', lonMax));

        System.out.println(" 0. Eixir");
        System.out.println(repetix('=', lonMax));

        // Demanem opció correcta per teclat i la retornem
        int opcio = Teclat.lligInt("Opcio", 0, opcions.length);
        System.out.println("");
        return opcio;
    }

    /**
     * Retorna un caràcter repetit (cridat per funció lligOpcio)
     *
     * @param c Caràcter a repetir
     * @param vegades Quantitat de vegades a repetir el caràcter
     * @return cadena amb el caràcter repetit
     */
    private static String repetix(char c, int vegades) {
        String cadena = "";
        for (int i = 0; i < vegades; i++) {
            cadena += c;
        }
        return cadena;
    }

    /**
     * Mostra missatge de polsar <intro> per a seguir i neteja pantalla.
     */
    public static void intro() {
        titol("Polsa <intro> per a seguir");
        sc.nextLine();
        for (int i = 0; i < 20; i++) {
            System.out.println("");
        }
    }

    public static int[] lligInts(int n) {
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = Teclat.lligInt("Posició " + i);
        }
        return numeros;
    }

    public static float[] lligFloats(int n) {
        float[] numeros = new float[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = Teclat.lligFloat("Posició " + i);
        }
        return numeros;
    }

    public static String[] lligStrings(int n) {
        String[] cadenes = new String[n];
        for (int i = 0; i < n; i++) {
            cadenes[i] = Teclat.lligString("Posició " + i);
        }
        return cadenes;
    }

    public static char[] lligChars(int n) {
        char[] lletres = new char[n];
        for (int i = 0; i < n; i++) {
            lletres[i] = Teclat.lligChar("Posició " + i);
        }
        return lletres;
    }

}
