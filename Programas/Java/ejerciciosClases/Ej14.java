package ejerciciosClases;

import funciones.Teclat;

class Grupo {
    String codigo;
    Sesion horario[][] = new Sesion[6][5];

}

class Sesion {
    String asignatura;
    String profesor;
    String aula;

}

public class Ej14 {

    private static Grupo getGrupo(Grupo listaGrupos[], String codigo) {
        for (int i = 0; i < listaGrupos.length; i++) {

            if (listaGrupos[i].codigo.equals(codigo))
                return listaGrupos[i];
        }
        return null;
    }

    private static Grupo creaGrupo(Grupo listaGrupos[]) {
        String codigo = Teclat.lligString("Codigo del grupo: ");
        Grupo grupoEncontrado = getGrupo(listaGrupos, codigo);
        if (grupoEncontrado == null) {
            Grupo grupoCreado = new Grupo();
            for (int i = 0; i < grupoCreado.horario.length; i++) {
                for (int j = 0; j < grupoCreado.horario[i].length; j++) {
                    grupoCreado.horario[i][j].asignatura = Teclat
                            .lligString("Asignatura de la sesión del dia " + j + " y hora" + i);
                    grupoCreado.horario[i][j].aula = Teclat
                            .lligString("Aula de la sesión del dia " + j + " y hora" + i);
                    grupoCreado.horario[i][j].profesor = Teclat
                            .lligString("Profesor de la sesión del dia " + j + " y hora" + i);
                }

            }
            return grupoCreado;
        }
        return null;
    }

    private static void nostraHorari(Grupo listaGrupos[], String codigo, String opciones) {
        // continuare en otro momento
    }

    public static void main(String[] args) {

    }
}
