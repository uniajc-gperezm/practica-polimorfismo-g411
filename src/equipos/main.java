package equipos;

import ciclistas.*;
import equipos.*;

public class main {
    public static void main(String[] args) throws Exception {
        Equipo equipo1 = new Equipo();
        equipo1.setNombreEquipo("Ineos");
        equipo1.setPais("Italia");
        equipo1.setTiempoTotalEquipo(12);

        System.out.println("*******************\n");

        imprimirDatosEquipo(equipo1);
    }
    public static void imprimirDatosEquipo(Equipo equipo) {
        System.out.println("Nombre del equipo: " + equipo.getNombreEquipo());
        System.out.println("País: " + equipo.getPais());
        System.out.println("Tiempo total del equipo: " + equipo.getTiempoTotalEquipo() + " horas");
    }
    }

