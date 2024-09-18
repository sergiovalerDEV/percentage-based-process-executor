package procesador;

import acciones.Accion1;
import acciones.Accion2;

import java.util.ArrayList;
import java.util.Collections;

public class ProcesadorAcciones {

    public static void realizarAcciones(int nVeces) {

        int vecesAccion1 = (int) Math.ceil(nVeces * 0.25); //Calculamos las veces que se debe realizar acción1
        int vecesAccion2 = (nVeces - vecesAccion1); //Y acción2

        ArrayList<String> accionesTotales = new ArrayList<>();

        for (int i = 0; i < vecesAccion1; i++) { //Añadimos simbólicamente un texto que representa una acción
            accionesTotales.add("accion1"); //Lo añadimos a un array
        }

        for (int i = 0; i < vecesAccion2; i++) { //Lo mismo con acción2, x veces hasta completar el requerimiento
            accionesTotales.add("accion2");
        }

        Collections.shuffle(accionesTotales); //Mezclamos sus elementos aleatoriamente

        Accion1 accion1 = Accion1.getInstance(); //Ahora sí, obtenemos las instancias de las acciones reales
        Accion2 accion2 = Accion2.getInstance();

        for (String accion : accionesTotales) {
            if ("accion1".equals(accion)) { //Si el texto simbólico de la acción concuerda
                accion1.realizar(); //Ejecutamos la primera acción
            } else {
                accion2.realizar(); //Sino la segunda
            }
        }

        //De esta forma nos aseguramos de alcanzar siempre un porcentaje adecuado de acción1 y acción2
        //Con números aleatorios se simplificaría el problema, pero suele ser bastante inexacto
    }
}
